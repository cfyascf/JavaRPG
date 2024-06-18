package CombateEPersonagem;
import java.util.Random;

public class Personagem {
   
    int nivelPersonagem = 1;
    int vidaPersonagem = 10;
    int modificadorAtaquePersonagem = 2;
    int classeDeArmaduraPersonagem = 15;
    int danoPersonagem;
    //lista itens
    
    public Personagem() {
    }
    
    public int getNivelPersonagem() {
        return nivelPersonagem;
    }
    
    public void setNivelPersonagem(int nivelPersonagem) {
        this.nivelPersonagem = nivelPersonagem;
    }
    
    public int getVidaPersonagem() {
        return vidaPersonagem;
    }
    
    public void setVidaPersonagem(int vidaPersonagem) {
        this.vidaPersonagem = vidaPersonagem;
    }
    
    public int getModificadorAtaquePersonagem() {
        return modificadorAtaquePersonagem;
    }
    
    public void setModificadorAtaquePersonagem(int modificadorAtaquePersonagem) {
        this.modificadorAtaquePersonagem = modificadorAtaquePersonagem;
    }
    
    public int getClasseDeArmaduraPersonagem() {
        return classeDeArmaduraPersonagem;
    }
    
    public void setClasseDeArmaduraPersonagem(int classeDeArmaduraPersonagem) {
        this.classeDeArmaduraPersonagem = classeDeArmaduraPersonagem;
    }

    public int getDanoPersonagem() {
        return danoPersonagem;
    }  

    public void setDanoPersonagem(int danoPersonagem) {
        this.danoPersonagem = danoPersonagem;
    }


    private static int numeroAleatorio(){
        Random numeroAleatorio = new Random();
        return numeroAleatorio.nextInt(20) + 1;
    }


    public void aumentarNivel(){
        
        this.nivelPersonagem += 1; 
        this.vidaPersonagem += 4; 

    }    

    /* 
    public void ataque(inimigo){
        int numeroAleatorioAtaque = numeroAleatorio();
        if(numeroAleatorioAtaque == 20){
            inimigo.setVidaInimigo(inimigo.getVidaInimigo -= (danoPersonagem * 2));
            System.out.println("ATAQUE CRÍTICO!");
        }
        else if((numeroAleatorioAtaque + modificadorAtaquePersonagem) > inimigo.getClasseDeArmadura){
            inimigo.setVidaInimigo(inimigo.getVidaInimigo -= danoPersonagem);
            System.out.println("ACERTO!");
        }
        else {
            System.out.println("ERROU!");
        }
    }
    */
}


    