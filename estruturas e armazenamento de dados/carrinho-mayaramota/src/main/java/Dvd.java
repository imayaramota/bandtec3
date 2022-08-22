public class Dvd extends Produto{
    private String nome;
    private String nomeGravadora;

    public Dvd(int codigo, double precoCusto, String nome, String nomeGravadora) {
        super(codigo, precoCusto);
        this.nome = nome;
        this.nomeGravadora = nomeGravadora;
    }

    @Override
    public Double getValorVenda() {
        return getPrecoCusto() * 0.20;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeGravadora() {
        return nomeGravadora;
    }

    public void setNomeGravadora(String nomeGravadora) {
        this.nomeGravadora = nomeGravadora;
    }

    @Override
    public String toString() {
        return "Dvd{" +
                "nome='" + nome + '\'' +
                ", nome gravadora='" + nomeGravadora + '\'' +
                "} " + super.toString();
    }
}
