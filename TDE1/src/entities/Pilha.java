package entities;

public class Pilha {

    private int MAX;
    private int[] pilha;
    private int topo = -1;

    public Pilha(int MAX) {
        this.MAX = MAX;
        pilha = new int[MAX];
    }

    public boolean pilhaVazia() {
        return topo == -1;
    }

    public boolean pilhaCheia() {
        return topo == MAX - 1;
    }

    public void empilhaElemento(int elemento) {

        if (pilhaCheia()) {
            System.out.println("Erro: Pilha cheia");
            return;
        }

        topo = topo + 1;
        pilha[topo] = elemento;

    }

    public int desempilhaElemento() {

        if (pilhaVazia()) {
            System.out.println("Erro: Pilha vazia");
            return -1;
        }

        int elemento = pilha[topo];
        topo -= 1;
        return elemento;

    }

    public int consultaTopo() {

        if (pilhaVazia()) {
            System.out.println("Erro: Pilha vazia");
            return -1;
        }

        return pilha[topo];
    }

    public void imprimePilha() {
        if (pilhaVazia()) {
            System.out.println("Erro: Pilha vazia");
            return;
        }

        System.out.println("\nEstado atual da pilha:");
        System.out.println("|------|");
        for (int i = topo; i >= 0; i--) {
            System.out.printf("|  %d  |", pilha[i]);
            if (i == topo) {
                System.out.print(" ← Topo");
            }
            System.out.println();
            System.out.println("|------|");
        }

        System.out.println("|______|");
        System.out.println("Elementos na pilha: " + (topo + 1) + "/" + MAX);
    }


}
