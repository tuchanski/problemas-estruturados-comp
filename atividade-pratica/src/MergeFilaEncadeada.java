public class MergeFilaEncadeada {

    public static FilaEncadeada merge(FilaEncadeada fila1, FilaEncadeada fila2) {
        FilaEncadeada filaMergeada = new FilaEncadeada();

        while (!fila1.estaVazia() && !fila2.estaVazia()) {
            if (fila1.frente() <= fila2.frente()) {
                filaMergeada.insere(fila1.remove());
            } else {
                filaMergeada.insere(fila2.remove());
            }
        }

        while (!fila1.estaVazia()) {
            filaMergeada.insere(fila1.remove());
        }

        while (!fila2.estaVazia()) {
            filaMergeada.insere(fila2.remove());
        }

        return filaMergeada;

    }

    public static void main(String[] args) {
        FilaEncadeada A = new FilaEncadeada();
        FilaEncadeada B = new FilaEncadeada();

        A.insere(1);
        A.insere(3);
        A.insere(5);

        B.insere(2);
        B.insere(4);
        B.insere(6);

        FilaEncadeada C = merge(A, B);
        C.imprime(); // Fila: 1 2 3 4 5 6

    }
}
