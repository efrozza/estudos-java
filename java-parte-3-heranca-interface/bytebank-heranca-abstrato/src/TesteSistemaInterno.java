
public class TesteSistemaInterno {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setSenha(153);
		
		Administrador administrador = new Administrador();
		administrador.setSenha(123);
		
		SistemaInterno sistemaInterno = new SistemaInterno();
		sistemaInterno.autentica(gerente);
		sistemaInterno.autentica(administrador);

	}

}
