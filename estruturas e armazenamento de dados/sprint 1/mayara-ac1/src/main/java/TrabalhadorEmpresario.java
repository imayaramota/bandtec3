public class TrabalhadorEmpresario extends Trabalhador{
    private double valorParticipacaoLucro;

    public TrabalhadorEmpresario(String nome, String cpf, double salario, double valorParticipacaoLucro) {
        super(nome, cpf, salario);
        this.valorParticipacaoLucro = valorParticipacaoLucro;
    }

    @Override
    public double getRenda() {
        return getSalario() + valorParticipacaoLucro;
    }

    @Override
    public Double getImposto() {
        return getRenda() * 0.25;
    }

    @Override
    public String toString() {
        return "TrabalhadorEmpresario{" +
                "valorParticipacaoLucro=" + valorParticipacaoLucro +
                ", renda:" + getRenda() +
                ", imposto de renda:" + getImposto() +
                "} " + super.toString();
    }
}
