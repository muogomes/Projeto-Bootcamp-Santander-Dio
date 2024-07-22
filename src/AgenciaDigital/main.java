package AgenciaDigital;

public class main {
	
	public static void main(String[] args) {
		
		Cliente murilo = new Cliente();
		murilo.setNome("Murilo");
		
		Conta cc = new ContaCorrente(murilo);
		cc.depositar(150);
		
		Conta poupanca = new ContaPoupanca(murilo);
		
		cc.transferir(50, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
