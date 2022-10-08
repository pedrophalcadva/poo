package aula04;
import java.util.Scanner;
public class Valores {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Infomre um valor inteiro: ");
		int a = tec.nextInt();
		
		switch (a) {
		case 0:
			System.out.println("A Variável a recebeu o valor 0");
		break;
		case 1:
			System.out.println("A variável a recebeu o valor 1");
		break;
		case 2:
			System.out.println("A variável a recebeu o valor 2");
		break;
		default:
			System.out.println("A variável a recebeu um diferente de 0, 1, 2");
		}
	}
}
