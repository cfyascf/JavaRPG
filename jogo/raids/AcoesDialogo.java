package jogo.raids;


import jogo.personagens.herois.Personagem;
import jogo.ui.Utilidades;

public class AcoesDialogo implements AcoesLevel {
    DialogoRecord dialogo;

    public AcoesDialogo(String texto, DialogoTipo tipo) {
        dialogo = new DialogoRecord(texto, tipo);
    }

    @Override
    public void executar(Personagem personagem) {
        switch (dialogo.tipo()) {
            case Narrador:
                Utilidades.printf("Narrador: ", 0.07);
                Utilidades.printf(dialogo.texto(), 0.03);
                Utilidades.skipLine();
                break;
            
            case Personagem:
                Utilidades.printf(personagem.getNomePersonagem() + ": ", 0.07);
                Utilidades.printf(dialogo.texto(), 0.03);
                Utilidades.skipLine();
                break;
            
            case NPC:
                Utilidades.printf("NPC: ", 0.07);
                Utilidades.printf(dialogo.texto(), 0.03);
                Utilidades.skipLine();
                break;
        }
    }

    static record DialogoRecord(String texto, DialogoTipo tipo) {}    
}
