package exercicio9;

public class Main {
    public static void main(String args[]) {
        System.out.println("== Testes exercício 9 ==");
        
        Casa c = new Casa("Branca");
        
        System.out.println(c.toString());
        System.out.println("Portas abertas: " + c.quantasPortasEstaoAbertas());
        
        c.pinta("Azul");
        c.getPorta(1).abre();
        
        System.out.println(c.toString());
        System.out.println("Portas abertas agora: " + c.quantasPortasEstaoAbertas());
        
        Edificio e = new Edificio("Cinza", 10, 2);
        
        System.out.println(e.toString());
        System.out.println("Portas abertas: " + e.quantasPortasEstaoAbertas());
        
        e.pinta("Amarelo");
        e.getPorta(1).abre();
        e.getPorta(5).abre();
        
        System.out.println("Total de andares: " + e.getTotalAndares());
        e.adicionarAndar();
        
        System.out.println(e.toString());
        System.out.println("Portas abertas agora: " + e.quantasPortasEstaoAbertas());
        System.out.println("Total de andares agora: " + e.getTotalAndares());
    }    
}
