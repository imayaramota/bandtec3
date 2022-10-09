import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int vetor[] = new int[5];
        Integer isExist;
        Integer vezes = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor de vetor: [" + i + "]");
            vetor[i] = leitor.nextInt();
        }

        System.out.println("Digite um número para procurar no vetor: ");
        isExist = leitor.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == isExist) {
                vezes++;
            }
        }
        if (vezes == 0) {
            System.out.println("o número " + isExist + " não ocorre nenhuma vez!");
        } else {
            System.out.println("o número " + isExist + " ocorre " + vezes + " vezes!");
        }

    }
}
