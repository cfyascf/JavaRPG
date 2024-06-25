package jogo.Itens.ItensGuerreiro;

import jogo.personagens.herois.Personagem;

public class EspadaLeve extends ItemGuerreiro
{
    private int aumentoModAtaque;
    private int aumentoDano;

    public EspadaLeve()
    {
        this.aumentoModAtaque = 2;
        this.aumentoDano = 2;
    }

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.setModificadorAtaquePersonagem(aumentoModAtaque + usuario.getModificadorAtaquePersonagem());
        usuario.setDanoPersonagem(aumentoDano + usuario.getDanoPersonagem());
        System.out.println("Ele empunha uma espada leve, seu dano aumentou um pouco.");
    }
}
