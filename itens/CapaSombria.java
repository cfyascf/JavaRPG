package itens;

public class CapaSombria extends Item
{
    private int aumentoDefesa;

    public CapaSombria()
    {
        super(new Ladino());
        this.aumentoDefesa = 2;
    }

    @Override
    public void Usar(Personagem usuario)
    {
        if(this.Usuario == usuario)
        {
            usuario.classeDeArmaduraPersonagem += aumentoDefesa;
            System.out.println("Item utilizado com sucesso");
        }
        else
            System.out.println("Personagem incompatível");
    }
}
