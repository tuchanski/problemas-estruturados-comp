public class PilhaEncadeada {

    class No {
        int dado;
        No proximo;

        No(int dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }

    private No topo = null;

    public void insere(int valor) {
        No novoNo = new No(valor);
        novoNo.proximo = topo;
        topo = novoNo;
    }

    public int remove() {
        if (topo == null) {
            System.out.println("Erro: Pilha vazia");
            return -1;
        }
        int valorRemovido = topo.dado;
        topo = topo.proximo;
        return valorRemovido;
    }

    public void imprime() {
        No atual = topo;
        System.out.print("Pilha: ");
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PilhaEncadeada pilha = new PilhaEncadeada();

        pilha.insere(10);
        pilha.insere(20);
        pilha.insere(30);

        pilha.imprime(); // Pilha: 30 20 10

        System.out.println("Elemento removido: " + pilha.remove()); // Remove 30
        pilha.imprime(); // Pilha: 20 10
    }
}
