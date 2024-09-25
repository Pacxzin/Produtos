
// Classe que representa o produto
class Produto {
    String nome;
    String marca;
    double pc;
    double pv;

    // Construtor da classe Produto
    Produto(String nome, String marca, double pc, double pv) {
        this.nome = nome; 
        this.marca = marca; 
        this.pc = pc;     
        this.pv = pv;     
    }

    // Método para calcular o lucro em cima do produto (pv - pc)
    double calcularLucro() {
        return pv - pc;
    }
}

// Classe que representa a pessoa
class Pessoa {
    String nome;
    String sobrenome;
    double altura;
    String dataNascimento;

    // Construtor da classe Pessoa
    Pessoa(String nome, String sobrenome, double altura, String dataNascimento) {
        this.nome = nome;       
        this.sobrenome = sobrenome;  
        this.altura = altura;        
        this.dataNascimento = dataNascimento; 
    }

    // Método para gerar o email (Nome + sobrenome + @dominio.com)
    String gerarEmail() {
        return nome.toLowerCase() + "." + sobrenome.toLowerCase() + "@dominio.com"; // Gera o email no formato "nome.sobrenome@dominio.com"
    }
}

// Classe Main p execultar o code
public class Main {
    
    public static void main(String[] args) {

        // Instancias dos produtos
        Produto p1 = new Produto("Cerveja", "Brahma", 2.00, 3.00);
        Produto p2 = new Produto("Refrigerante", "Coca Cola", 1.50, 3.00);
        Produto p3 = new Produto("Suco de Laranja", "Prats", 2.00, 3.00);
        Produto p4 = new Produto("Água Mineral", "Crystal", 0.80, 1.50);
        Produto p5 = new Produto("Energético", "Monster", 4.00, 8.00);
        Produto p6 = new Produto("Vinho", "Casa del Diablo", 15.00, 30.00);
        Produto p7 = new Produto("Cerveja", "Skol", 2.50, 4.00);
        Produto p8 = new Produto("Chá Gelado", "Lipton", 2.00, 4.50);
        Produto p9 = new Produto("Soda", "Fanta", 1.75, 3.50);
        Produto p10 = new Produto("Água Tônica", "Schweppes", 2.20, 4.00);

        // Instancia pessoa
        Pessoa pessoa1 = new Pessoa("João", "Silva", 1.75, "1990-05-15");

        // Mostrando o email da pessoa
        System.out.println("Email: " + pessoa1.gerarEmail());
        
        // mostrando o lucro em cima do(s) produto(s)
        System.out.println("Lucro da " + p1.nome + ": R$ " + p1.calcularLucro());
    }
}