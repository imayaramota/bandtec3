public abstract class FuncionarioBonus {
    private String nome;
    public FuncionarioBonus(String nome) {
        this.nome = nome;
    }

    public abstract Double getValorBonus();

    @Override
    public String toString() {
        return "FuncionarioBonus{" +
                "nome:'" + nome +
                '}';
    }
}
