package jogo.quests;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import jogo.personagens.herois.Personagem;

public class CidadeAssombrada extends Quest {
    static List<Levels> levels = new ArrayList<>();

    static {
        LinkedList<AcoesLevel> acoesNivel1 = new LinkedList<>();

        // Diálogos do Nível 1: Rumores na Taverna
        acoesNivel1.add(new AcoesDialogo("Os moradores estão inquietos. Dizem que viram aparições na taverna à noite.", DialogoTipo.Narrador));

        acoesNivel1.add(new AcoesDialogo("Ah, vocês estão indo investigar as assombrações na cidade? Cuidado com o que pode encontrar.", DialogoTipo.NPC));

        acoesNivel1.add(new AcoesDialogo("Se as aparições são reais, precisamos agir antes que algo pior aconteça.", DialogoTipo.Personagem));

        acoesNivel1.add(new AcoesDialogo("Essas histórias de fantasmas têm deixado a cidade em um estado de medo constante.", DialogoTipo.NPC));

        Levels nivel1 = new Levels(acoesNivel1);

        LinkedList<AcoesLevel> acoesNivel2 = new LinkedList<>();

        // Diálogos do Nível 2: A Verdade por Trás dos Fantasmas
        acoesNivel2.add(new AcoesDialogo("A verdadeira história por trás das assombrações é mais sombria do que imaginávamos.", DialogoTipo.Narrador));

        acoesNivel2.add(new AcoesDialogo("Descobri que há um antigo cemitério nas proximidades que pode estar relacionado às aparições.", DialogoTipo.Personagem));

        acoesNivel2.add(new AcoesDialogo("As aparições são manifestações de espíritos vingativos. Precisamos encontrar uma maneira de libertá-los.", DialogoTipo.Personagem));

        acoesNivel2.add(new AcoesDialogo("Os espíritos estão tentando nos contar algo. Precisamos descobrir o que é antes que seja tarde demais.", DialogoTipo.NPC));

        Levels nivel2 = new Levels(acoesNivel2);

        LinkedList<AcoesLevel> acoesNivel3 = new LinkedList<>();

        // Diálogos do Nível 3: O Portador da Maldição
        acoesNivel3.add(new AcoesDialogo("Um poderoso necromante está por trás das assombrações na cidade.", DialogoTipo.Narrador));

        acoesNivel3.add(new AcoesDialogo("Encontrei vestígios de magia negra perto do centro histórico da cidade. O necromante deve estar lá.", DialogoTipo.Personagem));

        acoesNivel3.add(new AcoesDialogo("O necromante está usando as almas dos mortos para fortalecer suas próprias habilidades. Devemos detê-lo.", DialogoTipo.Personagem));

        acoesNivel3.add(new AcoesDialogo("Os moradores estão contando com nós para livrar a cidade dessa maldição. Não podemos falhar.", DialogoTipo.NPC));

        Levels nivel3 = new Levels(acoesNivel3);

        levels.add(nivel1);
        levels.add(nivel2);
        levels.add(nivel3);
    }

    public CidadeAssombrada(List<Levels> niveisQuest, Personagem personagem) {
        super(niveisQuest, personagem);
    }
}
