public class Dragon extends Monstros{

    Dragon(){
        this.descricao ="Um dos tipos de dragões mais difíceis de enfrentar é o Dragão das Sombras.Esses monstros nasceram no Pendor das Sombras ou se transformaram depois de viver em condições horríveis.";
        this.nomeAtaque = "Bafo Flamejante";
        this.danoAtaque = 20;
        this.vida = 30;
        this.escudo = 20;
    }

    @Override
    public void ataque() {
        int dado = numeroAleatorio();
        if( dado > 18){
            System.out.println("ACERTO CRITICO DANO EM AREA E ESTaTUS QUEIMADO");
        }else if (dado > 8){
            System.out.println("ACERTO!");
        }else{
            System.out.println("ERROU");
        }
    }
    
}
