public class Coordenador extends FuncionarioBonus {
    private int quantHorasSemanal;
    private double valorHora;

    public Coordenador(String nome, int quantAulasSemanal, double valorHoraPorAula, int quantHorasSemanal, double valorHora) {
        super(nome, quantAulasSemanal, valorHoraPorAula);
        this.quantHorasSemanal = quantHorasSemanal;
        this.valorHora = valorHora;
    }

    @Override
    public Double getValorBonus() {
        return ((( getQuantAulasSemanal() * getValorHoraPorAula()) * 4.5 ) * 0.15) + (((quantHorasSemanal * valorHora) * 4.5) * 0.2);
    }

    @Override
    public String toString() {
        return "Coordenador{" +
                super.toString() +
                "quantHorasSemanal=" + quantHorasSemanal +
                ", valorHora=" + valorHora +
                ", valor do bônus:" + getValorBonus() +
                "} ";
    }
}