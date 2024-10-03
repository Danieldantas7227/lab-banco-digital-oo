package Model;

public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 0001;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {//Implementei a lógica de verificação para o saque!
		if(saldo >= valor) {saldo -= valor;} else { System.out.println("\nSaldo insuficiente para realização do Saque!"); }
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: " + this.cliente.getNome()));
		System.out.println(String.format("Agencia: " + this.agencia));
		System.out.println(String.format("Numero: " + this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	@Override
	public String toString() {
		return "\n\nTitular: " + this.cliente.getNome() + "\nAgência: " + this.agencia + "\nNúmero da Conta: " + this.numero + "\nSaldo na Conta: " + this.saldo;
	}
	
	


	
}
