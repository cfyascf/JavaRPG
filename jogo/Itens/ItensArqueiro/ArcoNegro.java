package jogo.Itens.ItensArqueiro;

import jogo.personagens.herois.Personagem;

public class ArcoNegro implements ItemArqueiro
{
    private int aumentoModAtaque = 1;
    private int aumentoDano = 1;

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.setModificadorAtaquePersonagem(aumentoModAtaque + usuario.getModificadorAtaquePersonagem());
        usuario.setDanoPersonagem(aumentoDano + usuario.getDanoPersonagem());
        
        System.out.println("Arco negro foi equipado, o dano aumentou um pouco.");
    }
}
