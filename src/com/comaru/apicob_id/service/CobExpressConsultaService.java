package com.comaru.apicob_id.service;

import com.comaru.apicob_id.client.CobExpressClient;
import com.comaru.apicob_id.dto.request.ConsultarBoletoRequest;
import com.comaru.apicob_id.dto.response.CobExpressResponse;

public class CobExpressConsultaService {

	private final JwtService jwtService = new JwtService();

	private final CobExpressClient client = new CobExpressClient();

	private final String url = "https://homologa-ws.cobexpress.com.br/webservice/consultar-boleto";

	public CobExpressResponse consultar(String idBoleto, String chaveGeral, String chaveConta) throws Exception {

		String token = jwtService.gerarToken(chaveGeral, chaveConta);

		ConsultarBoletoRequest req = new ConsultarBoletoRequest();

		req.setToken(token);
		req.setId_boleto(idBoleto);

		return client.post(url, req, CobExpressResponse.class);
	}
}