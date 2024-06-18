package itens;

public class ArmaduraPesada extends Item
{
    private int aumentoDefesa;

    public ArmaduraPesada()
    {
        super(new Guerreiro());
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
