package pi.com.entity;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Estudante extends Pessoa {
	

	DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private String cpf;
	private int idEtudante;
	
	public Estudante(String datanasc) {
		super(datanasc);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void setIdade(String a) {
		this.dataNasc = a;

	}

	@Override
	public void setNome(String a) {
		super.nome = a;

	}

	@Override
	public String getNome() {
		return super.nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public void setEmail(String a) {
		super.email = a;

	}

	@Override
	public String getEmail() {
		return super.email;
	}

	@Override
	public String getCelular() {
		// TODO Auto-generated method stub
		return super.celular;
	}

	@Override
	public void setCelular(String a) {
		super.celular = a;

	}
	

	public int getIdEtudante() {
		return idEtudante;
	}


	public void setIdEtudante(int idEtudante) {
		this.idEtudante = idEtudante;
	}


	@Override
	public void EditarNome() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public int getIdade() {
		
		LocalDate dataFormatada = LocalDate.parse(dataNasc, formato);
		LocalDate now = LocalDate.now();
		Period per = Period.between(dataFormatada, now);

		return per.getYears();

	}
}
