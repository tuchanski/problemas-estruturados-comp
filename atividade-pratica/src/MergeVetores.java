public class MergeVetores {

    public static int[] merge(int[] vetor1, int tamanho1, int[] vetor2, int tamanho2) {
        int[] vetorMergeado = new int[tamanho1 + tamanho2];

        int i = 0, j = 0, k = 0;

        while (i < tamanho1 && j < tamanho2) {
            if (vetor1[i] <= vetor2[j]) {
                vetorMergeado[k] = vetor1[i];
                i++;
            } else {
                vetorMergeado[k] = vetor2[j];
                j++;
            }
            k++;
        }

        while (i < tamanho1) {
            vetorMergeado[k] = vetor1[i];
            i++;
            k++;
        }

        while (j < tamanho2) {
            vetorMergeado[k] = vetor2[j];
            j++;
            k++;
        }

        return vetorMergeado;
    }

    public static void imprimirVetor(int[] vetor, int tamanho) {
        System.out.print("Vetor mergeado: [");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i]);
            if (i < tamanho - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] A = new int[3];
        A[0] = 1;
        A[1] = 3;
        A[2] = 5;

        int[] B = new int[3];
        B[0] = 2;
        B[1] = 4;
        B[2] = 6;

        int[] C = merge(A, 3, B, 3);

        imprimirVetor(C, 6);
    }
}
