import java.util.Arrays;

public class ListaEstatica {

    // 01) Declarar vetor de int:
    // É inicializado no construtor
    private int vetor[];


    // 02) Criar atributo nroElem:
    // Tem dupla função: representa quantos elementos foram adicionado no vetor
    // Também o índice de onde será adicionado o próximo elemento
    private int nroElem;



    // 03) Criar Construtor:
    // Recebe como argumento o tamanho máximo do vetor
    // Cria vetor com tamanho máximo informado
    // Inicializa nroElem
    public ListaEstatica(int nroElem) {
        this.vetor = new int[nroElem];
        this.nroElem = 0;
    }


    // 04) Método adiciona:
    // Recebe o elemento a ser adicionado na lista
    // Se a lista estiver cheia usar IllegalStateException();
    public void adiciona(int novoElemento) {
        if (nroElem == vetor.length) {
            throw new IllegalStateException();
        } else {
            vetor[nroElem++] = novoElemento;
        }
    }


    // 05) Método busca:
    // Recebe o elemento a ser procurado na lista
    // Retorna o índice do elemento, se for encontrado
    // Retorna -1 se não encontrou
    public Integer busca(int elemEncontrado) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == elemEncontrado){
                return i;
            }
        }
        return -1;
    }

    // 06) Método removePeloIndice:
    // Recebe o índice do elemento a ser removido
    // Se o índice for inválido, retorna false
    // Se removeu, retorna true
    public boolean removePeloIndice(int indice) {
        if (indice < vetor.length && indice >= 0) {
            for (int i = indice; i < vetor.length - 1; i++) {
                vetor[i] = vetor[i + 1];
                vetor[i + 1] = vetor[i];
            }
            nroElem--;
            return true;
        }
        return false;
    }

    // 07) Método removeElemento
    // Recebe um elemento a ser removido
    // Utiliza os métodos busca e removePeloIndice
    // Retorna false, se não encontrou o elemento
    // Retorna true, se encontrou e removeu o elemento
    public Boolean removeElemento(int elemento) {
        return removePeloIndice(busca(elemento));
    }

    // 08 Método exibe:
    // Exibe os elementos da lista
    public void exibeElementos() {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

    public Boolean substitui(Integer valorAntigo, Integer valorNovo){
        for (int i = 0; i < vetor.length; i++){
            if (valorAntigo == vetor[i]){
                vetor[i] = valorNovo;
                return true;
            }
        }
        System.out.println("valor não encontrado");
        return false;
    }

    public Integer contaOcorrencias(Integer valor){
        Integer contador = 0;
        for (int i = 0; i < vetor.length; i++){
            if (valor == vetor[i]){
                contador++;
            }
        }
        return contador;
    }

    public Boolean adicionaNoInicio(Integer valorAdd){
        if (nroElem == vetor.length) {
            System.out.println("Lista cheia");
            return false;
        } else {
            for(int i = vetor.length-1;i>=0;i--){
            }
            return true;
        }
    }
    
    //Métodos getVetor e getNroElem
    //São usados nos testes
    public int getNroElem() {
        return nroElem;
    }

    public int[] getVetor() {
        return vetor;
    }
}
