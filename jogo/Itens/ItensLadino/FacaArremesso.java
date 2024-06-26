package jogo.Itens.ItensLadino;

import jogo.personagens.herois.Personagem;

public class FacaArremesso extends ItemLadino
{
    private int aumentoModAtaque;
    private int aumentoDano;

    public FacaArremesso()
    {
        this.aumentoModAtaque = 2;
        this.aumentoDano = 2;
    }

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.setModificadorAtaquePersonagem(aumentoModAtaque + usuario.getModificadorAtaquePersonagem());
        usuario.setDanoPersonagem(aumentoDano + usuario.getDanoPersonagem());
        
        System.out.println("Ele obtém facas de arremesso, seu dano aumentou.");
    }
    @Override
    public String getNome() {
        return "Faca de Arremesso";
    }
}
