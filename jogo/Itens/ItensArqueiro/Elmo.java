package jogo.Itens.ItensArqueiro;

import jogo.personagens.herois.Personagem;

public class Elmo implements ItemArqueiro
{
    private int aumentoDefesa;

    public Elmo()
    {
        this.aumentoDefesa = 2;
    }

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.setClasseDeArmaduraPersonagem(aumentoDefesa + usuario.getClasseDeArmaduraPersonagem());        
        System.out.println("Elmo de visão aguçada equipado, defesa aumentou sem prejudicar sua acurácia.");
    }
}
