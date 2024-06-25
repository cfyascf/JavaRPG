package jogo.Itens.ItensArqueiro;

import jogo.Itens.Item;
import jogo.personagens.herois.Personagem;

public abstract class ItemArqueiro implements Item {
    @Override
    public abstract void Usar(Personagem usuario);
    
}
