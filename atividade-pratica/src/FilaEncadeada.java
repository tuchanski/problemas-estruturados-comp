public class FilaEncadeada {

    class No {
        int dado;
        No proximo;

        No(int dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }

    private No inicio = null;
    private No fim = null;

    public void insere(int valor) {
        No novoNo = new No(valor);
        if (inicio == null) {
            inicio = fim = novoNo;
        } else {
            fim.proximo = novoNo;
            fim = novoNo;
        }
    }

    public int remove() {
        if (inicio == null) {
            System.out.println("Erro: Fila vazia");
            return -1;
        }
        int valorRemovido = inicio.dado;
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null;
        }
        return valorRemovido;
    }

    public void imprime() {
        No atual = inicio;
        System.out.print("Fila: ");
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public int frente() {
        return inicio.dado;
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    public static void main(String[] args) {
        FilaEncadeada fila = new FilaEncadeada();

        fila.insere(10);
        fila.insere(20);
        fila.insere(30);

        fila.imprime(); // Fila: 10 20 30

        System.out.println("Elemento removido: " + fila.remove()); // Remove 10
        fila.imprime(); // Fila: 20 30
    }
}
