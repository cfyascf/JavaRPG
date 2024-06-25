package jogo.Itens;

import jogo.personagens.herois.Personagem;

public class PocaoGrande extends Pocao
{
    public int aumentoVida = 4;

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.setVidaPersonagem(usuario.getVidaPersonagem() + aumentoVida);
        System.out.println("Ele tomou uma poção grande, muita energia foi recuperada.");
    }
}
