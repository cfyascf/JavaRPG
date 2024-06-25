package CombateEPersonagem;

public class Mago extends Personagem {
    public Mago(String nome) {
        super(nome);
        this.fraseSuprema = "O "+ this.nomePersonagem +" invoca um meteoro dos céus e atinge o inimigo com um ataque poderoso,";
        
        this.listaDeItens.add(new AmuletoGelo());
        this.listaDeItens.add(new CajadoMagico());
        this.listaDeItens.add(new CetroRaios());
        this.listaDeItens.add(new MantoSagrado());
    }

}
