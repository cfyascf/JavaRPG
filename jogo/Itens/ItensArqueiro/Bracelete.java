package jogo.Itens.ItensArqueiro;

import jogo.personagens.herois.Personagem;

public class Bracelete extends ItemArqueiro
{
    private int aumentoDefesa = 4;

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.setClasseDeArmaduraPersonagem(aumentoDefesa + usuario.getClasseDeArmaduraPersonagem());        
        System.out.println("Bracelete de proteção equipado, defesa aumentou consideravelmente.");
    }
}
