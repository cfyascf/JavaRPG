public class Aboleth  extends Monstros{

    Aboleth(){
        this.descricao = "Considerados deuses no lago, os Aboleths já tiveram controle sobre muitas criaturas vivas antes que os “verdadeiros deuses” destruíssem seu império.Agora, esses longos anfíbios estão querendo se vingar.";
        this.danoAtaque = 5;
        this.vidaMonstro = 20;
        this.armaduraMostro = 5;
        this.nivelMonstro = 1;
        this.modificadorAtaque = 6;
    }

    @Override
    public void ataque() {
        int dado = numeroAleatorio();
        if(numeroAleatorio()>10){
            System.err.println("Aboleth usa ataque mental");
            if( dado > 18){
                System.out.println("ACERTO CRITICO! Perde o proxima rodada,Dano causado: "+(danoAtaque*2+(numeroAleatorio()%modificadorAtaque)));
            }else if (dado > 8){
                System.out.println("ACERTO! Dano causado:"+(danoAtaque+(numeroAleatorio()%modificadorAtaque)));
            }else{
                System.out.println("ERROU!");
            } 
        }else{
            System.err.println("Aboleth usa ataque brutal de tentaculos");
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
