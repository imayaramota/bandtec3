public class Engenheiro extends Funcionario{
    // Atributos
    private double salario;

    // Construtor com super (ref. a classe mãe)
    public Engenheiro(String cpf, String nome, double salario) {
        super(cpf, nome);
        this.salario = salario;
    }
    // Método abstract
    @Override
    public Double calcSalario() {
        return salario;
    }

    // toString()
    @Override
    public String toString() {
        return "Engenheiro{" +
                " salario: " + salario +
                "} " + super.toString();
    }
}
