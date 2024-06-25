package CombateEPersonagem.Itens;

public class Pocao extends Item
{
    private int aumentoVida;

    public Pocao()
    {
        this.aumentoVida = 2;
    }

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.vidaPersonagem += this.aumentoVida;
        System.out.println("Poção tomada, energia restaurada.");
    }
}
