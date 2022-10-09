import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int vetor[] = new int[10];
        int media = 0;
        int valorMedia = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor de vetor [" + i + "]");
            vetor[i] = leitor.nextInt();
            media += vetor[i];
        }
        valorMedia = media / vetor.length;
        System.out.println("Média: " + valorMedia);
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] >= valorMedia) {
                System.out.println("Acima da média:  " + vetor[i]);
            }
        }
    }
}
