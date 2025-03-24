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


}
