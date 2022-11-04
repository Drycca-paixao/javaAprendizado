package pernasmultiplaescolha;

import java.util.Scanner;

public class PernasMultiplaEscolha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec = new Scanner(System.in);
		System.out.print("Quantas pernas?");
		int perna = tec.nextInt();
		String tipo;
		System.out.print("Isso é um(a) ");		
		switch (perna) {
		case 1:
			tipo = "Saci";
			break;
		case 2:
			tipo = "Bípede";
			break;
		case 3:
			tipo = "Tripé";
			break;
		case 4:
			tipo = "Quádrupede";
			break;
		case 6:
			tipo = "Aranha";
			break;
		case 8:
			tipo = "Aranha";
			break;
		default:
			tipo = "ET";
		}
		System.out.println(tipo);
	}

}
