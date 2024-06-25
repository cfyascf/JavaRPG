package jogo.personagens.monstros;


public class CaveiraFlamejante extends Monstros{
    CaveiraFlamejante(){
        this.descricao = "Uma criatura que pode ser o combustível do pesadelo para muitas pessoas por aí, a Caveira Flamejante é o produto de conjuradores das trevas usando os ossos de magos mortos.";
        this.danoAtaque = 2;
        this.vidaMonstro = 10;
        this.armaduraMostro = 1;
        this.nivelMonstro = 1;
        this.modificadorAtaque = 3;
    }

    @Override
    public void ataque() {
        int dado = numeroAleatorio();
        if(numeroAleatorio()>10){
            System.err.println("Caveira flamejante usa raio de fogo");
            if( dado > 18){
                System.out.println("ACERTO CRITICO! Dano causado: "+(danoAtaque*2+(numeroAleatorio()%modificadorAtaque)));
            }else if (dado > 8){
                System.out.println("ACERTO! Dano causado:"+(danoAtaque+(numeroAleatorio()%modificadorAtaque)));
            }else{
                System.out.println("ERROU!");
            }
        }else{
            System.err.println("Caveira flamejante usa bola de fogo");
            if( dado > 18){
                System.out.println("ACERTO CRITICO! Dano causado: "+(danoAtaque*1.5+(numeroAleatorio()%modificadorAtaque)));
            }else if (dado > 8){
                System.out.println("ACERTO! Dano causado:"+(danoAtaque+(numeroAleatorio()%modificadorAtaque-1)));
            }else{
                System.out.println("ERROU!");
            }
        }
    }
}
