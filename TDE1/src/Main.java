import entities.Pilha;

public class Main {
    public static void main(String[] args) {

        // Testando Pilha

        Pilha p = new Pilha(10);

        System.out.println(p.pilhaVazia());
        System.out.println(p.pilhaCheia());
        System.out.println(p.consultaTopo());

        p.empilhaElemento(4);
        p.empilhaElemento(3);
        p.empilhaElemento(5);
        p.empilhaElemento(8);

        System.out.println(p.pilhaVazia());
        System.out.println(p.pilhaCheia());
        System.out.println(p.consultaTopo());

        p.desempilhaElemento();
        p.desempilhaElemento();

        System.out.println(p.consultaTopo());

        p.desempilhaElemento();
        p.desempilhaElemento();
        p.desempilhaElemento();

    }
}