package CombateEPersonagem.Itens;

public class MantoSagrado extends Item
{
    private int manaRecuperada; 
    private int aumentoDefesa;

    public MantoSagrado()
    {
        super(new Mago());
        this.aumentoDefesa = 2;
        this.manaRecuperada = 10; //mudar conforme for feito o sistema de mana
    }

    @Override
    public void Usar(Personagem usuario)
    {
        if(this.Usuario == usuario)
        {
            usuario.Mana += manaRecuperada;
            usuario.classeDeArmaduraPersonagem += aumentoDefesa;
            System.out.println("Item utilizado com sucesso");
        }
        else
            System.out.println("Personagem incompatível");
    }
}
