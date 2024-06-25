package jogo.Itens.ItensLadino;

import jogo.Itens.Item;
import jogo.personagens.herois.Personagem;

public abstract class ItemLadino implements Item {
        @Override
    public abstract void Usar(Personagem usuario);
}
