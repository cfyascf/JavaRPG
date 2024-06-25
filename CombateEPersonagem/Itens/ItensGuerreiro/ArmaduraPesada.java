package CombateEPersonagem.Itens;

public class ArmaduraPesada extends Item
{
    private int aumentoDefesa;

    public ArmaduraPesada()
    {
        this.aumentoDefesa = 4;
    }

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.classeDeArmaduraPersonagem += this.aumentoDefesa;
        System.out.println("Armadura pesada foi equipada, defesa aumentou consideravelmente.");
    }
}
