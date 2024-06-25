package CombateEPersonagem;
import CombateEPersonagem.Itens.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Personagem {
   
    String nomePersonagem;
    int nivelPersonagem = 1;
    int vidaPersonagem = 10;
    int modificadorAtaquePersonagem = 2;
    int classeDeArmaduraPersonagem = 15;
    int danoPersonagem;
    protected String fraseSuprema;

    List<Item> listaDeItens = new ArrayList<>();
    
    public Personagem(String nome) {
        this.nomePersonagem = nome;
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


    protected static int numeroAleatorio(){
        Random numeroAleatorio = new Random();
        return numeroAleatorio.nextInt(20) + 1;
    }


    public void aumentarNivel(){
        
        this.nivelPersonagem += 1; 
        this.vidaPersonagem += 4; 

    }    

    
    public void ataque(Monstros inimigo){
        int numeroAleatorioAtaque = numeroAleatorio();
        int vidaPerdida;
        if(numeroAleatorioAtaque == 20){
            vidaPerdida = inimigo.getVidaMonstro() - (danoPersonagem * 2);
            inimigo.setVidaMonstro(vidaPerdida);
            System.out.println("ATAQUE CRÍTICO!");
            System.out.println("O inimigo toma "+ vidaPerdida+" de dano!");
        }
        else if((numeroAleatorioAtaque + modificadorAtaquePersonagem) > inimigo.getArmaduraMostro()){
            vidaPerdida = inimigo.getVidaMonstro() - danoPersonagem;
            inimigo.setVidaMonstro(vidaPerdida);
            System.out.println("ACERTO!");
            System.out.println("O inimigo toma "+ vidaPerdida+" de dano!");
        }
        else {
            System.out.println("ERROU!");
        }
    }
    public void Suprema(Monstros inimigo){
        int vidaPerdida;
        int ataque = numeroAleatorio() + getModificadorAtaquePersonagem();

        if(ataque > inimigo.getArmaduraMostro()) {
            vidaPerdida = inimigo.getVidaMonstro() - (danoPersonagem * 2);
            inimigo.setVidaMonstro(getVidaPersonagem() - vidaPerdida);
            System.out.println("ACERTOU!");
            System.out.println(fraseSuprema + " causando "+ vidaPerdida + " de dano!");
        }
        else {
            System.out.println("ERROU!");
        }

    }




}


    