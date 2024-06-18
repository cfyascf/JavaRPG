package itens;

public class ArcoEncantado extends Item
{
    private int danoAumentado;
    private int manaGasta;

    public ArcoEncantado()
    {
        super(new Arqueiro());
        this.danoAumentado = 2;
        this.manaGasta = 3; //mudar conforme for feito o sistema de mana
    }

    @Override
    public void Usar(Personagem usuario)
    {
        if(this.Usuario == usuario)
        {
            if(this.Usuario.Mana < manaGasta)
                System.out.println("Mana insuficiente");
            else
            {
                usuario.modificadorAtaquePersonagem += this.danoAumentado;
                usuario.mana -= this.manaGasta;
                System.out.println("Item utilizado com sucesso");
            }
        }
        else
            System.out.println("Personagem incompatível");
    }
}
