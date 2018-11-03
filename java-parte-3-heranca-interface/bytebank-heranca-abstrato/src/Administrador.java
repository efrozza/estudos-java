
public class Administrador extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticacaoUtil;

	public Administrador() {
		this.autenticacaoUtil = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticacaoUtil.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticacaoUtil.autentica(senha);
	}

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 50;
	}

}
