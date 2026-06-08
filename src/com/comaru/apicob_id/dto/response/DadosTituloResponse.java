package com.comaru.apicob_id.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DadosTituloResponse {
    private String codigo_barras;
    private String linha_digitavel;
    private String nosso_numero;
    private String numero_documento;
    private String data_vencimento;
    private String valor_documento;
    private String especie_documento;
    private String valor_abatimento;
    private String data_desconto_1;
    private String valor_desconto_1;
    private String tipo_protesto_negativacao;
    private String prazo_protesto_negativacao;
    private String valor_juros;
    private String percentual_juros;
    private String percentual_multa;
    private String codigo_situacao;
    private String descricao_situacao;
    private String id_boleto;

    public String getCodigo_barras() {
        return codigo_barras;
    }

    public String getLinha_digitavel() {
        return linha_digitavel;
    }

    public String getNosso_numero() {
        return nosso_numero;
    }

    public String getNumero_documento() {
        return numero_documento;
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

    public String getValor_abatimento() {
        return valor_abatimento;
    }

    public String getData_desconto_1() {
        return data_desconto_1;
    }

    public String getValor_desconto_1() {
        return valor_desconto_1;
    }

    public String getTipo_protesto_negativacao() {
        return tipo_protesto_negativacao;
    }

    public String getPrazo_protesto_negativacao() {
        return prazo_protesto_negativacao;
    }

    public String getValor_juros() {
        return valor_juros;
    }

    public String getPercentual_juros() {
        return percentual_juros;
    }

    public String getPercentual_multa() {
        return percentual_multa;
    }

    public String getCodigo_situacao() {
        return codigo_situacao;
    }

    public String getDescricao_situacao() {
        return descricao_situacao;
    }

    public String getId_boleto() {
        return id_boleto;
    }

    public void setCodigo_barras(String codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    public void setLinha_digitavel(String linha_digitavel) {
        this.linha_digitavel = linha_digitavel;
    }

    public void setNosso_numero(String nosso_numero) {
        this.nosso_numero = nosso_numero;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
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

    public void setValor_abatimento(String valor_abatimento) {
        this.valor_abatimento = valor_abatimento;
    }

    public void setData_desconto_1(String data_desconto_1) {
        this.data_desconto_1 = data_desconto_1;
    }

    public void setValor_desconto_1(String valor_desconto_1) {
        this.valor_desconto_1 = valor_desconto_1;
    }

    public void setTipo_protesto_negativacao(String tipo_protesto_negativacao) {
        this.tipo_protesto_negativacao = tipo_protesto_negativacao;
    }

    public void setPrazo_protesto_negativacao(String prazo_protesto_negativacao) {
        this.prazo_protesto_negativacao = prazo_protesto_negativacao;
    }

    public void setValor_juros(String valor_juros) {
        this.valor_juros = valor_juros;
    }

    public void setPercentual_juros(String percentual_juros) {
        this.percentual_juros = percentual_juros;
    }

    public void setPercentual_multa(String percentual_multa) {
        this.percentual_multa = percentual_multa;
    }

    public void setCodigo_situacao(String codigo_situacao) {
        this.codigo_situacao = codigo_situacao;
    }

    public void setDescricao_situacao(String descricao_situacao) {
        this.descricao_situacao = descricao_situacao;
    }

    public void setId_boleto(String id_boleto) {
        this.id_boleto = id_boleto;
    }
}
