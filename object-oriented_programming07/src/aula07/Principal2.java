package aula07;

public class Principal2 {
	
	public static void main(String[] args) {
		
		Aluno a = new Aluno();
		Professor p = new Professor();
		
		// Aluno
		a.nome = "Alberto Andrade";
		a.cpf = "1234567879-00";
		a.ra = 999888777;
		a.curso = "TADS";
		
		// Professor
		p.nome = "Beatriz Bernardes";
		p.cpf = "987654321-00";
		p.matricula = 111222;
		p.salario = 4500;
// Dados Aluno
		System.out.println("Aluno: ");
		System.out.println(a.dadosPessoa());
		
		// Dados Professor
		System.out.println("Professor: ");
		System.out.println(p.dadosPessoa());
				
	}

}