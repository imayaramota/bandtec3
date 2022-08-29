import java.util.Scanner;

public class ExemplosVetor {
    public static void exibeVetor(int[] v){
        // exibe os valores do vetor
        for (int i = 0; i < v.length; i++) {
            System.out.print("vetor["+ i +"] = "+ v[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // criando vetor
        int[] vetor1 = new int[2];
        int[] vetor2 = {100,200,300,400,500,600,700};
        String[] vetor3 = new String[2];

        // inicializar os valores do vetor1
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = i * 10;
        }

        exibeVetor(vetor1);
        exibeVetor(vetor2);

        // pedindo para a pessoa escrever exemplo 1 int
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("\nDigite o valor do vetor1[" + i +"]");
            vetor1[i] = leitor.nextInt();
        }
        exibeVetor(vetor1);

        // pedindo para a pessoa escrever exemplo 3 string
        for (int i = 0; i < vetor3.length; i++) {
            System.out.println("\nDigite uma palavra do vetor3[" + i +"]");
            vetor3[i] = leitor.next();
        }
        // exibe vetor3
        for (String s: vetor3) {
            System.out.print(s + "\t");
        }
        System.out.println();
    }
}
