package aula06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		int x;
		Scanner leitor = new Scanner(System.in);
		try {
		System.out.println("Digite um número inteiro: ");
		x = leitor.nextInt();
		System.out.println("Você digitou: " + x);
		leitor.close();
	}
		
	catch (InputMismatchException IME) {
		System.out.println("O Valor informado não é um inteiro!");
		}
	}
	
}