package pi.com.entity;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Atividade {

	private String descricao;
	private double duracao;
	private String dataCadastro;
	private EstadoAtividade state;
	private String nomeAtividade;
	private String dataAvaliacao;
	
	DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	

	public Atividade(EstadoAtividade state, String dataCadastro, double duracao) {
		this.state = state;
		this.descricao = "";
		this.dataCadastro = dataCadastro;
		this.duracao = duracao;
	}
	public void setNomeAtividade(String nomeAtividade) {
		this.nomeAtividade = nomeAtividade;
	}
	public String getNomeAtividade() {
		return nomeAtividade;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	public EstadoAtividade getState() {
		return state;
	}

	public void setState(EstadoAtividade state) {
		this.state = state;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
		state = EstadoAtividade.ESP;
	}
	public LocalDate getDataCadastro() {
		LocalDate dataFormatada = LocalDate.parse(dataCadastro, formato);
		return dataFormatada;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setDataAvaliacao(String dataAvaliacao) {
		this.dataAvaliacao = dataAvaliacao;
		state = EstadoAtividade.VAL;
	}
	public LocalDate getDataAvaliacao() {
		LocalDate dataFormatada = LocalDate.parse(dataAvaliacao, formato);
		return dataFormatada;
	}

	

}
