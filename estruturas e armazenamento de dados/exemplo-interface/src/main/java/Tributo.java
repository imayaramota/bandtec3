import java.util.ArrayList;
import java.util.List;

public class Tributo {
    private List<Tributavel> listaTributavel;

    public Tributo() {
        listaTributavel = new ArrayList<Tributavel>();
    }

    public void adicionarTributavel(Tributavel tributavel) {
        this.listaTributavel.add(tributavel);
        System.out.println("adicionado com sucesso");
    }

    public double calcularTotalAtributo(){
        double total = 0.0;
        System.out.println("\nTotal de Atributos");
        for (int i=0; i<listaTributavel.size(); ++i){
                total += listaTributavel.get(i).getValorAtributo();
        }
        return total;
    }

    public void exibeTodos(){
        System.out.println("\nLista de Atributos");
        for (int i=0; i<listaTributavel.size(); ++i){
            System.out.println(listaTributavel.get(i));
        }
    }

}
