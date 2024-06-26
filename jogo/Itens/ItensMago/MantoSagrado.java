package jogo.Itens.ItensMago;

import jogo.personagens.herois.Personagem;

public class MantoSagrado extends ItemMago
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
    @Override
    public String getNome() {
        return "Manto Sagrado";
    }
}
