
public class TestaLacosEncadeados {
	public static void main(String[] args) {

		int i = 0;
		int j = 0;

		for (i = 1; i <= 10; i++) {
			System.out.println("Tabuada do " + i);
			for (j = 1; j <= 10; j++) {
				int resultado = i * j;
				System.out.println(i + " X " + j + " = " + resultado);
			}
		}
	}
}
