public class Banshee extends Monstros{
    Banshee(){
        this.descricao = "Um espírito maligno morto-vivo, a Banshee é uma ex-elfa que sai à noite para assombrar criaturas vivas que ousam invadir seu território.";
        this.danoAtaque = 2;
        this.vidaMonstro = 10;
        this.armaduraMostro = 2;
        this.nivelMonstro = 1;
        this.modificadorAtaque = 3;
    }

    @Override
    public void ataque() {
        int dado = numeroAleatorio();
        if( dado > 18){
            System.out.println("ACERTO CRITICO DANO EM AREA");
        }else if (dado > 8){
            System.out.println("ACERTO!");
        }else{
            System.out.println("ERROU");
        }
    }
}
