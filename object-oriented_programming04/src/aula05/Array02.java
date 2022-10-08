package aula05;

public class Array02 {
	public static void main(String[] args) {
		//Criar um array com 10
		int numeroMaior = 0;
		int maior[] = new int[10];
		
		maior[0] = 2000;
		maior[1] = 20;
		maior[2] = 5;
		maior[3] = 68;
		maior[4] = 34;
		maior[5] = 13;
		maior[6] = 550;
		maior[7] = 67;
		maior[8] = 12;
		maior[9] = 30;
		
		
		for (int i = 0; i <= 9; i++) {
			if (maior[i] > numeroMaior) {
				numeroMaior = maior[i];
			}
		}
		
		System.out.println(numeroMaior);
	}
}