
public class TestePontoFlutuante {

	public static void main(String[] args) {
		double salario;
		salario = 7650.50;
		System.out.println("Mostrar o valor da vari�vel salario " + salario);

		// conta entre os dois inteiros vai retornar s� o inteiro
		int outraDivisao = 5 / 2;
		System.out.println(outraDivisao);
		
		// o java avalia o que est� depios do igual primeiro para depios atribuir, mesmo sendo double o resultado sera
		// 2.0
		double novaDivisao = 5 / 2;
		System.out.println(novaDivisao);

	}

}
