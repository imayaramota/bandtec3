public abstract class Produto implements Tributavel{
    private Integer codigo;
    private String descrição;
    private Double preco;

    public Produto(Integer codigo, String descrição, Double preco) {
        this.codigo = codigo;
        this.descrição = descrição;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo:" + codigo +
                ", descrição:'" + descrição + '\'' +
                ", preco:" + preco +
                ", tributo:" + getValorAtributo() +
                '}';
    }
}
