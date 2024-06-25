package CombateEPersonagem.Itens;

public class BrincoFurtivo extends Item
{
    private int aumentoDefesa;

    public BrincoFurtivo()
    {
        this.aumentoDefesa = 2;
    }

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.classeDeArmaduraPersonagem += this.aumentoDefesa;
        System.out.println("Ele equipa um brinco da furtividade, com isso sua defesa aumenta.");
    }
}
