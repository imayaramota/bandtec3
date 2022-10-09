public class Vendedor extends Funcionario{
    // Atributos
    private Double vendas;
    private double taxas;

    // Construtor com super (ref. a classe mãe)
    public Vendedor(String cpf, String nome, Double vendas, double taxas) {
        super(cpf, nome);
        this.vendas = vendas;
        this.taxas = taxas;
    }

    // Método abstract
    @Override
    public Double calcSalario() {
        return vendas * taxas;
    }
    // toString()
    @Override
    public String toString() {
        return "Vendedor{" +
                " vendas: " + vendas +
                " taxas: " + taxas +
                " salario: " + calcSalario() +
                "} " + super.toString();
    }
}
