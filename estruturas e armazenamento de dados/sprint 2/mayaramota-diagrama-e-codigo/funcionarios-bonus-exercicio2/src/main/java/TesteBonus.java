public class TesteBonus {
    public static void main(String[] args) {
        Coordenador c1 = new Coordenador("Jo0ão",5,100.0,10,200.0);
        Professor p1 = new Professor("Valadares", 10,150.0);

        ControleBonus controleBonus = new ControleBonus();

        controleBonus.adicionarFunc(c1);
        controleBonus.adicionarFunc(p1);

        controleBonus.exibeTodos();

        controleBonus.calcularTotal();
    }
}
