package restaurante;

public class ListaSimples {
	
	private int numNodo;
	private Nodo primeiro;
	private Nodo ultimo;
	
	
	// Declaração do construtor
	public ListaSimples () {
		// Toda vez que for instanciado uma nova lista,
		// iniciará com o valor nulo,
		// o último será nulo,
		// e a quantidade será zero.
		
		this.primeiro = null;
		this.ultimo = null;
		this.numNodo = 0;
	}
	
	
	// Getters e Setters
	public int getNumNodo() {
		return numNodo;
	}


	public void setNumNodo(int numNodo) {
		this.numNodo = numNodo;
	}


	public Nodo getPrimeiro() {
		return primeiro;
	}


	public void setPrimeiro(Nodo primeiro) {
		this.primeiro = primeiro;
	}


	public Nodo getUltimo() {
		return ultimo;
	}


	public void setUltimo(Nodo ultimo) {
		this.ultimo = ultimo;
	}
	
	
	
	// Criação dos métodos
	
	public String procurarNodo (String pedido) {
		// Método para encontrar um nodo
		String dados = "";
		Nodo atual = this.primeiro;
		
		while ((atual != null) && (!atual.getCliente().getPedido().equals(pedido))) {
			atual = atual.getProx();
		}
		
		return dados = "Número do pedido: " + atual.getCliente().getPedido()
					   + "\n" +
					   "Valor da refeição: " + atual.getCliente().getQuantia();
		
	}
	
	public boolean listaVazia() {
		// Método para saber se a lista está vazia
		
		return (this.primeiro == null);
	}
	
	public void incluirPrim(Restaurante cliente) {
		// Método para inserir o primeiro
		
		// O objeto é instanciado com o cliente
		Nodo novoNodo = new Nodo(cliente);
		
		// Testando para saber se a lista é vazia
		// Se sim, o último será o novo nodo
		if (this.listaVazia()) {
			this.ultimo = novoNodo;
		}
		
		// O próximo é o primeiro
		novoNodo.setProx(this.primeiro);
		// Primeiro é o novo nodo
		this.primeiro = novoNodo;
		// Incremento 
		this.numNodo++;
	}
	
	public void incluirUlt(Restaurante cliente) {
		// Método para inserir o último
		
		Nodo novoNodo = new Nodo(cliente);
		
		// Se a lista ser vazia,
		// o primeiro recebe o novo nodo
		if(this.listaVazia()) {
			this.primeiro = novoNodo;
		} else {
			// Se não,
			// o próximo do último recebe o novo nodo
			this.ultimo.setProx(novoNodo);
		}
		
		// O último recebe o novo nodo
		this.ultimo = novoNodo;
		// Incremento
		this.numNodo++;
	}
	
	// Método para remover nodo
	public boolean removNodo (String pedido) {
		Nodo recente = this.primeiro;
		Nodo anterior = null;
		
		if (this.listaVazia()) {
			// Retorna falso
			return false;
		} else {
			// Enquanto o recente for diferente de nulo,
			// e o atual.getCliente e getPedido
			// ser diferente do pedido
			while ((recente != null) && (!recente.getCliente()
					.getPedido().equals(pedido))) {
				anterior = recente;
				recente = recente.getProx();
			}
			
			if (recente == this.primeiro) {
				if (this.primeiro == this.ultimo) {
					this.ultimo = null;
				}
				
				this.primeiro = this.primeiro.getProx();
				
			} else {
				if (recente == this.ultimo) {
					this.ultimo = anterior;
				}
				
				anterior.setProx(recente.getProx());
			}
			// Incremento
			this.numNodo--;
			
			// Retorna verdadeiro
			return true;
		}
	}
	
	public String mostrarLista () {
		// Método para mostrar a lista
		String dados = "";
		
		if (this.listaVazia()) {
			dados = "Lista vazia!";
			
		} else {
			Nodo recente = this.primeiro;
			
			while (recente != null) {
				dados +=  " - " + "\n" + recente.getCliente().getPedido();
				recente = recente.getProx();
			}
		}
		
		return dados;
	}
	

}
