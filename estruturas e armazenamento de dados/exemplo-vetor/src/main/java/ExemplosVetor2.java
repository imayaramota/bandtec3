import java.util.Scanner;

public class ExemplosVetor2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[] vetorDiaSemana = {"Domingo","Segunda-Feira","Terça-Feira","Quarta-Feira","Quinta-Feira","Sexta-Feira","Sabado"};

        int resposta;
            do {
                System.out.println("\nDigite um valor de 1 a 7:");
                resposta = leitor.nextInt();
            }
            // se a resposta for maior que 7 ou menor 1
            // então ele repete o do{}
            // caso seja de 1 a 7 ele não repete
            while (resposta > 7 || resposta < 1);
            System.out.println(vetorDiaSemana[resposta - 1]);
    }
}
