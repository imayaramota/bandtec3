import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    private List<FuncionarioBonus> listaFunBonus;

    public ControleBonus() {

        listaFunBonus = new ArrayList<FuncionarioBonus>();
    }

    public void adicionarFunc(FuncionarioBonus funcBonus) {
        this.listaFunBonus.add(funcBonus);
        System.out.println("funcionario adicionado com sucesso!!");
    }

    public void exibeTodos(){
        System.out.println("\nLista de Funcionarios Bônus:");
        for (int i=0; i<listaFunBonus.size(); ++i){
            System.out.println(listaFunBonus.get(i));
        }
    }

    public double calcularTotal(){
        double total = 0.0;
        System.out.println("\nTotal de Bônus: ");
        for (int i=0; i<listaFunBonus.size(); i++){
            total += listaFunBonus.get(i).getValorBonus();
        }
        return total;
    }
}
