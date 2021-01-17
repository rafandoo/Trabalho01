package restaurante;

public class Nodo {
	// Mant�m a estrutura da lista

	private Nodo prox;
	private Restaurante cliente;
	
	// Declara��o do construtor
	public Nodo (Restaurante clientes) {
		// Toda vez que for instanciado um novo nodo,
		// o Restaurante cliente ser� o par�metro
		// que ir� preencher clientes 
		// e apontar� para o pr�ximo.
		
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
