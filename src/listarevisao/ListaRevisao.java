package listarevisao;

import exercicio4.Data;
import exercicio5.Pessoa;
import exercicio6.Porta;
import exercicio7.Casa;
import exercicio8.Edificio;

public class ListaRevisao {

    public static void main(String[] args) {
        // Testes exercício 4
        System.out.println("== Testes exercício 4 ==");
        Data d = new Data(21, 4, 2023);
        
        System.out.println("Data formato brasileiro: " + d.getDataBr());
        System.out.println("Data formato americano: " + d.getDataEn());
        
        // Testes exercício 5
        System.out.println("== Testes exercício 5 ==");
        Pessoa p = new Pessoa("João", 15);
        p.fazAniversario();
        
        System.out.println("Idade após aniversário: " + p.getIdade());
        
        // Testes exercício 6
        System.out.println("== Testes exercício 6 ==");
        Porta porta1 = new Porta("Branca", 200, 80, 10);
        
        porta1.abre();
        porta1.abre();
        porta1.fecha();
        porta1.pinta("Branca");
        porta1.pinta("Azul");
        
        // Testes exercício 7
        System.out.println("== Testes exercício 7 ==");
        Casa c = new Casa("Verde");
        
        c.pinta("Azul");
        
        System.out.println("Portas abertas: " + c.quantasPortasEstaoAbertas());
        
        c.getPorta1().abre();
        c.getPorta3().abre();
        
        System.out.println("Portas abertas agora: " + c.quantasPortasEstaoAbertas());
        
        // Testes exercício 8
        System.out.println("== Testes exercício 8 ==");
        Edificio e = new Edificio("Vermelho", 5, 2);
        
        e.pinta("Cinza");
        e.adicionarAndar();
        
        System.out.println("Total de andares: " + e.getTotalAndares());
        System.out.println("Total de portas: " + e.getTotalPortas());     
        
        // Testes do exercício 9 estão na classe Main do pacote exercicio9
        
        // Testes do exercício 10 estão na classe Main do pacote exercicio10
    }
    
}
