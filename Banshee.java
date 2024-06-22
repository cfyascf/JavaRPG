public class Banshee extends Monstros{
    Banshee(){
        this.descricao = "Um espírito maligno morto-vivo, a Banshee é uma ex-elfa que sai à noite para assombrar criaturas vivas que ousam invadir seu território.";
        this.danoAtaque = 5;
        this.vidaMonstro = 30;
        this.armaduraMostro = 3;
        this.nivelMonstro = 1;
        this.modificadorAtaque = 6;
    }

    @Override
    public void ataque() {
        int dado = numeroAleatorio();
        if(numeroAleatorio()>10){
            System.err.println("Banshee usa Lamento de cicratrizes");
            if( dado > 18){
                System.out.println("ACERTO CRITICO! Dano causado: "+(danoAtaque*2+(numeroAleatorio()%modificadorAtaque)));
            }else if (dado > 8){
                System.out.println("ACERTO! Dano causado:"+(danoAtaque+(numeroAleatorio()%modificadorAtaque)));
            }else{
                System.out.println("ERROU!");
            } 
        }else{
            System.err.println("Banshee usa Toque Corruptivo");
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
