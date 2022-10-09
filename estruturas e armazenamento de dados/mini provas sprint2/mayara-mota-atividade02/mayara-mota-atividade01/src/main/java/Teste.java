import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Format;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Teste {
    public static void gravarArquivoCsv(ListaObj<Eletronico> listaEletronicos, String nomeArquivo){
        FileWriter arq = null;
        Formatter saida = null;
        Boolean deuRuim =  false;
        nomeArquivo += ".csv";

        // bloco para abrir o arquivo
        try {
            arq = new FileWriter(nomeArquivo);
            saida = new Formatter(arq);
        }
        catch (IOException erro){
            System.out.println("Erro ao abrir o arquivo");
            System.exit(0);
        }

        // bloco para gravar o arquivo
        try {
            for (int i = 0; i < listaEletronicos.getTamanho(); i++) {
                Eletronico p = listaEletronicos.getElemento(i);
                saida.format("%d;%s;%s;%.2f;%d\n",p.getId(),p.getNome(),p.getCategoria(),p.getValor(),p.getQuantidadeEmEstoque());
            }
        }
        catch (FormatterClosedException erro){
            System.out.println("Erro ao gravar o arquivo");
            System.exit(0);
        }
        finally {
            saida.close();
            try {
                arq.close();
            }
            catch (IOException erro){
                System.out.println("Erro ao fechar o arquivo");
                deuRuim = true;
            }
            if (deuRuim){
                System.exit(1);
            }
        }


    }
    public static void leExibeArquivoCsv(String nomeArquivo){
        FileReader arq =  null;
        Scanner entrada = null;
        Boolean deuRuim = false;
        nomeArquivo += ".csv";

        // bloco para abrir o arquivo
        try {
            arq= new FileReader(nomeArquivo);
            entrada = new Scanner(arq).useDelimiter(";|\\n");

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
            System.exit(1);
        }

        // bloco para ler o arquivo
        try {
            System.out.printf("%-6S %-14S %-10S %10S %7S  \n","código","produto","categoria","valor","estoque");
            while (entrada.hasNext()){
                int id = entrada.nextInt();
                String nome= entrada.next();
                String categoria= entrada.next();
                Double valor = entrada.nextDouble();
                int qtdEstoque = entrada.nextInt();
                System.out.printf("%06d %-14s %-10s %10.2f %7d \n", id,nome,categoria,valor,qtdEstoque);
            }
        }
        catch (NoSuchElementException erro){
            System.out.println("Arquivo com problemas");
            deuRuim = true;
        }
        catch (IllegalStateException erro){
            System.out.println("Erro na leitura do arquivo");
            deuRuim = true;
        }
        finally {
            entrada.close();
            try {
                arq.close();
            }
            catch (IOException erro){
                System.out.println("Erro ao fechar o arquivo");
                deuRuim = true;
            }
            if (deuRuim){
                System.exit(1);
            }
        }
    }

    public static void main(String[] args) {
        Integer opcao = 0;
        Scanner leitor = new Scanner(System.in);
        Scanner leitor2 = new Scanner(System.in);
        Scanner leitorNl = new Scanner(System.in);
        System.out.println("Loja de Eletrônicos MM!");

        ListaObj<Eletronico> listaEletronicos = new ListaObj<>(10);

        do{
            System.out.println("Escolha uma opção: (digite 1, 2, 3, 4 ou 5)");
            System.out.println("1 - Cadastrar um Eletrônico");
            System.out.println("2 - Exibir todos Eletrônicos Cadastrados");
            System.out.println("3 - Gravar todos Eletrônicos Cadastrados em .csv");
            System.out.println("4 - Ler todos Eletrônicos Cadastradosem .csv");
            System.out.println("5 - Sair do Sistema");
            opcao = leitor.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o identificador desse eletrônicos:");
                    int id = leitor.nextInt();

                    System.out.println("Digite o nome:");
                    String nome = leitorNl.nextLine();

                    System.out.println("Digite a categoria:");
                    String categoria = leitorNl.nextLine();

                    System.out.println("Digite o valor:");
                    Double valor = leitor.nextDouble();

                    System.out.println("Digite a quantidade disponivel em estoque em estoque:");
                    int qtdEstoque = leitor.nextInt();

                    listaEletronicos.adiciona(new Eletronico(id,nome,categoria,valor,qtdEstoque));

                    System.out.println("Produto adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("");
                    System.out.printf("%-6s %-14s %-10s %10s %-7s \n", "CÓDIGO", "PRODUTO", "CATEGORIA", "VALOR", "ESTOQUE");
                    for (int i = 0; i < listaEletronicos.getTamanho(); i++){
                        Eletronico e = listaEletronicos.getElemento(i);
                        System.out.printf("%06d %-14s %-10s %10.2f %7d \n", e.getId(),e.getNome(),e.getCategoria(),e.getValor(),e.getQuantidadeEmEstoque());
                    }
                    System.out.printf("");
                    break;
                case 3:
//                    System.out.println("Gravando...");
                    gravarArquivoCsv(listaEletronicos,"Eletrônicos Loja MM");
                    break;
                case 4:
//                    System.out.println("Lendo...");
                    leExibeArquivoCsv("Eletrônicos Loja MM");
                    break;
                case 5:
                    System.out.println("Obrigada por utilizar nosso sistema :)");
                    break;
                default:
                    System.out.println("Opção digitada inválida!!");
                    break;
            }
        }while (opcao != 5);
    }
}
