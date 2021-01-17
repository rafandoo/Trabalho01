package restaurante;

public class ListaSimples02 {
	
	private NodoMesa primeiro;
	private NodoMesa ultimo;
	
	
	// Declaração do construtor
	public ListaSimples02 () {
		
		this.primeiro = null;
		this.ultimo = null;
		
		for (int aux = 1; aux < 11; aux++) {
			cont(aux);
		}
	}

	
	// Getters e Setters
	public NodoMesa getPrimeiro() {
		return primeiro;
	}


	public void setPrimeiro(NodoMesa primeiro) {
		this.primeiro = primeiro;
	}


	public NodoMesa getUltimo() {
		return ultimo;
	}


	public void setUltimo(NodoMesa ultimo) {
		this.ultimo = ultimo;
	}
	
	
	// Criação dos métodos
	
	
	// Método para iniciar a lista
	public void cont (int a) {
		
		Restaurante m = new Restaurante ();
		m.setMesa (a);
		incluirPrim (m);
	}
	
	public boolean listaVazia() {
		// Método para saber se a lista está vazia
		
		return (this.primeiro == null);
	}
	
	// Método para imprimir os dados
	public String gerarM () {
		
		String dados = "";
		NodoMesa recente = this.primeiro;
		
		while (recente != null) {
			
			dados += " - " + recente.getMesa().getPedido();
			recente = recente.getProx();
		}
		
		return dados;
	}
	
	
	// Método para incluir no início
	public void incluirPrim (Restaurante mesa) {
		
		NodoMesa novoNodo = new NodoMesa (mesa);
		
		if (this.listaVazia()) {
			this.primeiro = novoNodo;
			
		} else {
			this.ultimo = novoNodo;
		}
		
		this.ultimo = novoNodo;
	}
	
	
	// Método para incluir no último
	public void incluirUlt (Restaurante mesa) {
		
		NodoMesa novoNodo = new NodoMesa (mesa);
		
		if (this.listaVazia()) {
			
			this.primeiro = novoNodo;
			
		} else {
			this.ultimo.setProx(novoNodo);
		}
		
		this.ultimo = novoNodo;
	}
	
	
	// Método para as mesas
	public boolean mesaOcup (String numMesa) {
		
		NodoMesa recente = this.primeiro;
		NodoMesa anterior = null;
		
		if (this.listaVazia()) {
			
			return false;
			
		} else {
			while ((recente != null) && (!recente.getMesa().getPedido()
					.equals (numMesa))) {
				
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
			
			return true;
		}
	}
}
