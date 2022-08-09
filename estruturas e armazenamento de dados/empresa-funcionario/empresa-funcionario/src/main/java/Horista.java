public class Horista extends Funcionario{
    // Atributos
    private Integer qtdHora;
    private double valorHora;
    // Construtor com super (ref. a classe mãe)
    public Horista(String cpf, String nome, Integer qtdHora, double valorHora) {
        super(cpf, nome);
        this.qtdHora = qtdHora;
        this.valorHora = valorHora;
    }
    // Método abstract
    @Override
    public Double calcSalario() {
        return qtdHora * valorHora;
    }
    // toString()
    @Override
    public String toString() {
        return "Horista{" +
                " qtdHora: " + qtdHora +
                " valorHora: " + valorHora +
                " salario: " + calcSalario() +
                "} " + super.toString();
    }
}
