import java.util.Scanner;

public class Exercicio05 {
    public static void exibeVetorNome(String[] nome){
        for (int i = 0; i < nome.length; i++) {
            System.out.print("carro: [" + i + "]= " + nome[i] + "\t");
        }
        System.out.println();
    }
    public static void exibeVetorRendimento(int[] rendimento){
        for (int i = 0; i < rendimento.length; i++) {
            System.out.print("rendimento: [" + i + "]= " + rendimento[i] + "\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitor2 = new Scanner(System.in);
        String vetorNomeCarro[] = new String[5];
        int vetorRendiemntoKM[] = new int[5];

        for (int i = 0; i < vetorNomeCarro.length; i++) {
            System.out.println("Digite o nome do carro que vai ocupar a possição: [" + (i+1) + "]");
            vetorNomeCarro[i] = leitor.nextLine();
            System.out.println("Digite quantos quilômetros o carro " + vetorNomeCarro[i] +" faz: [" + (i+1) + "]");
            vetorRendiemntoKM[i] = leitor2.nextInt();
        }

        int maisEconomico = 0;
        int posicao=0;
        for (int i = 0; i < vetorNomeCarro.length; i++) {
           if (vetorRendiemntoKM[i] > maisEconomico){
               maisEconomico = vetorRendiemntoKM[i];
               posicao = i;
           }
        }
        exibeVetorNome(vetorNomeCarro);
        exibeVetorRendimento(vetorRendiemntoKM);
        System.out.println("O carro: "+vetorNomeCarro[posicao]+" é o mais econômico");
    }
}
