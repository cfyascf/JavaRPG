package CombateEPersonagem;
public class Mago extends Personagem {
    public Mago()
    {
        this.itens.add(new AmuletoGelo());
        this.itens.add(new CajadoMagico());
        this.itens.add(new CetroRaios());
        this.itens.add(new MantoSagrado());
    }

    public void Suprema(inimigo){
        int ataque = numeroAleatorio() + getModificadorAtaquePersonagem() + 2;

        

    }

}
