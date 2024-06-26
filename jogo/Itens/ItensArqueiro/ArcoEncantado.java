package jogo.Itens.ItensArqueiro;


import jogo.personagens.herois.Personagem;

public class ArcoEncantado extends ItemArqueiro
{
    private int aumentoModAtaque = 2;
    private int aumentoDano = 2;

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.setModificadorAtaquePersonagem(aumentoModAtaque + usuario.getModificadorAtaquePersonagem());
        usuario.setDanoPersonagem(aumentoDano + usuario.getDanoPersonagem());
        
        System.out.println("Arco encantado foi equipado, o dano aumentou consideravelmente.");
    }

    @Override
    public String getNome() {
        return "Arco Encantado";
    }
}
