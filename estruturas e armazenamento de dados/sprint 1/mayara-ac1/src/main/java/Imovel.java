public class Imovel implements Impostavel{
    private double valorM2;
    private double area;
    private String bairro;

    public Imovel(double valorM2, double area, String bairro) {
        this.valorM2 = valorM2;
        this.area = area;
        this.bairro = bairro;
    }

    public Double getValorImovel() {
        return area * valorM2;
    }
    @Override
    public Double getImposto() {
        return getValorImovel() * 0.5;
    }

    @Override
    public String toString() {
        return "Imovel{" +
                "valorM2:" + valorM2 +
                ", area:" + area +
                ", bairro:'" + bairro +
                ", valor do imovél:" + getValorImovel() +
                ", imposto IPTU:" + getImposto() +
                '}';
    }
}
