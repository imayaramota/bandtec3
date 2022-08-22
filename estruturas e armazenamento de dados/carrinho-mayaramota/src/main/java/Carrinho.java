import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Vendavel> listaVendavel;

    public Carrinho() {
        listaVendavel = new ArrayList<Vendavel>();
    }

    public void adicionarVendavel(Vendavel vendavel) {
        this.listaVendavel.add(vendavel);
        System.out.println("adicionado com sucesso");
    }

    public double calcularTotalVenda(){
        double total = 0.0;
        System.out.println("\nTotal de Vendas");
        for (int i=0; i<listaVendavel.size(); ++i){
            total += listaVendavel.get(i).getValorVenda();
        }
        return total;
    }

    public void exibeItensCarrinho(){
        System.out.println("\nLista de Vendas");
        for (int i=0; i<listaVendavel.size(); ++i){
            System.out.println(listaVendavel.get(i));
        }
    }

}
