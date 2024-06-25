package CombateEPersonagem.Itens;

public class PocaoGrande extends Item
{
    private int aumentoVida;

    public PocaoGrande()
    {
        this.aumentoVida = 4;
    }

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.vidaPersonagem += this.aumentoVida;
        System.out.println("Ele tomou uma poção grande, muita energia foi recuperada.");
    }
}
