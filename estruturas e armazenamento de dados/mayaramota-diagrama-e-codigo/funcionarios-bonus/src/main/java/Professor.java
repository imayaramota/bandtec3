public class Professor extends FuncionarioBonus {
    private int quantAulasSemanal;
    private double valorHoraPorAula;

    public Professor(String nome, int quantAulasSemanal, double valorHoraPorAula) {
        super(nome);
        this.quantAulasSemanal = quantAulasSemanal;
        this.valorHoraPorAula = valorHoraPorAula;
    }

    @Override
    public Double getValorBonus() {
        return ((quantAulasSemanal * valorHoraPorAula) * 4.5 ) * 0.15;
    }

    @Override
    public String toString() {
        return "Professor{" +
                super.toString() +
                "quantAulasSemanal=" + quantAulasSemanal +
                ", valorHoraPorAula=" + valorHoraPorAula +
                ", valor de bônus:" + getValorBonus() +
                "} ";
    }
}
