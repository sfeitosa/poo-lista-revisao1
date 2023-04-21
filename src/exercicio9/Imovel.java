package exercicio9;

import exercicio6.Porta;

public class Imovel {
    private String cor;
    private int totalPortas;
    private Porta[] portas;
    
    public Imovel(String cor, int totalPortas) {
        this.cor = cor;
        this.totalPortas = totalPortas;
        this.portas = new Porta[totalPortas];
        
        for (int i = 0; i < totalPortas; i++) {
            this.portas[i] = new Porta(cor, 200, 80, 10);
        }        
    }
    
    public void pinta(String cor) {    
        if (this.cor.equals(cor)) {
            System.out.println("Imóvel já é da cor " + cor + ".");
        } else {
            System.out.println("Pintando o imóvel na cor " + cor + ".");
            this.cor = cor;
        }
    }
    
    public int quantasPortasEstaoAbertas() {
        int cont = 0;
        
        for (int i = 0; i < totalPortas; i++) {
            if (portas[i].estaAberta()) {
                cont++;
            }
        }
        
        return cont;
    }
    
    public int getTotalPortas() {
        return totalPortas;
    }
    
    public String getCor() {
        return cor;
    }
    
    public Porta getPorta(int i) {
        if (i >= 0 && i < totalPortas) {
            return portas[i];
        } else {
            System.out.println("Porta inválida!");
            return null;
        }
    }

    @Override
    public String toString() {
        return "Imovel{" + "cor=" + cor + ", totalPortas=" + totalPortas + '}';
    }    
}
