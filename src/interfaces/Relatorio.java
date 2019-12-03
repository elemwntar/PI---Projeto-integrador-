package interfaces;

import java.util.ArrayList;

import pi.com.entity.Atividade;
import pi.com.entity.Autenticador;
import pi.com.entity.Estudante;
import pi.com.entity.Pessoa;

public class Relatorio {

	public void imprimaRelatorios(Pessoa p) {

		System.out.println("\nRelatório ****** ");
		System.out.println("Nome Estudante: " + p.getNome());

		if (p instanceof Estudante) {

			ArrayList<Atividade> lista = p.getAtividade();
			if (lista.size() > 0) {

				for (Atividade tmp : lista) {
					System.out.println("****** ");
					System.out.println("Nome da atividade: " + tmp.getNomeAtividade() + "\nDescrição: "
							+ tmp.getDescricao() + "\nDuração: " + tmp.getDuracao() + "\nData de conclusao: "
							+ tmp.getDataCadastro() + tmp.getdataAvaliacao()
							+ "Estado da Atividade:" + tmp.getState());
				}
			} else {
				System.out.println("Nenhuma Atividade cadastrada!");
			}
		}

		if (p instanceof Autenticador) {

			ArrayList<Atividade> lista = p.getAtividade();
			if (lista.size() > 0) {

				for (Atividade tmp : lista) {
					System.out.println("****** ");
					System.out.println("Nome da atividade: " + tmp.getNomeAtividade() + "\nDescrição: "
							+ tmp.getDescricao() + "\nDuração: " + tmp.getDuracao()+ "\nData de Aprovacao: " + tmp.getDataAprovacao()
							+ "Estado da Atividade:" + tmp.getState());
				}
			} else {
				System.out.println("Nenhuma Atividade cadastrada!");
			}
		}

	}

}
