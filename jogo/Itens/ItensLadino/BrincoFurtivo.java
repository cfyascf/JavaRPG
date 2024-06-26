package jogo.Itens.ItensLadino;

import jogo.personagens.herois.Personagem;

public class BrincoFurtivo extends ItemLadino
{
    private int aumentoDefesa;

    public BrincoFurtivo()
    {
        this.aumentoDefesa = 2;
    }

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.setClasseDeArmaduraPersonagem(aumentoDefesa + usuario.getClasseDeArmaduraPersonagem());        

        System.out.println("Ele equipa um brinco da furtividade, com isso sua defesa aumenta.");
    }
    @Override
    public String getNome() {
        return "Brinco Furtivo";
    }
}
