public class ListaObj <T> {
    private T[] vetor;
    private int nroElem;

    public ListaObj (int tamanho) {
        vetor = (T[])new Object[tamanho];
        nroElem = 0;
    }

    public void adiciona (T novoElemento) {
        if (nroElem >= vetor.length) {    // Lista está cheia
            throw new IllegalStateException();
        }
        else {
            vetor[nroElem++] = novoElemento;
        }
    }

    public int busca(T novoElemento) {
        for(int i = 0; i < nroElem; i++) {
            if (vetor[i].equals(novoElemento)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removePeloIndice(int indice) {
        if (indice < 0 || indice >= nroElem) {
            return false;
        }
        else {
            for (int i = indice; i < nroElem-1; i++) {
                vetor[i] = vetor[i+1];
            }
            nroElem--;
            return true;
        }
    }

    public boolean removeElemento(T novoElemento) {
        return removePeloIndice(busca(novoElemento));
    }

    public int getTamanho(){
        return nroElem;
    }

    public T getElemento(int indice){
        if (indice < 0 || indice >= nroElem) {
            return null;
        }
        return vetor[indice];
    }

    public void limpa(){
        nroElem = 0;
    }

    public void exibe() {
        if (nroElem == 0) {
            System.out.println("Lista vazia!");
        }
        else {
            for (int i = 0; i < nroElem; i++) {
                System.out.println(vetor[i]);
            }
        }
    }

    public T[] getVetor() {
        return null;
    }

    public int getNroElem() {
        return nroElem;
    }
}

