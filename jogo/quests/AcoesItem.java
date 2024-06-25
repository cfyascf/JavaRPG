package jogo.quests;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

import jogo.Itens.Item;
import jogo.Itens.ItensArqueiro.ItemArqueiro;
import jogo.personagens.herois.*;

public class AcoesItem implements AcoesLevel {

    @Override
    public void executar(Personagem personagem) {
        Item item;

        if (personagem instanceof Arqueiro) {
            ServiceLoader<ItemArqueiro> loader = ServiceLoader.load(ItemArqueiro.class);
            List<Class<? extends ItemArqueiro>> items = new ArrayList<>();

            for (Item i : loader) {
                items.add(i.getClass());
            }

        }

        if (personagem instanceof Guerreiro) {

        }

        if (personagem instanceof Ladino) {

        }

        if (personagem instanceof Mago) {

        }

        
    }
    
}
