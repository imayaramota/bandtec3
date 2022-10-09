import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Format;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class AppArquivoCsv {
    public static void gravarArquivoCsv(ListaObj<Produto> lista, String nomeArquivo){
        FileWriter arq = null; // obejto representa o arquivo de gravação
        Formatter saida = null; // obejto para gravar no arquivo
        Boolean deuRuim =  false;
        nomeArquivo += ".csv"; // acrescenta a extensão .csv ao nome do arquivo

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
//            saida.format("Id;Nome;Valor;Estoque\n");
            for (int i = 0; i < lista.getTamanho(); i++) {
                Produto p = lista.getElemento(i);
                saida.format("%d;%s;%.2f;%d\n",p.getId(),p.getNome(),p.getValorUnitario(),p.getQuantidadeEstoque());
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
        FileReader arq =  null; // objeto que representa o arquivo de
        Scanner entrada = null; // objeto para ler o arquivo
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
            System.out.printf("%-6S %-14S %10S %7S  \n","código","nome","valor","estoque");
            while (entrada.hasNext()){
                int id = entrada.nextInt();
                String nome= entrada.next();
                Double valor = entrada.nextDouble();
                int qtdEstoque = entrada.nextInt();
                System.out.printf("%06d %-14s %10.2f %7d \n", id,nome,valor,qtdEstoque);
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
        ListaObj<Produto> lista = new ListaObj<>(10);

        lista.adiciona(new Produto(100,"mouse",80.0,50));
        lista.adiciona(new Produto(200,"teclado",180.0,40));
        lista.adiciona(new Produto(300,"cabo usb",20.0,10));
        lista.adiciona(new Produto(400,"mouse pad",70.0,120));
        lista.adiciona(new Produto(500,"fone",100.0,56));

        lista.exibe();
        gravarArquivoCsv(lista,"produto");
        leExibeArquivoCsv("produto");
    }
}
