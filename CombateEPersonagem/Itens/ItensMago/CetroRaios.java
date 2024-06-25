package CombateEPersonagem.Itens;

public class CetroRaios extends Item
{
    private int aumentoModAtaque;
    private int aumentoDano;

    public CetroRaios()
    {
        this.aumentoModAtaque = 4;
        this.aumentoDano = 4;
    }

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.modificadorAtaquePersonagem += this.aumentoModAtaque;
        usuario.danoPersonagem += this.aumentoDano;
        System.out.println("Ele conjura um cetro de raios, com isso, seu ataque aumenta consideravelmente.");
    }
}
