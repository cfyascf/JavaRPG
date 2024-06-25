package jogo.Itens.ItensMago;

import jogo.Itens.Item;
import jogo.personagens.herois.Personagem;

public abstract class ItemMago implements Item {
    @Override
    public abstract void Usar(Personagem usuario);
}
