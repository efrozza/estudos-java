
public class TestaLacoBreak {
	public static void main(String[] args) {
		int linha = 0;
		int coluna = 0;
		
		for (linha = 0; linha < 10; linha++) {
			for (coluna = 0; coluna <= linha; coluna ++) {
				/*if  (coluna > linha) {
					break;
				}*/
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
