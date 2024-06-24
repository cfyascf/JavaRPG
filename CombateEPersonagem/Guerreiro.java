package CombateEPersonagem;
public class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(nome);
        this.fraseSuprema = "O"+ this.nomePersonagem+" carrega um poderoso ataque pesado e atinge o inimigo,";
    }
}