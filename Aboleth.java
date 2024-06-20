public class Aboleth  extends Monstros{

    Aboleth(){
        this.descricao = "Considerados deuses no lago, os Aboleths já tiveram controle sobre muitas criaturas vivas antes que os “verdadeiros deuses” destruíssem seu império.Agora, esses longos anfíbios estão querendo se vingar.";
        this.nomeAtaque = "Ataque brutal de tentáculos";
        this.danoAtaque = 15;
        this.vida = 30;
        this.escudo = 20;
    }

    @Override
    public void ataque() {
        int dado = numeroAleatorio();
        if( dado > 18){
            System.out.println("ACERTO CRITICO PERDE O PROXIMO ROUND/FICOU TONTO");
        }else if (dado > 8){
            System.out.println("ACERTO!");
        }else{
            System.out.println("ERROU");
        }
    }
    
}
