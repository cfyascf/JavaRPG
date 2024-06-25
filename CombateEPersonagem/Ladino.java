package CombateEPersonagem;

public class Ladino extends Personagem {
    public Ladino(String nome) {
        super(nome);
        this.fraseSuprema = "O "+ this.nomePersonagem + "se esconde pelas sombras, e pelas costas, acerta um golpe crítico no ponto vital do inimigo,";
        
        this.listaDeItens.add(new AdagaEnvenenada());
        this.listaDeItens.add(new BrincoFurtivo());
        this.listaDeItens.add(new CapaSombria());
        this.listaDeItens.add(new FacaArremesso());
    }
}