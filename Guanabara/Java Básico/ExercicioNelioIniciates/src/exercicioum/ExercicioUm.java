package exercicioum;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		int n = t.nextInt();		
		if (n<=0){
			System.out.println("Negativo");
		} else {
			System.out.println("N�o Negativo");
		}

	}

}
