package exercicio9;

public class Edificio extends Imovel {
    private int totalAndares;

    public Edificio(String cor, int totalPortas, int totalAndares) {
        super(cor, totalPortas);
        this.totalAndares = totalAndares;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void adicionarAndar() {
        this.totalAndares++;
    }
}
