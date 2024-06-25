package quests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Levels {
    LinkedList<AcoesLevel> acoes;
    Iterator<AcoesLevel> iterator;

    public Levels(LinkedList<AcoesLevel> acoes) {
        this.acoes = acoes;
        iterator = this.acoes.iterator();
    }

    boolean proximaAcao() {
        if (!iterator.hasNext()) {
            return false;
        }

        AcoesLevel atual = iterator.next();

        atual.executar();

        return true;
    }
}
