package algoritmos;

import algoritmos.PIlha.ListaEncadeada.No;

public class ListaEncadeada {

    private No inicio;


    public void adicionarInicio(int valor) {
        No novo = new No(valor);
        novo.proximo = inicio;
        inicio = novo;
    }


    public void adicionarFim(int valor) {
        No novo = new No(valor);

        if (inicio == null) {
            inicio = novo;
            return;
        }

        No aux = inicio;

        while (aux.proximo != null) {
            aux = aux.proximo;
        }

        aux.proximo = novo;
    }


    public int removerInicio() {
        if (inicio == null) {
            throw new RuntimeException("Lista vazia");
        }

        int valor = inicio.valor;
        inicio = inicio.proximo;

        return valor;
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    public void imprimir() {
        No aux = inicio;

        while (aux != null) {
            System.out.print(aux.valor + " -> ");
            aux = aux.proximo;
        }

        System.out.println("null");
    }

    private static class No {
        int valor;
        No proximo;

        public No(int valor) {
            this.valor = valor;
        }
    }
}

