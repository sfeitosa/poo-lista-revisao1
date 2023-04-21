package exercicio6;

public class Porta {
    private boolean aberta;
    private String cor;
    private int dimensaoX;
    private int dimensaoY;
    private int dimensaoZ;

    public Porta(String cor, int dimensaoX, int dimensaoY, int dimensaoZ) {
        this.cor = cor;
        this.dimensaoX = dimensaoX;
        this.dimensaoY = dimensaoY;
        this.dimensaoZ = dimensaoZ;
        this.aberta = false;
    }

    public String getCor() {
        return cor;
    }

    public int getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(int dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public int getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(int dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public int getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(int dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }

    public boolean estaAberta() {
        return aberta;
    }
    
    public void abre() {
        if (estaAberta()) {
            System.out.println("Porta já está aberta!");
        } else {
            System.out.println("Abrindo porta!");
            this.aberta = true;
        }
    }
    
    public void fecha() {
        if (!estaAberta()) {
            System.out.println("Porta já está fechada");
        } else {
            System.out.println("Fechando porta!");
            this.aberta = false;
        }        
    }
    
    public void pinta(String cor) {    
        if (this.cor.equals(cor)) {
            System.out.println("Porta já é da cor " + cor + ".");
        } else {
            System.out.println("Pintando a porta na cor " + cor + ".");
            this.cor = cor;
        }
    }
    
}
