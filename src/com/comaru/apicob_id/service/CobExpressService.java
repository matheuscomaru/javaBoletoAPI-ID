package com.comaru.apicob_id.service;

import com.comaru.apicob_id.App;
import com.comaru.apicob_id.client.CobExpressClient;
import com.comaru.apicob_id.dto.request.ConsultarBoletoRequest;
import com.comaru.apicob_id.dto.request.EnviarBoletoRequest;
import com.comaru.apicob_id.dto.request.TituloRequest;
import com.comaru.apicob_id.dto.response.CobExpressResponse;

public class CobExpressService {
	// URLs will be montadas dinamicamente a partir das configs

	public CobExpressResponse consultarBoleto(String idBoleto, String chaveGeral, String chaveConta) throws Exception {
		String token = jwtService.gerarToken(chaveGeral, chaveConta);
		ConsultarBoletoRequest request = new ConsultarBoletoRequest();
		request.setToken(token);
		request.setId_boleto(idBoleto);
		return client.consultarBoleto(request);
	}

	private final JwtService jwtService = new JwtService();

	private final CobExpressClient client = new CobExpressClient();

	private String getEnviarUrl() {
		if (App.mode != null && App.mode.equalsIgnoreCase("producao")) {
			if (App.singular != null && !App.singular.trim().isEmpty()) {
				return "https://" + App.singular.trim() + ".cobexpress.com.br/webservice/enviar-boleto";
			}
		}
		return "https://homologa-ws.cobexpress.com.br/webservice/enviar-boleto";
	}

	public CobExpressResponse enviar(TituloRequest titulo, String chaveGeral, String chaveConta) throws Exception {
		String token = jwtService.gerarToken(chaveGeral, chaveConta);
		EnviarBoletoRequest request = new EnviarBoletoRequest();
		request.setToken(token);
		request.setTitulo(titulo);
		// O método post agora retorna o primeiro elemento do array
		String url = getEnviarUrl();
		return client.post(url, request, CobExpressResponse.class);
	}
}