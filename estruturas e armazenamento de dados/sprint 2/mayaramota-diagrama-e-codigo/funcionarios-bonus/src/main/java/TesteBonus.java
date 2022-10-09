public class TesteBonus {
    public static void main(String[] args) {
        Coordenadores c1 = new Coordenadores("Carvalho",10,100.0);
        Professor p1 = new Professor("Marcola",10,100.0);

        ControleBonus controleBonus = new ControleBonus();

        controleBonus.adicionarFunc(c1);
        controleBonus.adicionarFunc(p1);

        controleBonus.exibeTodos();

        System.out.println(controleBonus.calcularTotal());
    }
}