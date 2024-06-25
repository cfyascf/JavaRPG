package jogo.quests;

import java.util.List;

import jogo.personagens.herois.Personagem;

public class Quest {
    List<Levels> levels;
    Personagem personagem;

    public Quest(List<Levels> niveisQuest, Personagem personagem) {
        levels = niveisQuest;
        this.personagem = personagem;
    }

    public void start() {
        for (Levels level : levels) {
            while (level.proximaAcao());
        }
    }
}
