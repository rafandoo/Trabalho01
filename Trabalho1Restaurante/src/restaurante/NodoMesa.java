package restaurante;

public class NodoMesa {
	
	private NodoMesa prox;
	private Restaurante mesa;
	
	
	// Declaração do construtor
	public NodoMesa (Restaurante mesas) {
		
		this.mesa = mesas;
		this.prox = null;
	}

	
	// Getters e Setters
	public NodoMesa getProx() {
		return prox;
	}


	public void setProx(NodoMesa prox) {
		this.prox = prox;
	}


	public Restaurante getMesa() {
		return mesa;
	}


	public void setMesa(Restaurante mesa) {
		this.mesa = mesa;
	}
	
}
