import java.util.Scanner;

public class Exercicio01 {
    public static void exibeVetor(int[] v){
        for (int i = 0; i < v.length; i++) {
            System.out.print("vetor: [" + i + "]= " + v[i] + "\t");
        }
        System.out.println();
    }

    public static void exibeVetorInverso(int[] v){
        for (int i = v.length; i > 0; i--) {
            System.out.print("vetor: [" + i + "]= " + v[i -1] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int vetor[] = new int[7];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor de vetor: [" + i + "]");
            vetor[i] = leitor.nextInt();
        }

        exibeVetor(vetor);
        exibeVetorInverso(vetor);
    }
}
