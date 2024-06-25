package CombateEPersonagem.Itens;

public class Bracelete extends Item
{
    private int aumentoDefesa;

    public Bracelete()
    {
        this.aumentoDefesa = 4;
    }

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.classeDeArmaduraPersonagem += this.aumentoDefesa;
        System.out.println("Bracelete de proteção equipado, defesa aumentou consideravelmente.");
    }
}
