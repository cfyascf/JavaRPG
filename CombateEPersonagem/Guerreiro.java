package CombateEPersonagem;

public class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(nome);
        this.fraseSuprema = "O"+ this.nomePersonagem+" carrega um poderoso ataque pesado e atinge o inimigo,";
        
        this.listaDeItens.add(new EspadaLendaria());
        this.listaDeItens.add(new EspadaLeve());
        this.listaDeItens.add(new ArmaduraPesada());
        this.listaDeItens.add(new ArmaduraCouro());
    }
}