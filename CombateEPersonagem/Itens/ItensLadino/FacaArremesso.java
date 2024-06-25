package CombateEPersonagem.Itens;

public class FacaArremesso extends Item
{
    private int aumentoModAtaque;
    private int aumentoDano;

    public FacaArremesso()
    {
        this.aumentoModAtaque = 2;
        this.aumentoDano = 2;
    }

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.modificadorAtaquePersonagem += this.aumentoModAtaque;
        usuario.danoPersonagem += this.aumentoDano;
        System.out.println("Ele obtém facas de arremesso, seu dano aumentou.");
    }
}
