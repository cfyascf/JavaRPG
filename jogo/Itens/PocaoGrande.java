package jogo.Itens;

import jogo.personagens.herois.Personagem;

public class PocaoGrande implements Item
{
    private int aumentoVida = 4;

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.setVidaPersonagem(usuario.getVidaPersonagem() + aumentoVida);
        System.out.println("Ele tomou uma poção grande, muita energia foi recuperada.");
    }
}
