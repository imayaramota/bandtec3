public class Perfume extends Produto{
    private String fragancia;

    public Perfume(Integer codigo, String descrição, Double preco, String fragancia) {
        super(codigo, descrição, preco);
        this.fragancia = fragancia;
    }

    @Override
    public Double getValorAtributo() {
        return getPreco() * 0.27;
    }

    @Override
    public String toString() {
        return "Perfume{" +
                "fragancia:'" + fragancia + '\'' +
                "} " + super.toString();
    }
}
