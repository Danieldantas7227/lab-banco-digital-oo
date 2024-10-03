package Model;

public class ContaCorrente extends Conta {

	private final double LIMITE_DE_EMPRÉSTIMO = 7000;
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}	
	
	public void pedirEmpréstimo(double valor){//O método permite que o cliente pegue empréstimo do Banco, na lógica o objetivo é que apenas clientes que não estejam devendo, possam pegar um empréstimo de no máximo 7000.
		
	if(valor <= LIMITE_DE_EMPRÉSTIMO && saldo >= 0) { saldo -= valor; } else { System.out.println("\nEmpréstimo negado!"); }	
	}
	
	
}
