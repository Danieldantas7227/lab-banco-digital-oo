package Model;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
public class Banco {

	private String nome;
	private List<Conta> contas;
	
	
	public Banco() {
		this.contas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	
	public void adicionarConta(Conta conta) {//O método adiciona na lista a conta passada, caso já não tenha na lista!
	Predicate<Conta> verificarCpf = c -> c.cliente.getCpf().equalsIgnoreCase(conta.cliente.getCpf());
	    
	boolean criarConta = contas.stream().noneMatch(verificarCpf);
	    
	if (criarConta == true) {contas.add(conta); } else {System.out.println("\nConta já existente!!"); }
	}
	 
	
	public void removerConta(Conta conta) {//O método remove da lista a conta passada!
	List<Conta> contaRemover = new ArrayList<>();	
		
	contas.stream().forEach(c -> {if(c == conta) {contaRemover.add(c);} });
		
	contas.removeAll(contaRemover);	
	}
	
	
	public void exibirListaDeClientes() {//O Método exibi os Clientes do banco! 
	System.out.println("\nClientes com conta no Banco: \n" );	
	contas.stream().forEach(c -> System.out.println("Nome: " + c.cliente.getNome() + " | CPF: " + c.cliente.getCpf()) );    	
		
	}
	
	
	public List<Conta> ClientesDevedores(){//O método retorna uma lista de Clientes que estão devendo ao Banco!
	List<Conta> listaDeDevedores = new ArrayList<>();	
		
	contas.stream().forEach(c -> { if(c.saldo < 0) { listaDeDevedores.add(c);}  } );	
	
	return listaDeDevedores;
	}
	
}
