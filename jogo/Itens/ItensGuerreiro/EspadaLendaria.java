package jogo.Itens.ItensGuerreiro;

import jogo.personagens.herois.Personagem;

public class EspadaLendaria implements ItemGuerreiro
{
    private int aumentoModAtaque;
    private int aumentoDano;

    public EspadaLendaria()
    {
        this.aumentoModAtaque = 4;
        this.aumentoDano = 4;
    }

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.setModificadorAtaquePersonagem(aumentoModAtaque + usuario.getModificadorAtaquePersonagem());
        usuario.setDanoPersonagem(aumentoDano + usuario.getDanoPersonagem());
        
        System.out.println("Ele empunha a espada lendária, seu dano aumentou consideravelmente.");
    }
}
