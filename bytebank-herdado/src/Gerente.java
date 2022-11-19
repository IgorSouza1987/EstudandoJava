
public class Gerente extends Funcionario implements Autenticavel{

	private int senha = 2222;
	
	public double getBonificacao() {
		return super.getSalario() + 200.0; 
	}

	@Override
	public void setSenha(int senha) {

		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {

		if(this.senha == senha) {
			return true;
		}else {
		return false;
	}
	}
	
}
