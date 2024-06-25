package jogo.quests;


import jogo.personagens.herois.Personagem;

public class AcoesCombate implements AcoesLevel {
    Personagem inimigo, player;

    public AcoesCombate(Personagem inimigo, Personagem player) {
        this.inimigo = inimigo;
        this.player = player;
    }

    @Override
    public void executar() {
        
    }
    
}
