package jogo.Itens.ItensLadino;

import jogo.personagens.herois.Personagem;

public class CapaSombria implements ItemLadino
{
    private int aumentoDefesa;

    public CapaSombria()
    {
        this.aumentoDefesa = 4;
    }

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.setClasseDeArmaduraPersonagem(aumentoDefesa + usuario.getClasseDeArmaduraPersonagem());        

        System.out.println("Ele equipa uma capa sombria, com isso sua defesa aumenta consideravelmente.");
    }
}
