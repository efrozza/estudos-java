
public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Gerente g1");
		g1.setCpf("1231312");
		g1.setSalario(5000.0);
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(123);
		
		// metodo autentica est� apenas no gerente
		boolean autenticou = g1.autentica(123);
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());

	}

}
