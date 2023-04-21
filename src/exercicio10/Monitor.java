package exercicio10;

public class Monitor extends PecaComputador {
    private int nrPolegadas;
    private int resolucaoX;
    private int resolucaoY;

    public Monitor(String nome, String marca, int nrPolegadas, int resolucaoX, int resolucaoY) {
        super(nome, marca);
        this.nrPolegadas = nrPolegadas;
        this.resolucaoX = resolucaoX;
        this.resolucaoY = resolucaoY;
    }

    public int getNrPolegadas() {
        return nrPolegadas;
    }

    public void setNrPolegadas(int nrPolegadas) {
        this.nrPolegadas = nrPolegadas;
    }

    public int getResolucaoX() {
        return resolucaoX;
    }

    public void setResolucaoX(int resolucaoX) {
        this.resolucaoX = resolucaoX;
    }

    public int getResolucaoY() {
        return resolucaoY;
    }

    public void setResolucaoY(int resolucaoY) {
        this.resolucaoY = resolucaoY;
    }
}
