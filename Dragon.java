public class Dragon extends Monstros{

    Dragon(){
        this.descricao ="Dragão são figuras lendárias, representadas por grandes répteis monstruosos que possuem a capacidade de voar e soltar fogo pela boca.";
        this.danoAtaque = 7;
        this.vidaMonstro = 20;
        this.armaduraMostro = 5;
        this.nivelMonstro = 1;
        this.modificadorAtaque = 8;
    }

    @Override
    public void ataque() {
        int dado = numeroAleatorio();
        if(numeroAleatorio()>10){
            System.err.println("O DRAGÂO USA O ATAQUE BAFO FLAMEJANTE");
            if( dado > 18){
                System.out.println("ACERTO CRITICO! Dano causado: "+danoAtaque*2+(numeroAleatorio()%modificadorAtaque));
            }else if (dado > 8){
                System.out.println("ACERTO! Dano causado: "+danoAtaque+(numeroAleatorio()%modificadorAtaque));
            }else{
                System.out.println("ERROU!");
            }
        }else{
            System.err.println("O DRAGÂO USA O ATAQUE GARRAS AFIADAS");
            if( dado > 18){
                System.out.println("ACERTO CRITICO! Dano causado:  "+danoAtaque*1.5 + ((numeroAleatorio()%modificadorAtaque)));
            }else if (dado > 8){
                System.out.println("ACERTO! Dano causado: "+danoAtaque + (numeroAleatorio()%modificadorAtaque-1));
            }else{
                System.out.println("ERROU!");
            }
        }

    }
    
}
