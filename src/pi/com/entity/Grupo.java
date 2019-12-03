package pi.com.entity;

import java.time.LocalDate;
import java.util.ArrayList;

public class Grupo {

	public String nomeGrupo;
	public LocalDate dataCriacao;
	public ArrayList<Estudante> estudantes;
	public ArrayList<Autenticador> autenticador;

	public String getNomeGrupo() {
		return nomeGrupo;
	}

	public void setNomeGrupo(String nomeGrupo) {
		this.nomeGrupo = nomeGrupo;
	}

	public LocalDate getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public ArrayList<Estudante> getEstudantes() {
		return estudantes;
	}

	public void addEstudantes(ArrayList<Estudante> estudantes) {
		this.estudantes = estudantes;
	}

	public ArrayList<Autenticador> getAutenticador() {
		return autenticador;
	}

	public void addAutenticador(ArrayList<Autenticador> autenticador) {
		this.autenticador = autenticador;
	}

	public boolean controleAcesso(Pessoa p) {
		boolean flag = false;

		if (p instanceof Estudante)
			flag = false;
		if (p instanceof Autenticador)
			flag = true;

		return flag;
	}
	public class Participantes {
		Estudante[] estudantes;
		Autenticador[] autenticadores;

	}

}
