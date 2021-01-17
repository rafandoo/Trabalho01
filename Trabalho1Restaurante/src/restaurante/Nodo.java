package restaurante;

public class Nodo {
	// Mantém a estrutura da lista

	private Nodo prox;
	private Restaurante cliente;
	
	// Declaração do construtor
	public Nodo (Restaurante clientes) {
		// Toda vez que for instanciado um novo nodo,
		// o Restaurante cliente será o parâmetro
		// que irá preencher clientes 
		// e apontará para o próximo.
		
		this.cliente = clientes;
		this.prox = null;
	}
	
	
	// Getters e Setters
	public Restaurante getCliente() {
		return cliente;
	}

	public void setCliente(Restaurante cliente) {
		this.cliente = cliente;
	}

	public Nodo getProx() {
		return prox;
	}

	public void setProx(Nodo prox) {
		this.prox = prox;
	}
	
}
