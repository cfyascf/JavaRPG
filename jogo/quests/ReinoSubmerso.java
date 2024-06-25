package jogo.quests;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReinoSubmerso extends Quest {
    static List<Levels> levels = new ArrayList<>();

    static {
        LinkedList<AcoesLevel> acoesNivel1 = new LinkedList<>();

        // Diálogos do Nível 1: Descoberta das Ruínas Submersas
        acoesNivel1.add(new AcoesDialogo("Nas profundezas do oceano, vocês descobrem as antigas ruínas do Reino Submerso.", DialogoTipo.Narrador));

        acoesNivel1.add(new AcoesDialogo("O ar é rarefeito aqui embaixo. Precisamos encontrar um jeito de respirar debaixo d'água.", DialogoTipo.Personagem));

        acoesNivel1.add(new AcoesDialogo("As ruínas são deslumbrantes, mas também carregam um ar de mistério e perigo.", DialogoTipo.Personagem));

        acoesNivel1.add(new AcoesDialogo("Os habitantes das profundezas estão curiosos sobre nossas intenções. Precisamos ser cuidadosos.", DialogoTipo.NPC));

        Levels nivel1 = new Levels(acoesNivel1);

        LinkedList<AcoesLevel> acoesNivel2 = new LinkedList<>();

        // Diálogos do Nível 2: Guardiões dos Portais Aquáticos
        acoesNivel2.add(new AcoesDialogo("Os guardiões dos portais aquáticos protegem os segredos mais profundos do Reino Submerso.", DialogoTipo.Narrador));

        acoesNivel2.add(new AcoesDialogo("Para avançar, precisamos resolver os enigmas deixados pelos antigos habitantes.", DialogoTipo.Personagem));

        acoesNivel2.add(new AcoesDialogo("Os guardiões são formidáveis, mas talvez estejam dispostos a negociar se soubermos como abordá-los.", DialogoTipo.Personagem));

        acoesNivel2.add(new AcoesDialogo("Os habitantes locais podem nos oferecer pistas sobre como lidar com os guardiões.", DialogoTipo.NPC));

        Levels nivel2 = new Levels(acoesNivel2);

        LinkedList<AcoesLevel> acoesNivel3 = new LinkedList<>();

        // Diálogos do Nível 3: O Despertar do Leviatã
        acoesNivel3.add(new AcoesDialogo("O despertar do Leviatã ameaça desestabilizar todo o Reino Submerso.", DialogoTipo.Narrador));

        acoesNivel3.add(new AcoesDialogo("Descobrimos que o Leviatã foi despertado por forças além do nosso entendimento. Precisamos detê-lo.", DialogoTipo.Personagem));

        acoesNivel3.add(new AcoesDialogo("Os habitantes do reino submerso estão apavorados. Eles precisam de nossa ajuda para restaurar a paz.", DialogoTipo.NPC));

        acoesNivel3.add(new AcoesDialogo("O Leviatã não pode ser derrotado facilmente. Precisamos encontrar uma maneira de selar seu poder novamente.", DialogoTipo.Personagem));

        Levels nivel3 = new Levels(acoesNivel3);

        levels.add(nivel1);
        levels.add(nivel2);
        levels.add(nivel3);
    }

    public ReinoSubmerso(List<Levels> niveisQuest) {
        super(niveisQuest);
    }
}
