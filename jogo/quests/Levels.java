package jogo.quests;

import java.util.Iterator;
import java.util.LinkedList;

import jogo.personagens.herois.Personagem;


public class Levels {
    LinkedList<AcoesLevel> acoes;
    Iterator<AcoesLevel> iterator;
   

    public Levels(LinkedList<AcoesLevel> acoes) {
        this.acoes = acoes;
        iterator = this.acoes.iterator();
    }

    public boolean proximaAcao( Personagem personagem) {
        if (!iterator.hasNext()) {
            return false;
        }

        AcoesLevel atual = iterator.next();

        atual.executar(personagem);

        return true;
    }
}
