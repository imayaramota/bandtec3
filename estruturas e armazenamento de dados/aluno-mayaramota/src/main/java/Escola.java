import java.util.ArrayList;
import java.util.List;

public class Escola {
    private String nome;

    private List<Aluno> listaAlunos;

    public Escola(String nome) {
        this.nome = nome;
        listaAlunos = new ArrayList<Aluno>();
    }

    public void addAlunos(Aluno aluno){
        this.listaAlunos.add(aluno);
        System.out.println("\nAluno adicionado com sucesso");
    }
    public void exibeTodos(){
        System.out.println("\nLista de Alunos");
        for (int i=0; i<listaAlunos.size(); ++i){
            System.out.println(listaAlunos.get(i));
        }
    }
    public void exibeAlunosGraduacao(){
        System.out.println("\nLista de Alunos Graduação");
        for (int i=0; i<listaAlunos.size(); ++i){
            if (listaAlunos.get(i) instanceof AlunoGraduacao){
                System.out.println(listaAlunos.get(i));
            }
        }
    }
    public void exibeAprovados(){
        System.out.println("\nLista de Alunos Aprovados");
        for (int i=0; i<listaAlunos.size(); ++i){
            if (listaAlunos.get(i).calculaMedia() >= 6){
                System.out.println(listaAlunos.get(i));
            }
        }
    }
    public void buscaAluno(Integer raInformado){
        boolean exists = false;
        for (int i=0; i<listaAlunos.size(); ++i){
            if (listaAlunos.get(i).ra.equals(raInformado)){
                System.out.println("\nDados do Aluno, busca por RA");
                System.out.println(listaAlunos.get(i));
                exists = true;
            }
        }
        if (!exists){
            System.out.println("\nAluno não encontrado");
        }
    }
}
