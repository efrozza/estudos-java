
public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		func.setNome("Everton");
		func.setSalario(1000);
		System.out.println(func.getNome());
		System.out.println(func.getBonificacao());
	}
}
