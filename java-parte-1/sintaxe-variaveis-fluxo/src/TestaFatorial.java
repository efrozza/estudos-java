
public class TestaFatorial {
	public static void main(String[] args) {
		int n = 0;
		int fatorial = 1;
		
		for (n = 1; n <= 10 ; n++) {
			int resultado = 0;
			for (fatorial = 1; fatorial <= n; fatorial++) {
				resultado += fatorial * n;
			}
			System.out.println(resultado);
		}
	}
}
