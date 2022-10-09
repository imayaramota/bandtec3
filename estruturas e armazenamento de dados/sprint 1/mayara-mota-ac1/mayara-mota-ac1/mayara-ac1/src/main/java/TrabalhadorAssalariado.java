public class TrabalhadorAssalariado extends Trabalhador{
    private int quantHoraExtra;
    private double valorHoraExtra;

    public TrabalhadorAssalariado(String nome, String cpf, double salario, int quantHoraExtra, double valorHoraExtra) {
        super(nome, cpf, salario);
        this.quantHoraExtra = quantHoraExtra;
        this.valorHoraExtra = valorHoraExtra;
    }

    @Override
    public double getRenda() {
        return (valorHoraExtra * quantHoraExtra) + getSalario();
    }

    @Override
    public Double getImposto() {
        return getRenda() * 0.12;
    }

    @Override
    public String toString() {
        return "TrabalhadorAssalariado{" +
                "quantHoraExtra:" + quantHoraExtra +
                ", valorHoraExtra:" + valorHoraExtra +
                ", renda:" + getRenda() +
                ", imposto de renda:" + getImposto() +
                "} " + super.toString();
    }
}
