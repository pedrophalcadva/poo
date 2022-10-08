package aula05;

public class Pessoa {
	
	String nome;
	int idade;
	String email;
	
	public static void main(String args[]) {
		
		Pessoa listaPessoas[] = new Pessoa[3];
		
		listaPessoas[0] = new Pessoa();
		listaPessoas[0].nome = "Fulano";
		listaPessoas[0].idade = 20;
		listaPessoas[0].email = "fulano@teste.com.br";
		
		listaPessoas[1] = new Pessoa();
		listaPessoas[1].nome = "Beltrano";
		listaPessoas[1].idade = 35;
		listaPessoas[1].email = "beltano@teste.com.br";
listaPessoas[2] = new Pessoa();
		listaPessoas[2].nome = "Sicrano";
		listaPessoas[2].idade = 42;
		listaPessoas[2].email = "sicrano@teste.com.br";
		
		int i = 0;
		
		while (i <= 2) {
			System.out.println("Dados da pessoa " + (i+1) + ": ");
			System.out.println("\t" + listaPessoas[i].nome);
			System.out.println("\t" + listaPessoas[i].idade);
			System.out.println("\t" + listaPessoas[i].email);
			i++;
		}
		
	}
	
}

