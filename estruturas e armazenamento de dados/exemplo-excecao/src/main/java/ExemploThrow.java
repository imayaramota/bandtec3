import java.util.Scanner;

public class ExemploThrow {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.println("Digite um número");
            Double nota1 = leitor.nextDouble();
            if (nota1 < 0 || nota1 > 10.0) {
                throw new LimiteUltrapassadoException("Nota inválida da nota 1");
            }
            System.out.println("Digite outro número");
            Double nota2 = leitor.nextDouble();
            if (nota2 < 0 || nota2 > 10.0) {
                throw new LimiteUltrapassadoException("Nota inválida da nota 2");
            }
        }
        catch (LimiteUltrapassadoException erro){
            System.out.println(erro + " - " + erro.dataHora);
            erro.printStackTrace();
        }
    }
}
