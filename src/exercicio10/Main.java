package exercicio10;

public class Main {
    public static void main(String args[]) {
        Monitor m = new Monitor("SX0001", "Samsung", 22, 1024, 768);
        PlacaVideo pv = new PlacaVideo("Geforce XXX", "NVIDIA", 2048);
        Processador p = new Processador("Core i7", "Intel", 4);
        
        System.out.println(m.toString());
        System.out.println(pv.toString());
        System.out.println(p.toString());        
    }
}
