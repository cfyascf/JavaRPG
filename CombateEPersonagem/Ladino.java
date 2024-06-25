package CombateEPersonagem;
public class Ladino extends Personagem {
    //lista de itens ladino
    //adagaEnvenenada
    

    public void Suprema(inimigo){
        int ataque = numeroAleatorio() + getModificadorAtaquePersonagem() + 2;

        if(ataque > inimigo.getClasseDeArmadura()) {
            inimigo.setInimigoVida(inimigo.getInimigoVida -= (this.danoPersonagem * 2));
            System.out.println("ACERTOU!");
            System.out.println("O Ladino se esconde pelas sombras e lança um ataque poderoso no ponto vital do inimigo, causando "+ (danoPersonagem*2) + " de dano");
        }
        else {
            System.out.println("ERROU!");
        }

    }
}