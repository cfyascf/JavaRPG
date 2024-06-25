package CombateEPersonagem;
public class Guerreiro extends Personagem {
    public Guerreiro()
        {
            this.itens.add(new EspadaLendaria());
            this.itens.add(new EspadaLeve());
            this.itens.add(new ArmaduraPesada());
            this.itens.add(new ArmaduraCouro());
        }

    public void SupremaGuerreiro(inimigo){
        int ataque = numeroAleatorio() + getModificadorAtaquePersonagem() + 2;

        if(ataque > inimigo.getClasseDeArmadura()) {
            inimigo.setInimigoVida(inimigo.getInimigoVida -= (this.danoPersonagem * 2));
            System.out.println("ACERTOU!");
            System.out.println("O Guerreiro carrega e executa um golpe devastador causando"+ (danoPersonagem*2) + "de dano");
        }
        else {
            System.out.println("ERROU!");
        }

    }

}