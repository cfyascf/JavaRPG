package jogo.personagens.monstros;

import java.util.Random;

import jogo.personagens.herois.Personagem;

public abstract class Monstros {
    protected int nivelMonstro;
    protected  int vidaMonstro;
    protected float danoAtaque;
    protected  int armaduraMostro;
    protected int modificadorAtaque;

    protected String descricao;

    public int getNivelMonstro(){
        return this.nivelMonstro;
    }
    public void setNivelMonstro(int nivelMonstro) {
        this.nivelMonstro = nivelMonstro;
    }
    public int getVidaMonstro() {
        return vidaMonstro;
    }
    public void setVidaMonstro(int vidaMonstro) {
        this.vidaMonstro = vidaMonstro;
    }
    public int getArmaduraMostro() {
        return armaduraMostro;
    }
    public void setArmaduraMostro(int armaduraMostro) {
        this.armaduraMostro = armaduraMostro;
    }
    public int getModificadorAtaque() {
        return modificadorAtaque;
    }
    public void setModificadorAtaque(int modificadorAtaque) {
        this.modificadorAtaque = modificadorAtaque;
    }

    public void aumentarNivelMostro(){
        this.nivelMonstro += 1;
        this.vidaMonstro += 5;
        this.danoAtaque +=2;
    }

    public abstract void ataque(Personagem personagem);

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getDanoAtaque() {
        return danoAtaque;
    }

    public void setDanoAtaque(float danoAtaque) {
        this.danoAtaque = danoAtaque;
    }

    static int numeroAleatorio(){
        Random numeroAleatorio = new Random();
        return numeroAleatorio.nextInt(21);
    }
}
