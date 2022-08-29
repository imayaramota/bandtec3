public class Professor extends FuncionarioBonus {

    public Professor(String nome, int quantAulasSemanal, double valorHoraPorAula) {
        super(nome, quantAulasSemanal, valorHoraPorAula);
    }

    @Override
    public Double getValorBonus() {
       return  (( getQuantAulasSemanal() * getValorHoraPorAula()) * 4.5 ) * 0.15;
    }

    @Override
    public String toString() {
        return "Professor{" +
                super.toString() +
                ", valor de bônus:" + getValorBonus() +
                "} ";
    }
}
