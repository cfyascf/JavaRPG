package itens;

public class AdagaEnvenenada extends Item
{
    private int aumentoAtaque;

    public AdagaEnvenenada()
    {
        super(new Ladino());
        this.aumentoAtaque = 2;
    }

    @Override
    public void Usar(Personagem usuario)
    {
        if(this.Usuario == usuario)
        {
            usuario.modificadorAtaquePersonagem += aumentoAtaque;
            System.out.println("Item utilizado com sucesso");
        }
        else
            System.out.println("Personagem incompatível");
    }
}
