public class TesteAtributo {
    public static void main(String[] args) {
        Alimento a = new Alimento(11,"farinha",10.0,5);
        Perfume p = new Perfume(11,"floral",10.0,"flor de algodão");
        Servico s = new Servico("dedetizaçaõ",10.0);
        Tributo t = new Tributo();

        t.adicionarTributavel(a);
        t.adicionarTributavel(p);
        t.adicionarTributavel(s);

        t.exibeTodos();
        
        System.out.println(t.calcularTotalAtributo());
    }
}
