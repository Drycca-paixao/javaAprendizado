package vetor05;

import java.util.Arrays;

public class Vetor05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vet[] = {3, 7, 6, 1, 9, 4, 2};
		for(int v:vet) {
			System.out.print(v + " ");
		}
		System.out.println("");
		int p = Arrays.binarySearch(vet, 1);
		System.out.println("Encontrei o valor na posi��o " + p);

	}

}
