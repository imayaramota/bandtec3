package exercicio01swagger.exercicio01swagger;

public class Produto {
    private String nome;
    private Double precoUnitario;
    private Double quantidadeEstoque;
    private Double valorEmEstoque;

    public String getNome() {
        return nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public double getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public Double getValorEmEstoque() {
        return precoUnitario * quantidadeEstoque;
    }

    public boolean isValido() {
        return nome!=null && nome.length() >= 2 &&
              precoUnitario!=null && precoUnitario >= 0.01 &&
              quantidadeEstoque!=null && quantidadeEstoque >= 0.01;
    }


}
