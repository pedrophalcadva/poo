package aula5a;

import java.util.ArrayList;

public class Listas {
	public static void main(String[] args) {
		ArrayList<Pessoa> listaPessoas = new ArrayList<>();
		
		Pessoa pessoaLocal0 = new Pessoa();
		pessoaLocal0.nome = "Fulano";
		pessoaLocal0.idade = 20;
		pessoaLocal0.email = "fulano@teste.com";
		
		listaPessoas.add(pessoaLocal0);
		
		Pessoa pessoaLocal1 = new Pessoa();
		pessoaLocal1.nome = "Beltrano";
		pessoaLocal1.idade = 25;
		pessoaLocal1.email = "beltrano@teste.com";
		
		listaPessoas.add(pessoaLocal1);
		
		Pessoa pessoaLocal2 = new Pessoa();
		pessoaLocal2.nome = "Sicrano";
		pessoaLocal2.idade = 30;
		pessoaLocal2.email = "sicrano@teste.com";
		
		listaPessoas.add(pessoaLocal2);
		
		int posicaoRemovida = -1;
		for (int j = 0; j < listaPessoas.size(); j++) {
			if (listaPessoas.get(j).nome.equals("Beltrano")) {
				posicaoRemovida = j;
				break;
			}
		}
if (posicaoRemovida != -1) {
			listaPessoas.remove(posicaoRemovida);
			System.out.println("O Beltrano estava na posição " + posicaoRemovida);
		}
		
		System.out.println("Imprimindo os nomes da lista atualizada: ");
		
		for (int k = 0; k < listaPessoas.size(); k++) {
			System.out.println(k + " - " + listaPessoas.get(k).nome);
		}
	
/*		for (int i = 0; i < listaPessoas.size(); i++) {
			System.out.println("Imprimindo dados da posição: " + i);
			System.out.println("Nome: " + listaPessoas.ge
		*/
	}
}
