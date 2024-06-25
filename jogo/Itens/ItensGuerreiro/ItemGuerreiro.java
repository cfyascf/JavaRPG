package jogo.Itens.ItensGuerreiro;

import jogo.Itens.Item;
import jogo.personagens.herois.Personagem;

public abstract class ItemGuerreiro implements Item {

    @Override
    public abstract void Usar(Personagem usuario);
    
}
