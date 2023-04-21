package exercicio10;

public class PecaComputador {
    private String nome;
    private String marca;

    public PecaComputador(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "PecaComputador{" + "nome=" + nome + ", marca=" + marca + '}';
    }
}
