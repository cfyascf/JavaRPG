package CombateEPersonagem.Itens;

public class Pocao extends Item
{
    private int aumentoVida;

    public Pocao()
    {
        super(new Personagem());
        this.aumentoVida = 2;
    }

    @Override
    public void Usar(Personagem usuario)
    {
            usuario.vidaPersonagem += aumentoVida;
            System.out.println("Item utilizado com sucesso");
    }
}
