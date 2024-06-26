package jogo.Itens;

import jogo.personagens.herois.Personagem;
import jogo.ui.Utilidades;

public class PocaoGrande extends Pocao
{
    public int aumentoVida = 4;

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.setVidaPersonagem(usuario.getVidaPersonagem() + aumentoVida);
        Utilidades.printf("Ele tomou uma poção grande, muita energia foi recuperada.\n", 0.05);
    }

    @Override
    public String getNome() {
        return "Pocao Grande";
    }
}
