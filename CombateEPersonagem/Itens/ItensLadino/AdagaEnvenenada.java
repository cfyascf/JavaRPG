package CombateEPersonagem.Itens;

public class AdagaEnvenenada extends Item
{
    private int aumentoModAtaque;
    private int aumentoDano;

    public AdagaEnvenenada()
    {
        this.aumentoModAtaque = 2;
        this.aumentoDano = 2;
    }

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.modificadorAtaquePersonagem += this.aumentoModAtaque;
        usuario.danoPersonagem += this.aumentoDano;
        System.out.println("Ele equipa uma adaga envenenada, seu dano aumentou consideravelmente.");
    }
}
