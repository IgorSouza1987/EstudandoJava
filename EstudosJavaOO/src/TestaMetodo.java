
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contadoPaulo = new Conta();
		contadoPaulo.saldo = 300;
		contadoPaulo.deposita(50);
		
		System.out.println(contadoPaulo.saldo);
		
		
		contadoPaulo.saca(30);
		System.out.println(contadoPaulo.saldo);
		
		Conta contadaMarcela = new Conta();
		contadaMarcela.deposita(1000); 
		
		contadaMarcela.transfere(300, contadoPaulo);
		
		System.out.println(contadaMarcela.saldo);
		System.out.println(contadoPaulo.saldo);
		
		
	}
}
