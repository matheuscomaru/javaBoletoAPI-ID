package com.comaru.apicob_id.dto.request;

import java.math.BigDecimal;
import java.util.List;

public class TituloRequest {

	private String ocorrencia_remessa;
	private String nosso_numero;
	private String numero_documento;

	private String data_emissao;
	private String data_vencimento;

	private String valor_documento;

	private String especie_documento;

	private String tipo_protesto_negativacao;
	private String prazo_protesto_negativacao;

	private BigDecimal percentual_juros;
	private BigDecimal valor_juros;

	private BigDecimal percentual_multa;

	private BigDecimal valor_desconto_1;
	private String data_limite_desconto_1;

	private BigDecimal valor_abatimento;

	private String codigo_pagador;

	private String tipo_inscricao_pagador;
	private String inscricao_pagador;

	private String nome_pagador;

	private String logradouro_pagador;
	private String numero_logradouro_pagador;
	private String complemento_logradouro_pagador;

	private String cep_pagador;
	private String bairro_pagador;
	private String municipio_pagador;
	private String uf_pagador;

	private String endereco_eletronico_pagador;

	private List<String> linhas_mensagem;

	public String getOcorrencia_remessa() {
		return ocorrencia_remessa;
	}

	public String getNosso_numero() {
		return nosso_numero;
	}

	public String getNumero_documento() {
		return numero_documento;
	}

	public String getData_emissao() {
		return data_emissao;
	}

	public String getData_vencimento() {
		return data_vencimento;
	}

	public String getValor_documento() {
		return valor_documento;
	}

	public String getEspecie_documento() {
		return especie_documento;
	}

	public String getTipo_protesto_negativacao() {
		return tipo_protesto_negativacao;
	}

	public String getPrazo_protesto_negativacao() {
		return prazo_protesto_negativacao;
	}

	public BigDecimal getPercentual_juros() {
		return percentual_juros;
	}

	public BigDecimal getValor_juros() {
		return valor_juros;
	}

	public BigDecimal getPercentual_multa() {
		return percentual_multa;
	}

	public BigDecimal getValor_desconto_1() {
		return valor_desconto_1;
	}

	public String getData_limite_desconto_1() {
		return data_limite_desconto_1;
	}

	public BigDecimal getValor_abatimento() {
		return valor_abatimento;
	}

	public String getCodigo_pagador() {
		return codigo_pagador;
	}

	public String getTipo_inscricao_pagador() {
		return tipo_inscricao_pagador;
	}

	public String getInscricao_pagador() {
		return inscricao_pagador;
	}

	public String getNome_pagador() {
		return nome_pagador;
	}

	public String getLogradouro_pagador() {
		return logradouro_pagador;
	}

	public String getNumero_logradouro_pagador() {
		return numero_logradouro_pagador;
	}

	public String getComplemento_logradouro_pagador() {
		return complemento_logradouro_pagador;
	}

	public String getCep_pagador() {
		return cep_pagador;
	}

	public String getBairro_pagador() {
		return bairro_pagador;
	}

	public String getMunicipio_pagador() {
		return municipio_pagador;
	}

	public String getUf_pagador() {
		return uf_pagador;
	}

	public String getEndereco_eletronico_pagador() {
		return endereco_eletronico_pagador;
	}

	public List<String> getLinhas_mensagem() {
		return linhas_mensagem;
	}

	public void setOcorrencia_remessa(String ocorrencia_remessa) {
		this.ocorrencia_remessa = ocorrencia_remessa;
	}

	public void setNosso_numero(String nosso_numero) {
		this.nosso_numero = nosso_numero;
	}

	public void setNumero_documento(String numero_documento) {
		this.numero_documento = numero_documento;
	}

	public void setData_emissao(String data_emissao) {
		this.data_emissao = data_emissao;
	}

	public void setData_vencimento(String data_vencimento) {
		this.data_vencimento = data_vencimento;
	}

	public void setValor_documento(String valor_documento) {
		this.valor_documento = valor_documento;
	}

	public void setEspecie_documento(String especie_documento) {
		this.especie_documento = especie_documento;
	}

	public void setTipo_protesto_negativacao(String tipo_protesto_negativacao) {
		this.tipo_protesto_negativacao = tipo_protesto_negativacao;
	}

	public void setPrazo_protesto_negativacao(String prazo_protesto_negativacao) {
		this.prazo_protesto_negativacao = prazo_protesto_negativacao;
	}

	public void setPercentual_juros(BigDecimal percentual_juros) {
		this.percentual_juros = percentual_juros;
	}

	public void setValor_juros(BigDecimal valor_juros) {
		this.valor_juros = valor_juros;
	}

	public void setPercentual_multa(BigDecimal percentual_multa) {
		this.percentual_multa = percentual_multa;
	}

	public void setValor_desconto_1(BigDecimal valor_desconto_1) {
		this.valor_desconto_1 = valor_desconto_1;
	}

	public void setData_limite_desconto_1(String data_limite_desconto_1) {
		this.data_limite_desconto_1 = data_limite_desconto_1;
	}

	public void setValor_abatimento(BigDecimal valor_abatimento) {
		this.valor_abatimento = valor_abatimento;
	}

	public void setCodigo_pagador(String codigo_pagador) {
		this.codigo_pagador = codigo_pagador;
	}

	public void setTipo_inscricao_pagador(String tipo_inscricao_pagador) {
		this.tipo_inscricao_pagador = tipo_inscricao_pagador;
	}

	public void setInscricao_pagador(String inscricao_pagador) {
		this.inscricao_pagador = inscricao_pagador;
	}

	public void setNome_pagador(String nome_pagador) {
		this.nome_pagador = nome_pagador;
	}

	public void setLogradouro_pagador(String logradouro_pagador) {
		this.logradouro_pagador = logradouro_pagador;
	}

	public void setNumero_logradouro_pagador(String numero_logradouro_pagador) {
		this.numero_logradouro_pagador = numero_logradouro_pagador;
	}

	public void setComplemento_logradouro_pagador(String complemento_logradouro_pagador) {
		this.complemento_logradouro_pagador = complemento_logradouro_pagador;
	}

	public void setCep_pagador(String cep_pagador) {
		this.cep_pagador = cep_pagador;
	}

	public void setBairro_pagador(String bairro_pagador) {
		this.bairro_pagador = bairro_pagador;
	}

	public void setMunicipio_pagador(String municipio_pagador) {
		this.municipio_pagador = municipio_pagador;
	}

	public void setUf_pagador(String uf_pagador) {
		this.uf_pagador = uf_pagador;
	}

	public void setEndereco_eletronico_pagador(String endereco_eletronico_pagador) {
		this.endereco_eletronico_pagador = endereco_eletronico_pagador;
	}

	public void setLinhas_mensagem(List<String> linhas_mensagem) {
		this.linhas_mensagem = linhas_mensagem;
	}

}