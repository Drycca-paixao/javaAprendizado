package exerciciodois;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		int i = t.nextInt();		
		if (i % 2 == 0){
			System.out.println(" � Par");
		} else {
			System.out.println(" � �mpar");
		}

	}

}
