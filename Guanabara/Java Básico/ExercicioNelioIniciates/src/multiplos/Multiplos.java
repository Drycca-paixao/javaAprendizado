package multiplos;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		int A = a.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		int B = a.nextInt();
		
		if(A%B==0||B%A==0){
			System.out.println("S�o M�ltiplos");
		} else {
			System.out.println("N�o s�o M�ltiplos");
		}
		
		a.close();
		

	}

}
