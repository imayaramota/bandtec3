import java.util.Scanner;

public class Exercicio07 {
    public static void exibeVetor(String[] nome, int tamanho){
        for (int i = 0; i < tamanho; i++) {
            System.out.print("aluno: [" + i + "]= " + nome[i] + "\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String turma1[] = new String[10];
        String turma2[] = new String[10 ];
        int indice1 = 0;
        int indice2 = 0;

        for (int i = 0; i < turma1.length; i++) {
            System.out.println("Digite o nome do aluno");
            String aluno = leitor.nextLine();
            System.out.println("Digite a turma desse aluno:\n" +
                                "1- para turma 1\n" +
                                "2- para turma 2\n");
            String turma = leitor.nextLine();
            if (turma.equals("1")){
                turma1[indice1] = aluno;
                indice1++;
            }
            else {
                turma2[indice2] = aluno;
                indice2++;
            }

        }
        exibeVetor(turma1, indice1);
        exibeVetor(turma2, indice2);
    }

}
