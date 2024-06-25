package CombateEPersonagem.Itens;

public class CapaSombria extends Item
{
    private int aumentoDefesa;

    public CapaSombria()
    {
        this.aumentoDefesa = 4;
    }

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.classeDeArmaduraPersonagem += this.aumentoDefesa;
        System.out.println("Ele equipa uma capa sombria, com isso sua defesa aumenta consideravelmente.");
    }
}
