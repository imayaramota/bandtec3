import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int vetorDiaPorMes[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};

        System.out.println("Digite um dia do ano");
        int diaDigitado = leitor.nextInt();
        System.out.println("Digite um mês");
        int mesDigitado = leitor.nextInt();

        int somaDosDias = 0;
        for (int i = 0; i < mesDigitado; i++) {
             somaDosDias += vetorDiaPorMes[i];
        }
    System.out.println("O dia " +diaDigitado+ " do mês " +mesDigitado+
                       " corresponde ao dia " +(diaDigitado +somaDosDias)+ " do ano");
    }
}
