public abstract class Funcionario {
    // Atributos
    private String cpf;
    private String nome;

    // Construtores
    public Funcionario(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    // Métodos
    public abstract Double calcSalario();

    // toString()
    @Override
    public String toString() {
        return "Dados Funcionario{" +
                "cpf: " + cpf + '\'' +
                "nome: " + nome + '\'' +
                '}';
    }
}
