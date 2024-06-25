package jogo.Itens.ItensMago;

import jogo.personagens.herois.Personagem;

public class CetroRaios extends ItemMago
{
    private int aumentoModAtaque;
    private int aumentoDano;

    public CetroRaios()
    {
        this.aumentoModAtaque = 4;
        this.aumentoDano = 4;
    }

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.setModificadorAtaquePersonagem(aumentoModAtaque + usuario.getModificadorAtaquePersonagem());
        usuario.setDanoPersonagem(aumentoDano + usuario.getDanoPersonagem());
        System.out.println("Ele conjura um cetro de raios, com isso, seu ataque aumenta consideravelmente.");
    }
}
