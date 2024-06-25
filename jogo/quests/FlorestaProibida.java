package jogo.quests;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import jogo.personagens.herois.Personagem;

public class FlorestaProibida extends Quest {
    static List<Levels> levels = new ArrayList<>();

    static {
        LinkedList<AcoesLevel> acoesNivel1 = new LinkedList<>();
        
        // Diálogos do Nível 1: Exploração Inicial
        acoesNivel1.add(new AcoesDialogo("Vocês chegam à borda da Floresta Proibida. "
                                       + "O ar está pesado e o som das folhas farfalhando "
                                       + "cria uma atmosfera sinistra ao seu redor.", DialogoTipo.Narrador));

        acoesNivel1.add(new AcoesDialogo("Acho melhor ficarmos juntos e avançarmos com cautela. "
                                       + "Quem sabe o que podemos encontrar lá dentro...", DialogoTipo.Personagem));

        acoesNivel1.add(new AcoesDialogo("Concordo. Vamos manter os olhos abertos "
                                       + "e estar prontos para qualquer coisa.", DialogoTipo.Personagem));

        acoesNivel1.add(new AcoesDialogo("Não temos medo de algumas árvores assustadoras, certo? "
                                       + "Vamos lá, temos um mistério para resolver!", DialogoTipo.Personagem));

        Levels nivel1 = new Levels(acoesNivel1);

        LinkedList<AcoesLevel> acoesNivel2 = new LinkedList<>();

        // Diálogos do Nível 2: Problemas Crescentes
        acoesNivel2.add(new AcoesDialogo("Vocês avançam mais fundo na floresta. "
                                       + "O som dos galhos quebrando sob seus pés ecoa pelo ar, "
                                       + "enquanto as criaturas se tornam mais audaciosas.", DialogoTipo.Narrador));

        acoesNivel2.add(new AcoesDialogo("Essas criaturas parecem estar mais agressivas do que antes. "
                                       + "Precisamos descobrir por que estão tão fora de controle.", DialogoTipo.Personagem));

        acoesNivel2.add(new AcoesDialogo("Aquele acampamento abandonado parece ser um bom lugar "
                                       + "para começar a procurar pistas. Vamos lá antes que escureça.", DialogoTipo.Personagem));

        acoesNivel2.add(new AcoesDialogo("Parece que não somos os únicos que querem descobrir "
                                       + "o que está acontecendo aqui. Melhor nos apressarmos.", DialogoTipo.Personagem));

        Levels nivel2 = new Levels(acoesNivel2);

        LinkedList<AcoesLevel> acoesNivel3 = new LinkedList<>();

        // Diálogos do Nível 3: A Ameaça Oculta
        acoesNivel3.add(new AcoesDialogo("Vocês finalmente chegam ao coração da Floresta Proibida. "
                                       + "O ar está impregnado com uma energia sombria, "
                                       + "e uma presença malévola se faz sentir.", DialogoTipo.Narrador));

        acoesNivel3.add(new AcoesDialogo("É aqui que tudo começou. Temos que acabar com isso de uma vez por todas.", DialogoTipo.Personagem));

        acoesNivel3.add(new AcoesDialogo("Preparem-se. Não sabemos o que podemos enfrentar aqui dentro, "
                                       + "mas não podemos recuar agora.", DialogoTipo.Personagem));

        acoesNivel3.add(new AcoesDialogo("Esta é nossa última chance de purificar a floresta. "
                                       + "Vamos fazer isso pelos que não puderam voltar.", DialogoTipo.Personagem));

        Levels nivel3 = new Levels(acoesNivel3);

        levels.add(nivel1);
        levels.add(nivel2);
        levels.add(nivel3);
    }

    public FlorestaProibida(List<Levels> niveisQuest, Personagem personagem) {
        super(niveisQuest, personagem);
    }
}
