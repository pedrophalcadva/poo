package pacote2;

import pacote1.Teste1;

public class Teste2 extends pacote1.Teste1 {

	public static void main(String args[]) {
		
		Teste1 t1 = new Teste1();
		
		t1.a = 10;
		t1.b = 20;
		
		System.out.println("O valor de a é: " + t1.a);
		System.out.println("O valor de b é: " + t1.b);
		
		}
	}

