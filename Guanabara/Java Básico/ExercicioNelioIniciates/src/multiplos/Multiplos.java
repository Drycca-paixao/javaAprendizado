package multiplos;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int A = a.nextInt();
		System.out.print("Digite o segundo número: ");
		int B = a.nextInt();
		
		if(A%B==0||B%A==0){
			System.out.println("São Múltiplos");
		} else {
			System.out.println("Não são Múltiplos");
		}
		
		a.close();
		

	}

}
