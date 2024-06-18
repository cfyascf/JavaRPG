package CombateEPersonagem.Itens;

public class ArcoNegro extends Item
{
    private int danoAumentado;

    public ArcoNegro()
    {
        super(new Arqueiro());
        this.danoAumentado = 1;
    }

    @Override
    public void Usar(Personagem usuario)
    {
        if(this.Usuario == usuario)
        {
            usuario.modificadorAtaquePersonagem += danoAumentado;
            System.out.println("Item utilizado com sucesso");
        }
        else
            System.out.println("Personagem incompatível");
    }
}
