package quests;

import java.util.List;
import java.util.Random;

public class AcoesDialogo implements AcoesLevel {
    DialogoRecord dialogo;

    public AcoesDialogo(String texto, DialogoTipo tipo) {
        dialogo = new DialogoRecord(texto, tipo);
    }

    @Override
    public void executar(/*Character list*/) {
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
        }
    }

    record DialogoRecord(String texto, DialogoTipo tipo) {}    
}
