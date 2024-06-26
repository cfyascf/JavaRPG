package jogo.Itens;

import jogo.personagens.herois.Personagem;
import jogo.ui.Utilidades;

public class Pocao implements Item
{
    public int aumentoVida = 2;
    
    @Override
    public void Usar(Personagem usuario)
    {
        usuario.setVidaPersonagem(usuario.getVidaPersonagem() + aumentoVida);
        Utilidades.printf("Poção tomada, energia restaurada.\n", 0.05);
    }

    @Override
    public String getNome() {
        return "Pocao";
    }
}
