package CombateEPersonagem.Itens;

public class ArcoEncantado extends Item
{
    private int aumentoModAtaque;
    private int aumentoDano;

    public ArcoEncantado()
    {
        this.aumentoModAtaque = 2;
        this.aumentoDano = 2;
    }

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.modificadorAtaquePersonagem += this.aumentoModAtaque;
        usuario.danoPersonagem += this.aumentoDano;
        System.out.println("Arco encantado foi equipado, o dano aumentou consideravelmente.");
    }
}
