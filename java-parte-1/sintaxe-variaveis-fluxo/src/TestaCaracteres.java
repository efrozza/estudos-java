
public class TestaCaracteres {
	public static void main(String args[]) {
		char letra = 'a';
		System.out.println(letra);
		
		//tabela unicode
		char valor = 66;
		System.out.println(valor);
		
		// vai avan�ar +1 na tabela unicode
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		String palavra = "alura cursos online de tecnologia ";
		System.out.println(palavra);
		
		palavra += 2020;
		System.out.println(palavra);
	}
}
