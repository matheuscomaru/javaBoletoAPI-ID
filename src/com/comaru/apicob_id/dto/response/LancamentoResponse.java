package com.comaru.apicob_id.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LancamentoResponse {

    private String tipo_lancamento;
    private String data_lancamento;
    private String valor_lancamento;

    public String getTipo_lancamento() {
        return tipo_lancamento;
    }

    public String getData_lancamento() {
        return data_lancamento;
    }

    public String getValor_lancamento() {
        return valor_lancamento;
    }

    public void setTipo_lancamento(String tipo_lancamento) {
        this.tipo_lancamento = tipo_lancamento;
    }

    public void setData_lancamento(String data_lancamento) {
        this.data_lancamento = data_lancamento;
    }

    public void setValor_lancamento(String valor_lancamento) {
        this.valor_lancamento = valor_lancamento;
    }

}
