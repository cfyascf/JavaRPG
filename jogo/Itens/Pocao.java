package jogo.Itens;

import jogo.personagens.herois.Personagem;

public class Pocao implements Item
{
    private int aumentoVida = 2;

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.setVidaPersonagem(usuario.getVidaPersonagem() + aumentoVida);
        System.out.println("Poção tomada, energia restaurada.");
    }
}
