package CombateEPersonagem.Itens;

public class CajadoMagico extends Item
{
    private int aumentoModAtaque;
    private int aumentoDano;

    public CajadoMagico()
    {
        this.aumentoModAtaque = 2;
        this.aumentoDano = 2;
    }

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.modificadorAtaquePersonagem += this.aumentoModAtaque;
        usuario.danoPersonagem += this.aumentoDano;
        System.out.println("Ele empunha seu cajado mágico, com isso, seu ataque aumenta um pouco.");
    }
}
