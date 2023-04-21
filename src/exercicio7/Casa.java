package exercicio7;

import exercicio6.Porta;

public class Casa {
    private String cor;
    private Porta porta1;
    private Porta porta2;
    private Porta porta3;

    public Casa(String cor) {
        this.cor = cor;
        porta1 = new Porta("Branca", 200, 80, 10);
        porta2 = new Porta("Branca", 200, 80, 10);
        porta3 = new Porta("Branca", 200, 80, 10);
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String getCor() {
        return cor;
    }

    public Porta getPorta1() {
        return porta1;
    }

    public Porta getPorta2() {
        return porta2;
    }

    public Porta getPorta3() {
        return porta3;
    }
    
    public void pinta(String cor) {    
        if (this.cor.equals(cor)) {
            System.out.println("Casa já é da cor " + cor + ".");
        } else {
            System.out.println("Pintando a casa na cor " + cor + ".");
            this.cor = cor;
        }
    }
    
    public int quantasPortasEstaoAbertas() {
        int cont = 0;
        
        if (porta1.estaAberta()) cont++;
        if (porta2.estaAberta()) cont++;
        if (porta3.estaAberta()) cont++;
        
        return cont;
    }
    
    
}
