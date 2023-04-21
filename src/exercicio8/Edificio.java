package exercicio8;

import exercicio6.Porta;

public class Edificio {
    private String cor;
    private int totalPortas;
    private int totalAndares;
    private Porta[] portas;
    
    public Edificio(String cor, int totalPortas, int totalAndares) {
        this.cor = cor;
        this.totalPortas = totalPortas;
        this.totalAndares = totalAndares;
        portas = new Porta[totalPortas];
        
        for (int i = 0; i < totalPortas; i++) {
            portas[0] = new Porta("Branca", 200, 80, 10);
        }
    }
    
    public void pinta(String cor) {    
        if (this.cor.equals(cor)) {
            System.out.println("Edifício já é da cor " + cor + ".");
        } else {
            System.out.println("Pintando o edifício na cor " + cor + ".");
            this.cor = cor;
        }
    }
    
    public int getTotalPortas() {
        return totalPortas;
    }
    
    public int getTotalAndares() {
        return totalAndares;
    }
    
    public void adicionarAndar() {
        this.totalAndares++;
    }
    
    public Porta getPorta(int i) {
        if (i >= 0 && i < totalPortas) {
            return portas[i];
        } else {
            System.out.println("Porta inválida!");
            return null;
        }
    }    
}
