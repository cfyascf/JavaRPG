package CombateEPersonagem.Itens;

public class AmuletoGelo extends Item
{
    private int aumentoDefesa;

    public AmuletoGelo()
    {
        this.aumentoDefesa = 4;
    }

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.classeDeArmaduraPersonagem += this.aumentoDefesa;
        System.out.println("Ele equipa um amuleto de gelo, sua defesa aumentou consideravelmente.");
    }
}
