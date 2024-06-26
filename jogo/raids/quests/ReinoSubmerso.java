package jogo.raids.quests;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import jogo.personagens.herois.Personagem;
import jogo.personagens.monstros.*;
import jogo.raids.*;

public class ReinoSubmerso extends Quest {
    static List<Levels> levels = new ArrayList<>();

    static {
        LinkedList<AcoesLevel> acoesNivel1 = new LinkedList<>();

        // Diálogos do Nível 1: Descoberta das Ruínas Submersas
        acoesNivel1.add(new AcoesDialogo("Nas profundezas do oceano, vocês descobrem as antigas ruínas do Reino Submerso.", DialogoTipo.Narrador));
        acoesNivel1.add(new AcoesDialogo("O ar é rarefeito aqui embaixo. Precisamos encontrar um jeito de respirar debaixo d'água.", DialogoTipo.Personagem));
        acoesNivel1.add(new AcoesDialogo("As ruínas são deslumbrantes, mas também carregam um ar de mistério e perigo.", DialogoTipo.Personagem));
        acoesNivel1.add(new AcoesDialogo("Os habitantes das profundezas estão curiosos sobre nossas intenções. Precisamos ser cuidadosos.", DialogoTipo.NPC));

        // Combate do Nível 1: Encontro com Tritões
        acoesNivel1.add(new AcoesCombate(new Tritao()));
        acoesNivel1.add(new AcoesItem());
        acoesNivel1.add(new AcoesDialogo("Os Tritões atacam com ferocidade, protegendo suas terras ancestrais.", DialogoTipo.Narrador));
        acoesNivel1.add(new AcoesDialogo("Derrotamos os Tritões, mas devemos prosseguir com cautela nas profundezas desconhecidas.", DialogoTipo.Personagem));

        Levels nivel1 = new Levels(acoesNivel1);

        LinkedList<AcoesLevel> acoesNivel2 = new LinkedList<>();

        // Diálogos do Nível 2: Guardiões dos Portais Aquáticos
        acoesNivel2.add(new AcoesDialogo("Os guardiões dos portais aquáticos protegem os segredos mais profundos do Reino Submerso.", DialogoTipo.Narrador));
        acoesNivel2.add(new AcoesDialogo("Para avançar, precisamos resolver os enigmas deixados pelos antigos habitantes.", DialogoTipo.Personagem));
        acoesNivel2.add(new AcoesDialogo("Os guardiões são formidáveis, mas talvez estejam dispostos a negociar se soubermos como abordá-los.", DialogoTipo.Personagem));
        acoesNivel2.add(new AcoesDialogo("Os habitantes locais podem nos oferecer pistas sobre como lidar com os guardiões.", DialogoTipo.NPC));

        // Combate do Nível 2: Encontro com o Lorde das Profundezas
        acoesNivel2.add(new AcoesCombate(new LordeDasProfundezas()));
        acoesNivel2.add(new AcoesDialogo("O Lorde das Profundezas emerge das sombras, uma presença imponente e sinistra.", DialogoTipo.Narrador));
        acoesNivel2.add(new AcoesDialogo("Vencemos o Lorde das Profundezas, mas a ameaça no reino submerso ainda persiste.", DialogoTipo.Personagem));

        Levels nivel2 = new Levels(acoesNivel2);

        LinkedList<AcoesLevel> acoesNivel3 = new LinkedList<>();

        // Diálogos do Nível 3: O Despertar do Leviatã
        acoesNivel3.add(new AcoesDialogo("O despertar do Leviatã ameaça desestabilizar todo o Reino Submerso.", DialogoTipo.Narrador));
        acoesNivel3.add(new AcoesDialogo("Descobrimos que o Leviatã foi despertado por forças além do nosso entendimento. Precisamos detê-lo.", DialogoTipo.Personagem));
        acoesNivel3.add(new AcoesDialogo("Os habitantes do reino submerso estão apavorados. Eles precisam de nossa ajuda para restaurar a paz.", DialogoTipo.NPC));
        acoesNivel3.add(new AcoesDialogo("O Leviatã não pode ser derrotado facilmente. Precisamos encontrar uma maneira de selar seu poder novamente.", DialogoTipo.Personagem));

        // Combate do Nível 3: Encontro com a Sereia
        acoesNivel3.add(new AcoesCombate(new Sereia()));
        acoesNivel3.add(new AcoesDialogo("A Sereia emerge das profundezas, sua canção hipnotizadora ecoa através dos corredores das ruínas submersas.", DialogoTipo.Narrador));
        acoesNivel3.add(new AcoesDialogo("A Sereia foi derrotada, mas a luta contra o Leviatã ainda está por vir.", DialogoTipo.Personagem));
        acoesNivel3.add(new AcoesItem());

        Levels nivel3 = new Levels(acoesNivel3);

        levels.add(nivel1);
        levels.add(nivel2);
        levels.add(nivel3);
    }

    public ReinoSubmerso(Personagem personagem) {
        super(levels, personagem);
    }
}
