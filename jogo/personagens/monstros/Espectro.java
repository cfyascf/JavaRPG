package jogo.personagens.monstros;

import jogo.personagens.monstros.Monstros;

public class Espectro extends Monstros {
    public Espectro() {
        this.descricao = "Um espectro amaldiçoado, cuja presença gera frio intenso e uma sensação de desespero.";
        this.danoAtaque = 15;
        this.vidaMonstro = 40;
        this.armaduraMostro = 3;
        this.nivelMonstro = 2;
        this.modificadorAtaque = 10;
    }
}
