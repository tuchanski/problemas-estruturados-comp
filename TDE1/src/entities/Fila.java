package entities;

public class Fila {

    private final int MAX;
    private int[] fila;

    private int inicio;
    private int fim;

    public Fila(int MAX) {
        this.MAX = MAX;
        fila = new int[MAX];

        inicio = 0;
        fim = 0;
    }

    public boolean filaVazia() {
        return inicio == fim;
    }

    public boolean filaCheia() {
        return (fim + 1) % MAX == inicio;
    }

    public void insereElemento(int elemento) {
        if (filaCheia()) {
            System.out.println("Erro: Fila cheia");
            return;
        }
        fila[fim] = elemento;
        fim = (fim + 1) % MAX;
    }

    public int removeElemento() {
        if (filaVazia()) {
            System.out.println("Erro: Fila vazia");
            return -1;
        }
        int elemento = fila[inicio];
        inicio = (inicio + 1) % MAX;
        return elemento;
    }

    public void imprimirFila() {

        if (filaVazia()) {
            System.out.println("Erro: Fila vazia");
            return;
        }

        System.out.print("Fila: [");
        int i = inicio;
        while (i != fim) {
            System.out.print(fila[i]);
            i = (i + 1) % MAX;
            if (i != fim) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}
