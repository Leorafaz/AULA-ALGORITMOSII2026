package algoritmos;

public class Fila {
	private ListaEncadeada lista = new ListaEncadeada();
	
	public void enfileirar(int valor) {
		lista.adicionarFim(valor);
	}
	public int desenfileirar() {
		return lista.removerInicio();
	}
	public boolean estaVazia() {
		return lista.estaVazia();
	}
	public void imprimir() {
		lista.imprimir();
	}
}
