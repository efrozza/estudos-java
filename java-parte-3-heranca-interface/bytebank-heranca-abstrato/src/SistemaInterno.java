
public class SistemaInterno {

	private int senha = 123;

	public void autentica(Autenticavel funcionarioAutenticavel) {
		boolean autenticou = funcionarioAutenticavel.autentica(senha);
		if  (autenticou) {
			System.out.println("Pode entrar no sistema!");
		} else {
			System.out.println("Não pode entrar no sistema!");
		}

	}

}