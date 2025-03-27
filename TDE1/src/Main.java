import entities.Fila;
import entities.Pilha;

public class Main {
    public static void main(String[] args) {

        // Testando Pilha

        Pilha p = new Pilha(5);

        p.imprimePilha();

        p.empilhaElemento(10);
        p.empilhaElemento(20);
        p.empilhaElemento(30);
        p.imprimePilha();

        System.out.println("\nDesempilhando: " + p.desempilhaElemento());
        p.imprimePilha();

        p.empilhaElemento(40);
        p.empilhaElemento(50);
        p.empilhaElemento(60);
        p.imprimePilha();

        System.out.println("\nTopo atual: " + p.consultaTopo());

        // Testando Fila

        System.out.println("\n- FILA -\n");

        Fila f = new Fila(10);

        f.imprimirFila();

        System.out.println("Fila cheia: " + f.filaCheia());
        System.out.println("Fila vazia: " +f.filaVazia());

        f.insereElemento(2);
        f.insereElemento(1);

        f.imprimirFila();

        System.out.println("Saindo da fila: " + f.removeElemento());

        f.insereElemento(3);
        f.insereElemento(4);
        f.insereElemento(5);

        f.imprimirFila();

        System.out.println("Saindo da fila: " + f.removeElemento());
        System.out.println("Saindo da fila: " + f.removeElemento());

        f.imprimirFila();

    }
}