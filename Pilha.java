package algoritmos;

public class PIlha {
	private ListaEncadeada lista = new ListaEncadeada();
	
	public void empilhar(int valor) {
		lista.adicionarInicio(valor);
	}
	public int desempilhar() {
		return lista.removerInicio();
	}
	public void imprimir() {
		lista.imprimir();
	}
	public boolean estaVazia() {
		return lista.estaVazia();
	}
	
}

