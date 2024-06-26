package jogo.Itens.ItensMago;

import jogo.personagens.herois.Personagem;

public class AmuletoGelo  extends ItemMago
{
    private int aumentoDefesa;

    public AmuletoGelo()
    {
        this.aumentoDefesa = 4;
    }

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.setClasseDeArmaduraPersonagem(aumentoDefesa + usuario.getClasseDeArmaduraPersonagem());

        System.out.println("Ele equipa um amuleto de gelo, sua defesa aumentou consideravelmente.");
    }
    @Override
    public String getNome() {
        return "Amuleto de Gelo";
    }
}
