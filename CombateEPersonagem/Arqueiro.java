package CombateEPersonagem;

public class Arqueiro extends Personagem{
    public Arqueiro(String nome) {
        super(nome);
        this.fraseSuprema = "O "+ this.nomePersonagem+" atira uma rajada de flechas, atingindo ferozmente o inimigo, ";
    }
}
