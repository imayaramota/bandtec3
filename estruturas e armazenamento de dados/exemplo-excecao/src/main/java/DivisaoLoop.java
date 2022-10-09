import javax.swing.*;

public class DivisaoLoop {
    public static void main(String[] args) {
        String snum1, snum2;

        Boolean fim = false;

        //enquanto fim for false repete
        while (!fim) {
            snum1 = JOptionPane.showInputDialog("Digite um numero");
            snum2 = JOptionPane.showInputDialog("Digite outro numero");
            try {
                // se forse Integer.valueOf
                int num1 = Integer.parseInt(snum1);
                int num2 = Integer.parseInt(snum2);
                JOptionPane.showMessageDialog(null, num1 / num2);
                fim = true;
            } catch (ArithmeticException erro) {
                JOptionPane.showMessageDialog(null,
                        "Divisão por zero não tem como dividir!\n " + erro,
                        "Erro", JOptionPane.ERROR_MESSAGE);
                System.out.println(erro);

            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null,
                        "Digite apenas números!\n " + erro,
                        "Erro", JOptionPane.ERROR_MESSAGE);
                System.out.println(erro);

            }
        }
        System.exit(0);

    }
}
