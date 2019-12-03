package pi.com.rule;

public class Categoria {
	
	public String categoria;
	
	public String getNomeCategoria(int tipo) {
		
		if (tipo == 1)
			categoria ="Filme";
		else if (tipo == 2)
			categoria ="Livro";
		else if (tipo == 3)
			categoria ="palestra";
		else if (tipo == 4)
			categoria ="Visita Técnica";
		else if (tipo == 5)
			categoria ="Trabalho Voluntario";
		else
			categoria = "Outros";

		
		return categoria; 
	}
	
}
