package jogo.quests;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RuinaAntiga extends Quest {
    static List<Levels> levels = new ArrayList<>();

    static {
        // Nível 1: Descoberta das Ruínas
        LinkedList<AcoesLevel> acoesNivel1 = new LinkedList<>();
        acoesNivel1.add(new AcoesDialogo("Você descobre as antigas ruínas escondidas no coração da floresta.", DialogoTipo.Narrador));
        acoesNivel1.add(new AcoesDialogo("As paredes das ruínas estão cobertas de inscrições antigas. Podemos encontrar respostas aqui.", DialogoTipo.Personagem));
        acoesNivel1.add(new AcoesDialogo("As ruínas parecem estar desabitadas, mas há um ar de mistério que paira no ar.", DialogoTipo.Personagem));
        acoesNivel1.add(new AcoesDialogo("Os habitantes locais temem essas ruínas. Dizem que são amaldiçoadas.", DialogoTipo.NPC));
        acoesNivel1.add(new AcoesDialogo("O dragão ancião que guarda estas ruínas é temido por todos. Dizem que ele se alimenta de intrusos como nós.", DialogoTipo.NPC));
        Levels nivel1 = new Levels(acoesNivel1);

        // Nível 2: Armadilhas e Segredos
        LinkedList<AcoesLevel> acoesNivel2 = new LinkedList<>();
        acoesNivel2.add(new AcoesDialogo("As ruínas estão cheias de armadilhas engenhosas. Devemos ser cautelosos em nossa exploração.", DialogoTipo.Narrador));
        acoesNivel2.add(new AcoesDialogo("Encontrei um mapa antigo que mostra uma câmara secreta nas profundezas das ruínas.", DialogoTipo.Personagem));
        acoesNivel2.add(new AcoesDialogo("As armadilhas estão ligadas aos antigos guardiões das ruínas. Devemos respeitar seus desafios.", DialogoTipo.Personagem));
        acoesNivel2.add(new AcoesDialogo("Os locais sussurram sobre um tesouro escondido nas profundezas das ruínas. Será verdade?", DialogoTipo.NPC));
        acoesNivel2.add(new AcoesDialogo("O dragão ancião está ciente de nossa presença. Precisamos estar preparados para um confronto.", DialogoTipo.NPC));
        Levels nivel2 = new Levels(acoesNivel2);

        // Nível 3: A Maldição das Ruínas
        LinkedList<AcoesLevel> acoesNivel3 = new LinkedList<>();
        acoesNivel3.add(new AcoesDialogo("Uma antiga maldição recai sobre as ruínas, despertando os espíritos dos antigos habitantes.", DialogoTipo.Narrador));
        acoesNivel3.add(new AcoesDialogo("Descobrimos que a maldição está ligada a um artefato antigo guardado nas profundezas das ruínas.", DialogoTipo.Personagem));
        acoesNivel3.add(new AcoesDialogo("Os espíritos dos antigos sacerdotes nos alertam sobre os perigos de perturbar seus descansos eternos.", DialogoTipo.NPC));
        acoesNivel3.add(new AcoesDialogo("Se não encontrarmos uma maneira de quebrar a maldição, as ruínas continuarão a ser um lugar de dor e sofrimento.", DialogoTipo.Personagem));
        acoesNivel3.add(new AcoesDialogo("O dragão ancião emerge das profundezas das ruínas, pronto para defender seu território.", DialogoTipo.NPC));
        acoesNivel3.add(new AcoesDialogo("Para derrotar o dragão, precisamos utilizar a magia ancestral contida nas ruínas.", DialogoTipo.Personagem));
        Levels nivel3 = new Levels(acoesNivel3);

        // Nível 4: Os Segredos Profundos
        LinkedList<AcoesLevel> acoesNivel4 = new LinkedList<>();
        acoesNivel4.add(new AcoesDialogo("As profundezas das ruínas guardam segredos que desafiam nossa compreensão.", DialogoTipo.Narrador));
        acoesNivel4.add(new AcoesDialogo("Encontramos inscrições antigas que revelam a história perdida deste lugar.", DialogoTipo.Personagem));
        acoesNivel4.add(new AcoesDialogo("Os artefatos antigos podem conter o poder necessário para selar o dragão de uma vez por todas.", DialogoTipo.Personagem));
        acoesNivel4.add(new AcoesDialogo("O dragão ancião está enfraquecido pela maldição que o prende às ruínas. Este pode ser nosso momento de atacar.", DialogoTipo.NPC));
        acoesNivel4.add(new AcoesDialogo("A batalha com o dragão será a prova final de nossa coragem e determinação.", DialogoTipo.Personagem));
        Levels nivel4 = new Levels(acoesNivel4);

        // Nível 5: O Confronto Final
        LinkedList<AcoesLevel> acoesNivel5 = new LinkedList<>();
        acoesNivel5.add(new AcoesDialogo("Chegamos ao santuário do dragão ancião, onde ele nos aguarda para o confronto final.", DialogoTipo.Narrador));
        acoesNivel5.add(new AcoesDialogo("O dragão ancião lança seu poderoso rugido, desafiando-nos a enfrentá-lo.", DialogoTipo.Personagem));
        acoesNivel5.add(new AcoesDialogo("Nossos aliados nos apoiam enquanto nos preparamos para a batalha épica que determinará o destino das ruínas.", DialogoTipo.Personagem));
        acoesNivel5.add(new AcoesDialogo("É hora de usar tudo o que aprendemos e derrotar o dragão ancião de uma vez por todas!", DialogoTipo.Personagem));
        acoesNivel5.add(new AcoesDialogo("Com o dragão ancião derrotado, as ruínas podem finalmente encontrar paz. Nossa jornada chegou ao fim.", DialogoTipo.NPC));
        Levels nivel5 = new Levels(acoesNivel5);

        // Adicionando os níveis à lista de levels
        levels.add(nivel1);
        levels.add(nivel2);
        levels.add(nivel3);
        levels.add(nivel4);
        levels.add(nivel5);
    }

    public RuinaAntiga(List<Levels> niveisQuest) {
        super(niveisQuest);
    }
}
