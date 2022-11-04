package exerciciodois;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int i = t.nextInt();		
		if (i % 2 == 0){
			System.out.println(" É Par");
		} else {
			System.out.println(" É Ímpar");
		}

	}

}
