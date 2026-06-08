package com.comaru.apicob_id;

import com.comaru.apicob_id.dto.request.TituloRequest;
import com.comaru.apicob_id.dto.response.CobExpressResponse;
import com.comaru.apicob_id.service.CobExpressService;

public class App {

	public static String chaveGeral = "f096f110d687f999537b70c8d4d11ec8";
	public static String chaveConta = "86621b3d37ede3769fc19063a37696ea";
	public static String mode = "homologacao"; // ou "producao"
	public static String singular = "";

	public static void main(String[] args) {

		gerarBoleto();
		consultarBoleto("id_boleto_aqui");

	}

	protected static void gerarBoleto() {

		TituloRequest titulo = new TituloRequest();
		titulo.setOcorrencia_remessa("1");
		titulo.setNumero_documento("000001");
		titulo.setData_emissao("2026-06-08");
		titulo.setData_vencimento("2026-07-08");
		titulo.setValor_documento("10.00");
		titulo.setEspecie_documento("02");
		titulo.setTipo_protesto_negativacao("0");
		titulo.setCodigo_pagador("000001");
		titulo.setTipo_inscricao_pagador("2"); // 1: CPF, 2: CNPJ
		titulo.setInscricao_pagador("00000000000000");
		titulo.setNome_pagador("FULANO DE TAL");
		titulo.setLogradouro_pagador("RUA EXEMPLO");
		titulo.setNumero_logradouro_pagador("123");
		titulo.setCep_pagador("78000000");
		titulo.setBairro_pagador("BAIRRO EXEMPLO");
		titulo.setMunicipio_pagador("BAIRRO EXEMPLO");
		titulo.setUf_pagador("MT");

		CobExpressService service = new CobExpressService();

		CobExpressResponse response = null;

		try {
			response = service.enviar(titulo, chaveGeral, chaveConta);
			System.out.println("response: " + response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected static void consultarBoleto(String idBoleto) {

		CobExpressService service = new CobExpressService();

		try {

			CobExpressResponse response = service.consultarBoleto(idBoleto, chaveGeral, chaveConta);

			if (response != null) {
				System.out
						.println("Status: " + response.getStatus_retorno() + "\nDescrição: " + response.getDescricao());

			}
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("Erro ao consultar boleto: " + ex.getMessage());
		}

	}
}
