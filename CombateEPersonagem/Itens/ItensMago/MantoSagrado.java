package CombateEPersonagem.Itens;

public class MantoSagrado extends Item
{
    private int aumentoDefesa;

    public MantoSagrado()
    {
        this.aumentoDefesa = 2;
    }

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.classeDeArmaduraPersonagem += this.aumentoDefesa;
        System.out.println("Ele se cobre com um manto sagrado, sua defesa aumentou um pouco.");
    }
}
