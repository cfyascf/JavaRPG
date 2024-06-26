package jogo.personagens.herois;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import jogo.Itens.Item;
import jogo.Itens.Pocao;
import jogo.personagens.monstros.Monstros;
import jogo.ui.Utilidades;

public class Personagem {
   
    String nomePersonagem;
   
    int nivelPersonagem = 1;
    int vidaPersonagem = 30;
    int modificadorAtaquePersonagem = 2;
    int classeDeArmaduraPersonagem = 15;
    int danoPersonagem = 8;

    protected String fraseSuprema;

    public List<Item> listaDeItens = new ArrayList<>();
    
    public Personagem(String nome) {
        this.nomePersonagem = nome;
    }

    public void curarPersonagem() {
        boolean contemPocao = listaDeItens.stream().anyMatch(x -> x instanceof Pocao);

        if (!contemPocao) {
            System.out.println("Voce nao possui nenhuma poção de cura!");
            return;
        }

        System.out.println("Poção utilizada com sucesso!");
        
        listaDeItens
            .stream()
            .filter(x -> x instanceof Pocao)
            .findFirst()
            .get()
            .Usar(this);
    }

    public void pickItem(Item item, boolean messages) {
        item.Usar(this);
        listaDeItens.add(item);

        if (messages) {
            Utilidades.printf("Voce ganhou o item " + item.getNome(), 0.05);
            Utilidades.printf(" | Modificador de ataque: " + getModificadorAtaquePersonagem(), 0.03);
            Utilidades.skipLine();
        }

    }
    
    public Integer getNivelPersonagem() {
        return nivelPersonagem;
    }
    
    public void setNivelPersonagem(int nivelPersonagem) {
        this.nivelPersonagem = nivelPersonagem;
    }
    
    public Integer getVidaPersonagem() {
        return vidaPersonagem;
    }
    
    public void setVidaPersonagem(int vidaPersonagem) {
        this.vidaPersonagem = vidaPersonagem;
    }
    
    public Integer getModificadorAtaquePersonagem() {
        return modificadorAtaquePersonagem;
    }
    
    public void setModificadorAtaquePersonagem(int modificadorAtaquePersonagem) {
        this.modificadorAtaquePersonagem = modificadorAtaquePersonagem;
    }
    
    public Integer getClasseDeArmaduraPersonagem() {
        return classeDeArmaduraPersonagem;
    }
    
    public void setClasseDeArmaduraPersonagem(int classeDeArmaduraPersonagem) {
        this.classeDeArmaduraPersonagem = classeDeArmaduraPersonagem;
    }

    public Integer getDanoPersonagem() {
        return danoPersonagem;
    }  

    public void setDanoPersonagem(int danoPersonagem) {
        this.danoPersonagem = danoPersonagem;
    }


    protected static int numeroAleatorio(){
        Random numeroAleatorio = new Random();
        return numeroAleatorio.nextInt(20) + 1;
    }

    public String getNomePersonagem() {
        return nomePersonagem;
    }

    public void setNomePersonagem(String nomePersonagem) {
        this.nomePersonagem = nomePersonagem;
    }


    public void aumentarNivel(){
        
        this.nivelPersonagem += 1; 
        this.vidaPersonagem += 4; 

    }    

    
    public void ataque(Monstros inimigo){
        int numeroAleatorioAtaque = numeroAleatorio();
        int dano;
        int vidaInimigo = inimigo.getVidaMonstro();

        if(numeroAleatorioAtaque == 20){
            dano = danoPersonagem * 2;
            vidaInimigo -= dano;

            inimigo.setVidaMonstro(vidaInimigo);

            System.out.println("ATAQUE CRÍTICO!");
            Utilidades.printf("O inimigo toma " + dano + " de dano!\n", 0.06);
        }
        else if((numeroAleatorioAtaque + modificadorAtaquePersonagem) > inimigo.getArmaduraMostro()){
            dano = danoPersonagem;
            vidaInimigo -= danoPersonagem;

            inimigo.setVidaMonstro(vidaInimigo);

            System.out.println("ACERTO!");
            Utilidades.printf("O inimigo toma " + dano + " de dano!\n", 0.06);
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
            Utilidades.printf(fraseSuprema + " causando "+ (danoPersonagem*2) + " de dano!\n", 0.08);
        }
        else {
            System.out.println("ERROU!");
        }

    }
    /*public void curarPersonagem(Personagem personagem){
        Pocao pocaoParaUsar = null;


        for (Object item : personagem.listaDeItens) {
            if (item instanceof Pocao) {
                pocaoParaUsar = (Pocao) item;
                break;
            }
        }

        if (pocaoParaUsar != null) {
            pocaoParaUsar.Usar(personagem);
            listaDeItens.remove(pocaoParaUsar);
        } else {
            System.out.println("Você não possui nenhuma poção.");
        }
    }
    */


}


    