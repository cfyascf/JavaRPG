package CombateEPersonagem.Itens;

public class ArmaduraCouro extends Item
{
    private int aumentoDefesa;

    public ArmaduraCouro()
    {
        this.aumentoDefesa = 2;
    }

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.classeDeArmaduraPersonagem += this.aumentoDefesa;
        System.out.println("Armadura de couro leve foi equipada, defesa aumentou um pouco.");
    }
}
