package com.comaru.apicob_id.dto.request;

public class EnviarBoletoRequest {

	private String token;
	private TituloRequest titulo;

	public String getToken() {
		return token;
	}

	public TituloRequest getTitulo() {
		return titulo;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public void setTitulo(TituloRequest titulo) {
		this.titulo = titulo;
	}

}