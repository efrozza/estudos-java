
public class TestaFuncionario {
	public static void main(String[] args) {
		Gerente func = new Gerente();
		func.setNome("Everton");
		func.setSalario(1000);
		System.out.println(func.getNome());
		System.out.println(func.getBonificacao());
	}
}
