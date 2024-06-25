package CombateEPersonagem.Itens;

public class EspadaLeve extends Item
{
    private int aumentoModAtaque;
    private int aumentoDano;

    public EspadaLeve()
    {
        this.aumentoModAtaque = 2;
        this.aumentoDano = 2;
    }

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.modificadorAtaquePersonagem += this.aumentoModAtaque;
        usuario.danoPersonagem += this.aumentoDano;
        System.out.println("Ele empunha uma espada leve, seu dano aumentou um pouco.");
    }
}
