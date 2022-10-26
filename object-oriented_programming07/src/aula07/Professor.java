package aula07;

public class Professor extends Pessoa{
	int matricula;
	float salario;
	
	@Override
	public String dadosPessoa() {
		String dados;
		dados = super.dadosPessoa();
		dados += "Matrícula: " + matricula + "\n";
		dados += "Salário: " + salario + "\n";
		return dados;
	}

}