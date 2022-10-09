import javax.swing.*;

public class DivisaoFinally {
    public static void main(String[] args) {
        String snum1, snum2;
        snum1 = JOptionPane.showInputDialog("Digite um numero");
        snum2 = JOptionPane.showInputDialog("Digite outro numero");

        // se forse Integer.valueOf
        int num1 = Integer.parseInt(snum1);
        int num2 = Integer.parseInt(snum2);

        try {
            JOptionPane.showMessageDialog(null, num1 / num2);
        }
        catch (ArithmeticException erro){
            JOptionPane.showMessageDialog(null,
                    "Divisão por zero não tem como dividir!\n " +erro,
                    "Erro", JOptionPane.ERROR_MESSAGE);
            System.out.println(erro);

        }
        catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null,
                    "Digite apenas números!\n " +erro,
                    "Erro", JOptionPane.ERROR_MESSAGE);
            System.out.println(erro);

        }
        finally {
            JOptionPane.showMessageDialog(null, "Batatouuuu o processamento acabou!!");
            System.exit(0);
        }
    }
}
