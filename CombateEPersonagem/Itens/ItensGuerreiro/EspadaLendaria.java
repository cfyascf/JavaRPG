package CombateEPersonagem.Itens;

public class EspadaLendaria extends Item
{
    private int aumentoModAtaque;
    private int aumentoDano;

    public EspadaLendaria()
    {
        this.aumentoModAtaque = 4;
        this.aumentoDano = 4;
    }

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.modificadorAtaquePersonagem += this.aumentoModAtaque;
        usuario.danoPersonagem += this.aumentoDano;
        System.out.println("Ele empunha a espada lendária, seu dano aumentou consideravelmente.");
    }
}
