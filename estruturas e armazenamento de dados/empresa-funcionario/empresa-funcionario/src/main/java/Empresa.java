import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Funcionario> listaFuncionarios;

    public Empresa() {
        listaFuncionarios = new ArrayList<Funcionario>();
    }

    public void addFuncionarios(Funcionario funcionario){
        this.listaFuncionarios.add(funcionario);
        System.out.println("Funcionário adicionado com sucesso");
    }
    public void exibeTodos(){
        System.out.println("Lista de Funcionários");
        for (int i=0; i<listaFuncionarios.size(); ++i){
            System.out.println(listaFuncionarios.get(i));
        }
    }
    public void exibeTotalSalario(){
        for (int i=0; i<listaFuncionarios.size(); ++i){
            double totalSalarios = 0;
            totalSalarios+= listaFuncionarios.get(i).calcSalario();
            System.out.println("Total dos Salario:" + String.format("R$ %.2f ",totalSalarios));
        }
    }
    public void exibeHoristas(){
        System.out.println("Lista de Funcionários Horista");
        for (int i=0; i<listaFuncionarios.size(); ++i){
            if (listaFuncionarios instanceof Horista){
                System.out.println(listaFuncionarios.get(i));
            }
        }
    }

}
