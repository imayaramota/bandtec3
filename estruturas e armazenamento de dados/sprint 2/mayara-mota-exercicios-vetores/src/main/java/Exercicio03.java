import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String vetor[] = new String[10];
        String isExist;
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um nome: [" + i + "]");
            vetor[i] = leitor.nextLine();
        }
        System.out.println("Digite o nome para procurar no vetor");
        isExist = leitor.nextLine();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].equals(isExist)) {
                System.out.println("Nome encontrado no índice: " + i);
            }else if (i == vetor.length-1){
                System.out.println("Nome não encontrado!!");
            }
        }
    }
}
