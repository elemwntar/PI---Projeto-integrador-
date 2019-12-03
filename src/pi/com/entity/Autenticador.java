package pi.com.entity;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Autenticador extends Pessoa {
	
	
	

	DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private String cnpj;
	
	public Autenticador( String datanasc) {
		super(datanasc);
		// TODO Auto-generated constructor stub
	}

	public int idAutenticador;
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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
