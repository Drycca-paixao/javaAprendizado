package sistemadevotacao;

import java.util.Scanner;

public class SistemaDeVotacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		System.out.print("Digite seu ano de nescimento: ");
		int nasc = t.nextInt();
		int i = 2022-nasc;
		System.out.println("Sua idade é: " + i);
		if (i<16){
			System.out.println("Não Vota!");
		} else if((i>=16 && i<18) || (i>70)) {
			System.out.println("Voto Opcional!");
		} else {
			System.out.print("Voto Obrigatório");
			}
		}
}
