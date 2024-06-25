package jogo.quests;

import java.util.Random;

import jogo.personagens.herois.Personagem;

public class AcoesDialogo implements AcoesLevel {
    DialogoRecord dialogo;

    public AcoesDialogo(String texto, DialogoTipo tipo) {
        dialogo = new DialogoRecord(texto, tipo);
    }

    @Override
    public void executar(Personagem personagem) {
        switch (dialogo.tipo()) {
            case Narrador:
                System.out.println("Narrador: " + dialogo.texto());
                break;
            
            case Personagem:
                Random rd = new Random();
                
                //Escolher personagem aleatorio para falar
                rd.nextInt(0, 0);
                
                System.out.println("Nome personagem: " + dialogo.texto());
                break;
            
            case NPC:
                System.out.println(dialogo.texto());
                break;
        }
    }

    static record DialogoRecord(String texto, DialogoTipo tipo) {}    
}
