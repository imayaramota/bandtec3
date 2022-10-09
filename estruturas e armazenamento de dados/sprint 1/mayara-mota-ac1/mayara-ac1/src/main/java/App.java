public class App {
    public static void main(String[] args) {
        Imovel imovel = new Imovel(100.0,100,"Paulista");
        TrabalhadorAssalariado trabalhadorAssalariado = new TrabalhadorAssalariado("Marcos","123.444.111-12",2000.0,10,100.0);
        TrabalhadorEmpresario trabalhadorEmpresario = new TrabalhadorEmpresario("Antolena","456.789.555-15",3000.0,100.0);
        ControleImpostavel controleImpostavel = new ControleImpostavel();

        controleImpostavel.adicionarImpostavel(imovel);
        controleImpostavel.adicionarImpostavel(trabalhadorAssalariado);
        controleImpostavel.adicionarImpostavel(trabalhadorEmpresario);

        controleImpostavel.exibeTodos();
        System.out.println(controleImpostavel.calcularTotalImpostos());

        //uma outra classe se encaixaria nesse diagrama seria uma classe chamada Produto, pois
        // pois cada produto tem seu imposto
    }
}
