package CombateEPersonagem.Itens;

public abstract class Item 
{
    public Personagem Usuario;
    
    public Item(Personagem personagem)
    {
        this.Usuario = personagem;
    }

    public abstract void Usar(Personagem usuario);
}
