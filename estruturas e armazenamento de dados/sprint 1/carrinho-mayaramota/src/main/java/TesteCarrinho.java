import java.util.Scanner;

public class TesteCarrinho {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorLine = new Scanner(System.in);

        Carrinho carrinho = new Carrinho();

        String descricao;
        Integer codigo;
        Integer quantHoras;
        Double valorHora;
        String nome;
        String autor;
        String isbn;
        String gravadora;
        Double precoCusto;
        Boolean fim = false;
        Integer opcao;

        do {
            System.out.println("Qual ação deseja realizar?\n"
                    + "Digite o número da opção: \n"
                    + "1 - Adicionar Livro \n"
                    + "2 - Adicionar DVD  \n"
                    + "3 - Adicionar Serviço  \n"
                    + "4 - Exibir itens do carrinho\n"
                    + "5 - Exibir total de venda \n"
                    + "6 - Fim");
            opcao = leitor.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("*Você escolheu adicionar um livro*");
                    System.out.printf("Informe o codigo do Livro: ");
                    codigo = leitor.nextInt();
                    System.out.printf("Informe o preço custo do Livro: ");
                    precoCusto = leitor.nextDouble();
                    System.out.printf("Informe o nome do Livro: ");
                    nome = leitorLine.nextLine();
                    System.out.printf("Informe o autor do Livro: ");
                    autor = leitorLine.nextLine();
                    System.out.printf("Informe o isbn do Livro: ");
                    isbn = leitorLine.nextLine();
                    Livro livro = new Livro(codigo, precoCusto, nome, autor, isbn);
                    carrinho.adicionarVendavel(livro);
                    break;
                case 2:
                    System.out.println("*Você escolheu adicionar um DVD*");
                    System.out.printf("Informe o codigo do DVD: ");
                    codigo = leitor.nextInt();
                    System.out.printf("Informe o preço custo do DVD: ");
                    precoCusto = leitor.nextDouble();
                    System.out.printf("Informe o nome do DVD: ");
                    nome = leitorLine.nextLine();
                    System.out.printf("Informe o nome da gravadora: ");
                    gravadora = leitorLine.nextLine();
                    Dvd dvd = new Dvd (codigo, precoCusto, nome, gravadora);
                    carrinho.adicionarVendavel(dvd);
                    break;
                case 3:
                    System.out.println("*Você escolheu adicionar um Serviço*");
                    System.out.printf("Informe a descrição do serviço: ");
                    descricao = leitorLine.nextLine();
                    System.out.printf("Informe o codigo do serviço: ");
                    codigo = leitor.nextInt();
                    System.out.printf("Informe a quantidade de horas: ");
                    quantHoras = leitor.nextInt();
                    System.out.printf("Informe o valor da hora: ");
                    valorHora = leitor.nextDouble();
                    Servico servico = new Servico(descricao, codigo, quantHoras, valorHora);
                    carrinho.adicionarVendavel(servico);
                    break;
                case 4:
                    carrinho.exibeItensCarrinho();
                    break;
                case 5:
                    System.out.println(carrinho.calcularTotalVenda());
                    break;
                case 6:
                    System.out.println("Fim bye, bye");
                    break;
                default:
                     fim = true;
                    System.out.println("Opção invalida! Digite uma opção válida!");
                    break;
            }
        } while (opcao != 6);
    }
}
