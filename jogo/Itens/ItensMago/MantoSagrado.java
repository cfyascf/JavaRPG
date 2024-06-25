package jogo.Itens.ItensMago;

import jogo.personagens.herois.Personagem;

public class MantoSagrado implements ItemMago
{
    private int aumentoDefesa;

    public MantoSagrado()
    {
        this.aumentoDefesa = 2;
    }

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.setClasseDeArmaduraPersonagem(aumentoDefesa + usuario.getClasseDeArmaduraPersonagem());        
        System.out.println("Ele se cobre com um manto sagrado, sua defesa aumentou um pouco.");
    }
}
