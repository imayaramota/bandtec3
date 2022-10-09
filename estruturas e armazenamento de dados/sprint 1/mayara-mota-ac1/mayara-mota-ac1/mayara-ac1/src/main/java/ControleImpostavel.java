import java.util.ArrayList;
import java.util.List;

public class ControleImpostavel {
    private List<Impostavel> listaImpostaveis;

    public ControleImpostavel() {
        listaImpostaveis = new ArrayList<Impostavel>();
    }

    public void adicionarImpostavel(Impostavel impostavel) {
        this.listaImpostaveis.add(impostavel);
        System.out.println("adicionado com sucesso");
    }

    public double calcularTotalImpostos(){
        double total = 0.0;
        System.out.println("\nTotal de Impostos");
        for (int i=0; i<listaImpostaveis.size(); i++){
            total += listaImpostaveis.get(i).getImposto();
        }
        return total;
    }

    public void exibeTodos(){
        System.out.println("\nLista de Impostaveis");
        for (int i=0; i<listaImpostaveis.size(); i++){
            System.out.println(listaImpostaveis.get(i));
        }
    }
}
