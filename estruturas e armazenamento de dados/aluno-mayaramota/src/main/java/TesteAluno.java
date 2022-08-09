public class TesteAluno {
    public static void main(String[] args) {
        Escola e = new Escola("petropolis");
        AlunoFundamental af = new AlunoFundamental(123,"maria",6.0,6.0,6.0,6.0);
        AlunoGraduacao ag = new AlunoGraduacao(321,"joão",10.0,7.0);
        AlunoPos ap = new AlunoPos(456,"filomena",6.0,5.5,6.0);

        e.addAlunos(af);
        e.addAlunos(ag);
        e.addAlunos(ap);

        e.exibeTodos();
        e.exibeAlunosGraduacao();
        e.exibeAprovados();
        e.buscaAluno(123);


    }
}
