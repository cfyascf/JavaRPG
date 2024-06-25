package jogo.Itens.ItensGuerreiro;

import jogo.personagens.herois.Personagem;

public class ArmaduraCouro extends ItemGuerreiro
{
    private int aumentoDefesa;

    public ArmaduraCouro()
    {
        this.aumentoDefesa = 2;
    }

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.setClasseDeArmaduraPersonagem(aumentoDefesa + usuario.getClasseDeArmaduraPersonagem());        
        System.out.println("Armadura de couro leve foi equipada, defesa aumentou um pouco.");
    }
}
