public class Alimento extends Produto{
    private int qtdVitamina;

    public Alimento(Integer codigo, String descrição, Double preco, int qtdVitamina) {
        super(codigo, descrição, preco);
        this.qtdVitamina = qtdVitamina;
    }

    @Override
    public Double getValorAtributo() {
        return getPreco() * 0.15;
    }

    @Override
    public String toString() {
        return "Alimento{" +
                "qtdVitamina:" + qtdVitamina +
                "} " + super.toString();
    }
}
