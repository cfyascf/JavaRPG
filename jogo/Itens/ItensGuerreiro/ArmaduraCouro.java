package jogo.Itens.ItensGuerreiro;

import CombateEPersonagem.Itens.Item;
import jogo.personagens.herois.Personagem;

public class ArmaduraCouro extends Item
{
    private int aumentoDefesa;

    public ArmaduraCouro()
    {
        super(null)
        this.aumentoDefesa = 2;
    }

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.setClasseDeArmaduraPersonagem(aumentoDefesa + usuario.getClasseDeArmaduraPersonagem());        
        System.out.println("Armadura de couro leve foi equipada, defesa aumentou um pouco.");
    }
}
