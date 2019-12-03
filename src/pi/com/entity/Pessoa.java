package pi.com.entity;

import java.util.ArrayList;

import interfaces.MetodosPessoa;

public abstract class Pessoa implements MetodosPessoa {

	protected String nome;
	protected String email;
	protected String dataNasc;
	protected String celular;
	private ArrayList<Atividade> listaDeAtividades = new ArrayList<Atividade>();
	
	public Pessoa(String datanasc) {
		this.dataNasc = datanasc;
				
	}

	
	public void adiconaAtividade(Atividade atividades) {

		this.listaDeAtividades.add(atividades);
	}

	public ArrayList<Atividade> getAtividade() {

		return this.listaDeAtividades;
	}
}
