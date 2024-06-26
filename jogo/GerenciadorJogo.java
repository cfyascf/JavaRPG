package jogo;

import java.util.List;
import java.util.Random;

import jogo.personagens.herois.Personagem;
import jogo.raids.Quest;
import jogo.raids.quests.CidadeAssombrada;
import jogo.raids.quests.FlorestaProibida;
import jogo.raids.quests.ReinoSubmerso;
import jogo.raids.quests.RuinaAntiga;
import jogo.ui.Panels;
import jogo.ui.Utilidades;

public class GerenciadorJogo {
    Personagem personagem;
    
    public GerenciadorJogo(Personagem p) {
        this.personagem = p;
    }

    public List<String> inventario() {
        return personagem.listaDeItens
            .stream()
            .map(x -> x.getNome())
            .toList(); 
    }

    public void iniciarRaid() {
        Random rd = new Random(); 
        int quest = rd.nextInt(3);

        Quest generatedQuest = null;
        switch (quest) {
            case 0:
                Utilidades.clear();
                Panels.FlorestaProibida();
                Utilidades.skipLine();
                generatedQuest = new FlorestaProibida(personagem);
                break;
            case 1:
                Utilidades.clear();
                Panels.CidadeAssombrada();
                Utilidades.skipLine();
                generatedQuest = new CidadeAssombrada(personagem); 
                break;
            case 2:
                Utilidades.clear();
                Panels.ReinoSubmerso();
                Utilidades.skipLine();
                generatedQuest = new ReinoSubmerso(personagem); 
                break;
            case 3:
                Utilidades.clear();
                Panels.RuinaAntiga();
                Utilidades.skipLine();
                generatedQuest = new RuinaAntiga(personagem); 
                break;
        }

        if (generatedQuest == null) {
            return;
        }

        generatedQuest.start(); 
    }
}
