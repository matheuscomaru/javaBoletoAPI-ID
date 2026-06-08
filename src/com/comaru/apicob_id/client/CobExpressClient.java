package com.comaru.apicob_id.client;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.comaru.apicob_id.App;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CobExpressClient {
	private String getConsultaUrl() {

		if (App.mode != null && App.mode.equalsIgnoreCase("producao")) {

			if (App.singular != null && !App.singular.trim().isEmpty()) {
				return "https://" + App.singular.trim() + ".cobexpress.com.br/webservice/consultar-boleto";
			}
		}
		return "https://homologa-ws.cobexpress.com.br/webservice/consultar-boleto";
	}

	public com.comaru.apicob_id.dto.response.CobExpressResponse consultarBoleto(
			com.comaru.apicob_id.dto.request.ConsultarBoletoRequest request) throws Exception {
		return post(getConsultaUrl(), request, com.comaru.apicob_id.dto.response.CobExpressResponse.class);
	}

	private final HttpClient client = HttpClient.newHttpClient();

	private final ObjectMapper mapper = new ObjectMapper();

	public <T> T post(String url, Object body, Class<T> responseClass) throws Exception {
		String json = mapper.writeValueAsString(body);
		System.out.println("[DEBUG] Enviando requisição para URL: " + url);
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).header("Content-Type", "application/json")
				.POST(HttpRequest.BodyPublishers.ofString(json)).build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

		// Geração de arquivos Remessa e Retorno
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss_SSS");
		String timestamp = LocalDateTime.now().format(formatter);
		String remessaPath = "API/Remessas/remessa_" + timestamp + ".json";
		String retornoPath = "API/Retornos/retorno_" + timestamp + ".json";
		try {
			Files.write(Paths.get(remessaPath), json.getBytes(), StandardOpenOption.CREATE);
		} catch (Exception ex) {
			System.err.println("[ERRO] Falha ao salvar arquivo de remessa: " + ex.getMessage());
		}
		try {
			Files.write(Paths.get(retornoPath), response.body().getBytes(), StandardOpenOption.CREATE);
		} catch (Exception ex) {
			System.err.println("[ERRO] Falha ao salvar arquivo de retorno: " + ex.getMessage());
		}

		// Debug: imprimir o corpo da resposta para análise
		System.out.println("[DEBUG] Corpo da resposta da API:");
		System.out.println(response.body());

		// Se o responseClass for CobExpressResponse.class, desserializar como array e
		// retornar o primeiro elemento
		if (responseClass.getSimpleName().equals("CobExpressResponse")) {
			com.comaru.apicob_id.dto.response.CobExpressResponse[] arr = mapper.readValue(response.body(),
					com.comaru.apicob_id.dto.response.CobExpressResponse[].class);
			if (arr.length > 0) {
				return responseClass.cast(arr[0]);
			} else {
				return null;
			}
		}
		return mapper.readValue(response.body(), responseClass);
	}
}