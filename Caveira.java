public class Caveira extends Monstros{
    Caveira(){
        this.descricao = "Uma criatura que pode ser o combustível do pesadelo para muitas pessoas por aí, a Caveira Flamejante é o produto de conjuradores das trevas usando os ossos de magos mortos.";
        this.nomeAtaque = "Bola de fogo";
        this.danoAtaque = 3;
    }

    @Override
    public void ataque() {
        int dado = numeroAleatorio();
        if( dado > 18){
            System.out.println("ACERTO CRITICO!");
        }else if (dado > 8){
            System.out.println("ACERTO!");
        }else{
            System.out.println("ERROU");
        }
    }
}
