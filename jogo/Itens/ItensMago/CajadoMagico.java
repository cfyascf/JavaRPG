package jogo.Itens.ItensMago;

import jogo.personagens.herois.Personagem;

public class CajadoMagico implements ItemMago
{
    private int aumentoModAtaque;
    private int aumentoDano;

    public CajadoMagico()
    {
        this.aumentoModAtaque = 2;
        this.aumentoDano = 2;
    }

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.setModificadorAtaquePersonagem(aumentoModAtaque + usuario.getModificadorAtaquePersonagem());
        usuario.setDanoPersonagem(aumentoDano + usuario.getDanoPersonagem());

        System.out.println("Ele empunha seu cajado mágico, com isso, seu ataque aumenta um pouco.");
    }
}
