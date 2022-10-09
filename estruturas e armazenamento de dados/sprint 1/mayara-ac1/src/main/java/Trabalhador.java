public  abstract class Trabalhador implements Impostavel {
    private String nome;
    private String cpf;
    private double salario;

    public Trabalhador(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public abstract double getRenda();

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Trabalhador{" +
                "nome:'" + nome + '\'' +
                ", cpf:'" + cpf + '\'' +
                ", salario:" + salario +
                '}';
    }
}
