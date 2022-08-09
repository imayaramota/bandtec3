public abstract class Aluno {
    Integer ra;
    String nome;

    public Aluno(Integer ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    public abstract Double calculaMedia();

    @Override
    public String toString() {
        return "Aluno{" + "ra:" + ra + ", nome:'" + nome + '\'' + '}';
    }
}
