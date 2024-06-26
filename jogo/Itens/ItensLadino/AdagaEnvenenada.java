package jogo.Itens.ItensLadino;

import jogo.personagens.herois.Personagem;

public class AdagaEnvenenada extends ItemLadino
{
    private int aumentoModAtaque;
    private int aumentoDano;

    public AdagaEnvenenada()
    {
        this.aumentoModAtaque = 2;
        this.aumentoDano = 2;
    }

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.setModificadorAtaquePersonagem(aumentoModAtaque + usuario.getModificadorAtaquePersonagem());
        usuario.setDanoPersonagem(aumentoDano + usuario.getDanoPersonagem());

        System.out.println("Ele equipa uma adaga envenenada, seu dano aumentou consideravelmente.");
    }
    @Override
    public String getNome() {
        return "Adaga Envenenada";
    }
}
