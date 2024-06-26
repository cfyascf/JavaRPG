package jogo.raids.quests;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import jogo.personagens.herois.Personagem;
import jogo.personagens.monstros.*;
import jogo.raids.*;

public class RuinaAntiga extends Quest {
    static List<Levels> levels = new ArrayList<>();

    static {
        // Nível 1: Descoberta das Ruínas
        LinkedList<AcoesLevel> acoesNivel1 = new LinkedList<>();
        acoesNivel1.add(new AcoesDialogo("Você descobre as antigas ruínas escondidas no coração da floresta.", DialogoTipo.Narrador));
        acoesNivel1.add(new AcoesDialogo("As paredes das ruínas estão cobertas de inscrições antigas. Podemos encontrar respostas aqui.", DialogoTipo.Personagem));
        acoesNivel1.add(new AcoesDialogo("As ruínas parecem estar desabitadas, mas há um ar de mistério que paira no ar.", DialogoTipo.Personagem));
        acoesNivel1.add(new AcoesDialogo("Os habitantes locais temem essas ruínas. Dizem que são amaldiçoadas.", DialogoTipo.NPC));

        // Combate do Nível 1: Encontro com Guardiões das Ruínas
        acoesNivel1.add(new AcoesCombate(new GuardiaoAntigo()));
        acoesNivel1.add(new AcoesItem());
        acoesNivel1.add(new AcoesDialogo("Os Guardiões das Ruínas despertam para proteger seu território sagrado.", DialogoTipo.Narrador));
        acoesNivel1.add(new AcoesDialogo("Derrotamos os Guardiões, mas devemos proceder com cautela nas profundezas das ruínas.", DialogoTipo.Personagem));

        Levels nivel1 = new Levels(acoesNivel1);

        // Nível 2: Armadilhas e Segredos
        LinkedList<AcoesLevel> acoesNivel2 = new LinkedList<>();
        acoesNivel2.add(new AcoesDialogo("As ruínas estão cheias de armadilhas engenhosas. Devemos ser cautelosos em nossa exploração.", DialogoTipo.Narrador));
        acoesNivel2.add(new AcoesDialogo("Encontrei um mapa antigo que mostra uma câmara secreta nas profundezas das ruínas.", DialogoTipo.Personagem));
        acoesNivel2.add(new AcoesDialogo("As armadilhas estão ligadas aos antigos guardiões das ruínas. Devemos respeitar seus desafios.", DialogoTipo.Personagem));
        acoesNivel2.add(new AcoesDialogo("Os locais sussurram sobre um tesouro escondido nas profundezas das ruínas. Será verdade?", DialogoTipo.NPC));

        // Combate do Nível 2: Encontro com Espectros das Ruínas
        acoesNivel2.add(new AcoesCombate(new Espectro()));
        acoesNivel2.add(new AcoesItem());
        acoesNivel1.add(new AcoesDialogo("Os Guardiões das Ruínas despertam para proteger seu território sagrado.", DialogoTipo.Narrador));
        acoesNivel2.add(new AcoesDialogo("Os Espectros das Ruínas emergem das sombras, sedentos por vingança.", DialogoTipo.Narrador));
        acoesNivel2.add(new AcoesDialogo("Vencemos os Espectros, mas a maldição das ruínas ainda persiste.", DialogoTipo.Personagem));

        Levels nivel2 = new Levels(acoesNivel2);

        // Nível 3: A Maldição das Ruínas
        LinkedList<AcoesLevel> acoesNivel3 = new LinkedList<>();
        acoesNivel3.add(new AcoesDialogo("Uma antiga maldição recai sobre as ruínas, despertando os espíritos dos antigos habitantes.", DialogoTipo.Narrador));
        acoesNivel3.add(new AcoesDialogo("Descobrimos que a maldição está ligada a um artefato antigo guardado nas profundezas das ruínas.", DialogoTipo.Personagem));
        acoesNivel3.add(new AcoesDialogo("Os espíritos dos antigos sacerdotes nos alertam sobre os perigos de perturbar seus descansos eternos.", DialogoTipo.NPC));
        acoesNivel3.add(new AcoesDialogo("Se não encontrarmos uma maneira de quebrar a maldição, as ruínas continuarão a ser um lugar de dor e sofrimento.", DialogoTipo.Personagem));

        // Combate do Nível 3: Encontro com a Banshee
        acoesNivel3.add(new AcoesDialogo("Uma presença sombria emerge das sombras das ruínas, revelando a Banshee, uma alma amaldiçoada em busca de vingança.", DialogoTipo.Narrador));
        acoesNivel3.add(new AcoesDialogo("Para derrotar a Banshee, precisamos usar nossa coragem e determinação para enfrentar seu poder místico.", DialogoTipo.Personagem));
        acoesNivel3.add(new AcoesCombate(new Banshee()));
        acoesNivel3.add(new AcoesItem());

        Levels nivel3 = new Levels(acoesNivel3);

        // Nível 4: Os Segredos Profundos
        LinkedList<AcoesLevel> acoesNivel4 = new LinkedList<>();
        acoesNivel4.add(new AcoesDialogo("As profundezas das ruínas guardam segredos que desafiam nossa compreensão.", DialogoTipo.Narrador));
        acoesNivel4.add(new AcoesDialogo("Encontramos inscrições antigas que revelam a história perdida deste lugar.", DialogoTipo.Personagem));
        acoesNivel4.add(new AcoesDialogo("Os artefatos antigos podem conter o poder necessário para selar o dragão de uma vez por todas.", DialogoTipo.Personagem));
        acoesNivel4.add(new AcoesDialogo("O Dragão Ancião está enfraquecido pela maldição que o prende às ruínas. Este pode ser nosso momento de atacar.", DialogoTipo.NPC));

        // Combate do Nível 4: Batalha Final com o Dragão Ancião
        acoesNivel4.add(new AcoesDialogo("A batalha com o Dragão Ancião será a prova final de nossa coragem e determinação.", DialogoTipo.Personagem));
        acoesNivel4.add(new AcoesCombate(new DragaoAnciao()));
        acoesNivel4.add(new AcoesItem());

        Levels nivel4 = new Levels(acoesNivel4);

        // Nível 5: O Confronto Final
        LinkedList<AcoesLevel> acoesNivel5 = new LinkedList<>();
        acoesNivel5.add(new AcoesDialogo("Chegamos ao santuário do Dragão Ancião, onde ele nos aguarda para o confronto final.", DialogoTipo.Narrador));
        acoesNivel5.add(new AcoesDialogo("O Dragão Ancião lança seu poderoso rugido, desafiando-nos a enfrentá-lo.", DialogoTipo.Personagem));
        acoesNivel5.add(new AcoesDialogo("Nossos aliados nos apoiam enquanto nos preparamos para a batalha épica que determinará o destino das ruínas.", DialogoTipo.Personagem));
        acoesNivel5.add(new AcoesDialogo("É hora de usar tudo o que aprendemos e derrotar o Dragão Ancião de uma vez por todas!", DialogoTipo.Personagem));
        acoesNivel5.add(new AcoesDialogo("Com o Dragão Ancião derrotado, as ruínas podem finalmente encontrar paz. Nossa jornada chegou ao fim.", DialogoTipo.NPC));

        Levels nivel5 = new Levels(acoesNivel5);

        // Adicionando os níveis à lista de levels
        levels.add(nivel1);
        levels.add(nivel2);
        levels.add(nivel3);
        levels.add(nivel4);
        levels.add(nivel5);
    }

    public RuinaAntiga(Personagem personagem) {
        super(levels, personagem);
    }
}
