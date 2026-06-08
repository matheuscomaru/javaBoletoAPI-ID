package com.comaru.apicob_id.dto.request;

public class ConsultarBoletoRequest {

	private String token;
	private String id_boleto;

	public String getToken() {
		return token;
	}

	public String getId_boleto() {
		return id_boleto;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public void setId_boleto(String id_boleto) {
		this.id_boleto = id_boleto;
	}

}