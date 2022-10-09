public class Coordenadores extends FuncionarioBonus {
    private int quantHorasSemanal;
    private double valorHora;

    public Coordenadores(String nome, int quantHorasSemanal, double valorHora) {
        super(nome);
        this.quantHorasSemanal = quantHorasSemanal;
        this.valorHora = valorHora;
    }

    @Override
    public Double getValorBonus() {
        return ((quantHorasSemanal * valorHora) * 4.5) * 0.2;
    }

    @Override
    public String toString() {
        return "Coordenadores{" +
                super.toString() +
                "quantHorasSemanal:" + quantHorasSemanal +
                ", valorHora:" + valorHora +
                ", valor do bônus:" + getValorBonus() +
                "} " ;
    }
}
