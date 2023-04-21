package exercicio10;

public class Processador extends PecaComputador {
    private int nrThreads;

    public Processador(String nome, String marca, int nrThreads) {
        super(nome, marca);
        this.nrThreads = nrThreads;
    }

    public int getNrThreads() {
        return nrThreads;
    }

    public void setNrThreads(int nrThreads) {
        this.nrThreads = nrThreads;
    }
}
