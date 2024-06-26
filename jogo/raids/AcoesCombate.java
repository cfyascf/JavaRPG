package jogo.raids;


import jogo.combate.Combate;
import jogo.personagens.herois.Personagem;
import jogo.personagens.monstros.Monstros;

public class AcoesCombate implements AcoesLevel {
    Monstros monstro;

    public AcoesCombate(Monstros inimigo) {
        this.monstro = inimigo;
    }

    @Override
    public void executar(Personagem personagem) {
        new Combate().iniciarCombate(personagem, monstro);
    }
    
}
