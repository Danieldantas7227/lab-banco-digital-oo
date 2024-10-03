package Model;

public class ContaPoupanca extends Conta {

	private double valorNaPoupanca = 0;
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	

	public double getValorNaPoupanca() {
		return valorNaPoupanca;
	}

	public void setValorNaPoupanca(double valorNaPoupanca) {
		this.valorNaPoupanca = valorNaPoupanca;
	}
	

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
	
	
	public void depositarNaPoupanca(double valor) {//O Método permite depositar\armazenar na Poupança!
	
	if(saldo >= valor) { saldo -= valor;  valorNaPoupanca += valor;	}else { System.out.println("\nSaldo insuficiente para a transição!"); }
   }
	
	
	
}
