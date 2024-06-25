package CombateEPersonagem.Itens;

public class Elmo extends Item
{
    private int aumentoDefesa;

    public Elmo()
    {
        this.aumentoDefesa = 2;
    }

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.classeDeArmaduraPersonagem += this.aumentoDefesa;
        System.out.println("Elmo de visão aguçada equipado, defesa aumentou sem prejudicar sua acurácia.");
    }
}
