package exercicio10;

public class PlacaVideo extends PecaComputador {
    private int nrCores;
    
    public PlacaVideo(String nome, String marca, int nrCores) {
        super(nome, marca);
        
        this.nrCores = nrCores;
    }

    public int getNrCores() {
        return nrCores;
    }

    public void setNrCores(int nrCores) {
        this.nrCores = nrCores;
    }
}
