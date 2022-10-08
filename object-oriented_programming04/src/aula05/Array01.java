package aula05;

public class Array01 {
	
	public static void main (String[] args) {
		String nomes[] = new String[4];
		
		nomes[0] = "Aline";
		nomes[1] = "Thais";
		nomes[2] = "Alice";
		nomes[3] = "Mileena";
		
		for (int i = 0; i <=3; i++) {
			System.out.println("Na posição " + i + " o valor e: " + nomes[i]);
		}
	}
}
