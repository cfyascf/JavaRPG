package CombateEPersonagem.Itens;

public class ArcoNegro extends Item
{
    private int aumentoModAtaque;
    private int aumentoDano;

    public ArcoNegro()
    {
        this.aumentoModAtaque = 1;
        this.aumentoDano = 1;
    }

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.modificadorAtaquePersonagem += this.aumentoModAtaque;
        usuario.danoPersonagem += this.aumentoDano;
        System.out.println("Arco negro foi equipado, o dano aumentou um pouco.");
    }
}
