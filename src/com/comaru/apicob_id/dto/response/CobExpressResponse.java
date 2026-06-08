
package com.comaru.apicob_id.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CobExpressResponse {

	private Integer status_retorno;
	private String descricao;

	private List<InconsistenciaResponse> inconsistencias;
	private List<AvisoResponse> avisos;

	private DadosTituloResponse dados_titulo;
	private List<LancamentoResponse> lancamentos;

	private RegistroIFResponse registro_if;

	public Integer getStatus_retorno() {
		return status_retorno;
	}

	public String getDescricao() {
		return descricao;
	}

	public List<InconsistenciaResponse> getInconsistencias() {
		return inconsistencias;
	}

	public List<AvisoResponse> getAvisos() {
		return avisos;
	}

	public DadosTituloResponse getDados_titulo() {
		return dados_titulo;
	}

	public List<LancamentoResponse> getLancamentos() {
		return lancamentos;
	}

	public RegistroIFResponse getRegistro_if() {
		return registro_if;
	}

	public void setStatus_retorno(Integer status_retorno) {
		this.status_retorno = status_retorno;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setInconsistencias(List<InconsistenciaResponse> inconsistencias) {
		this.inconsistencias = inconsistencias;
	}

	public void setAvisos(List<AvisoResponse> avisos) {
		this.avisos = avisos;
	}

	public void setDados_titulo(DadosTituloResponse dados_titulo) {
		this.dados_titulo = dados_titulo;
	}

	public void setLancamentos(List<LancamentoResponse> lancamentos) {
		this.lancamentos = lancamentos;
	}

	public void setRegistro_if(RegistroIFResponse registro_if) {
		this.registro_if = registro_if;
	}

}