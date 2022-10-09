public class SortSelection {
    public static void exibeVetor(int[] rendimento){
        for (int i = 0; i < rendimento.length; i++) {
            System.out.print("vetor: [" + i + "]= " + rendimento[i] + "\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int vetor[] = {4,7,5,2,8,1,6,3};
        int vetor2[] = {4,7,5,2,8,1,6,3};
        int aux;
        int comparacao = 0;
        int troca = 0;

        int aux2;
        int comparacao2 = 0;
        int troca2 = 0;
        // normal
        for (int i = 0; i < vetor.length -1; i++) {
            comparacao ++;
            for (int j = i+1; j < vetor.length; j++) {
                if (vetor[j] < vetor[i]){
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                    troca++;
                }
            }
        }
        System.out.println("Normal:");
        exibeVetor(vetor);
        System.out.println("comparação: "+comparacao);
        System.out.println("trocas: " +troca);

        // ao contrario NÃO FUNCIONAx
        
//        for (int k = 0; k < vetor2.length -1; k++) {
//            comparacao2 ++;
//            for (int l = k + 1; l > vetor2.length; l++) {
//                if (vetor2[l] > vetor2[k]){
//                    aux2 = vetor2[k];
//                    vetor2[k] = vetor2[l];
//                    vetor2[l] = aux2;
//                    troca2++;
//                }
//            }
//        }
//        System.out.println("ao contrario:");
//        exibeVetor(vetor2);
//        System.out.println("comparação: "+comparacao2);
//        System.out.println("trocas: " +troca2);
    }
}
