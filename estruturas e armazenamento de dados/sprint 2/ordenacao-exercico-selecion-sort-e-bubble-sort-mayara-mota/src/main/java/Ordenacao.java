public class Ordenacao {
        public static void exibeVetor(int[] v) {
            for (int i = 0; i < v.length; i++) {
                System.out.print(v[i] + "\t");
            }
        }

        public static void selectionSort() {
            int vetor[] = {4, 7, 5, 2, 8, 1, 6, 3};
            int aux;
            int comparacao = 0;
            int troca = 0;
            for (int i = 0; i < vetor.length -1; i++) {
                for (int j = i+1; j < vetor.length; j++) {
                    comparacao++;
                    if (vetor[j] < vetor[i]) {
                        aux = vetor[i];
                        vetor[i] = vetor[j];
                        vetor[j] = aux;
                        troca++;
                    }
                }
            }
            exibeVetor(vetor);
            System.out.println("\nQuantidade de comparações: "+comparacao);
            System.out.println("Quantidade de trocas: "+troca);
        }

        public static void bubbleSort() {
            int vetor[] = {4, 7, 5, 2, 8, 1, 6, 3};
            int indceMenor;
            int troca = 0;
            int comparacao = 0;
            for (int i = 0; i < vetor.length - 1; i++) {
                comparacao++;
                for (int j = 1; j < vetor.length - i; j++) {
                    if (vetor[j - 1] > vetor[j]) {
                        troca++;
                        indceMenor = vetor[j];
                        vetor[j] = vetor[j - 1];
                        vetor[j - 1] = indceMenor;
                    }
                }
            }
            exibeVetor(vetor);
            System.out.println("\nQuantidade de comparações: "+comparacao);
            System.out.println("Quantidade de trocas: "+troca);
        }
}
