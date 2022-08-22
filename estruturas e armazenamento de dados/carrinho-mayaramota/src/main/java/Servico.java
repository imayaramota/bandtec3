public class Servico implements Vendavel{
    private String descricao;
    private int codigo;
    private int quantHoras;
    private double valorHoras;

    public Servico(String descricao, int codigo, int quantHoras, double valorHoras) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.quantHoras = quantHoras;
        this.valorHoras = valorHoras;
    }

    @Override
    public Double getValorVenda() {
        return this.getQuantHoras() * this.getValorHoras();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantHoras() {
        return quantHoras;
    }

    public void setQuantHoras(int quantHoras) {
        this.quantHoras = quantHoras;
    }

    public double getValorHoras() {
        return valorHoras;
    }

    public void setValorHoras(double valorHoras) {
        this.valorHoras = valorHoras;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "descricao='" + descricao + '\'' +
                ", codigo=" + codigo +
                ", quantHoras=" + quantHoras +
                ", valorHoras=" + valorHoras +
                ", valor de venda:" + getValorVenda() +
                '}';
    }
}
