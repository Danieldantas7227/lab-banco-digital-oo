package Controller;
import Model.*;
public class Main {

	public static void main(String[] args) {
		
	Cliente Daniel = new Cliente("Daniel Dantas", "2189230128");	
	Cliente Bruno = new Cliente("Bruno Galhasso", "1028939011");
	Cliente Roger = new Cliente("Roger Flores", "10283112334");
	Cliente Ana = new Cliente("Ana Thaís", "01893289123");
	Cliente Wellington = new Cliente("Wellington Rato", "8401201900");
	Cliente Pedro = new Cliente("Pedro Souza", "9910283012");
	
	
	ContaCorrente ccDan = new ContaCorrente(Daniel);
	ContaCorrente ccBruno = new ContaCorrente(Bruno);
	ContaCorrente ccRoger = new ContaCorrente(Roger);
	ContaCorrente ccAna = new ContaCorrente(Ana);
	ContaPoupanca cpWellington = new ContaPoupanca(Wellington);
	ContaPoupanca cpPedro = new ContaPoupanca(Pedro);
	
	
	Banco inter = new Banco();
	
	inter.adicionarConta(ccDan);
	inter.adicionarConta(ccAna);
	inter.adicionarConta(ccBruno);
	inter.adicionarConta(ccRoger);
	inter.adicionarConta(cpPedro);
	inter.adicionarConta(cpWellington);
	
	inter.exibirListaDeClientes();
	inter.removerConta(cpPedro);
	inter.exibirListaDeClientes();
	
	ccAna.pedirEmpréstimo(2000);
	ccBruno.pedirEmpréstimo(3500);
	ccRoger.pedirEmpréstimo(150);
	ccRoger.depositar(280);
	ccAna.depositar(1500);
	ccBruno.depositar(2100);
	
	System.out.println("\nLista de Devedores: \n" + inter.ClientesDevedores());
	
	
	
	}
}
