package CombateEPersonagem;

public class Arqueiro extends Personagem{
    public Arqueiro(String nome) {
        super(nome);
        this.fraseSuprema = "O "+ this.nomePersonagem+" atira uma rajada de flechas, atingindo ferozmente o inimigo, ";
        
        this.listaDeItens.add(new ArcoEncantado());
        this.listaDeItens.add(new ArcoNegro());
        this.listaDeItens.add(new Elmo());
        this.listaDeItens.add(new Bracelete());
    }
}
