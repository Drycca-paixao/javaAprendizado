package comparacaostring;

public class ComparacaoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String nome1 = "Gustavo";
		String nome2 = "Gustavo";
		String nome3 = new String("Gustavo");
		String res;
		res = (nome1==nome2)?"igual":"diferente";
		System.out.println(res);*/
		
		String nome1 = "Gustavo";
		String nome2 = "Gustavo";
		String nome3 = new String("Gustavo");
		String res;
		res = (nome1.equals(nome3))?"igual":"diferente";
		System.out.println(res);
	}

}
