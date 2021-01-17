package restaurante;

public class ListaSimples {
	
	private int numNodo;
	private Nodo primeiro;
	private Nodo ultimo;
	
	
	// Declara��o do construtor
	public ListaSimples () {
		// Toda vez que for instanciado uma nova lista,
		// iniciar� com o valor nulo,
		// o �ltimo ser� nulo,
		// e a quantidade ser� zero.
		
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
	
	
	
	// Cria��o dos m�todos
	
	public String procurarNodo (String pedido) {
		// M�todo para encontrar um nodo
		String dados = "";
		Nodo atual = this.primeiro;
		
		while ((atual != null) && (!atual.getCliente().getPedido().equals(pedido))) {
			atual = atual.getProx();
		}
		
		return dados = "N�mero do pedido: " + atual.getCliente().getPedido()
					   + "\n" +
					   "Valor da refei��o: " + atual.getCliente().getQuantia();
		
	}
	
	public boolean listaVazia() {
		// M�todo para saber se a lista est� vazia
		
		return (this.primeiro == null);
	}
	
	public void incluirPrim(Restaurante cliente) {
		// M�todo para inserir o primeiro
		
		// O objeto � instanciado com o cliente
		Nodo novoNodo = new Nodo(cliente);
		
		// Testando para saber se a lista � vazia
		// Se sim, o �ltimo ser� o novo nodo
		if (this.listaVazia()) {
			this.ultimo = novoNodo;
		}
		
		// O pr�ximo � o primeiro
		novoNodo.setProx(this.primeiro);
		// Primeiro � o novo nodo
		this.primeiro = novoNodo;
		// Incremento 
		this.numNodo++;
	}
	
	public void incluirUlt(Restaurante cliente) {
		// M�todo para inserir o �ltimo
		
		Nodo novoNodo = new Nodo(cliente);
		
		// Se a lista ser vazia,
		// o primeiro recebe o novo nodo
		if(this.listaVazia()) {
			this.primeiro = novoNodo;
		} else {
			// Se n�o,
			// o pr�ximo do �ltimo recebe o novo nodo
			this.ultimo.setProx(novoNodo);
		}
		
		// O �ltimo recebe o novo nodo
		this.ultimo = novoNodo;
		// Incremento
		this.numNodo++;
	}
	
	// M�todo para remover nodo
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
		// M�todo para mostrar a lista
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
