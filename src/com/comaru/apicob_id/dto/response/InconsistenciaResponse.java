package com.comaru.apicob_id.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InconsistenciaResponse {
    private String codigo_inconsistencia;
    private String mensagem;

    public String getCodigo_inconsistencia() {
        return codigo_inconsistencia;
    }

    public void setCodigo_inconsistencia(String codigo_inconsistencia) {
        this.codigo_inconsistencia = codigo_inconsistencia;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
