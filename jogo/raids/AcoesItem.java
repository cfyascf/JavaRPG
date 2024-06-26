package jogo.raids;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import jogo.Itens.Item;
import jogo.Itens.ItensArqueiro.ArcoEncantado;
import jogo.Itens.ItensArqueiro.ArcoNegro;
import jogo.Itens.ItensArqueiro.Bracelete;
import jogo.Itens.ItensArqueiro.Elmo;
import jogo.Itens.ItensArqueiro.ItemArqueiro;
import jogo.Itens.ItensGuerreiro.ArmaduraCouro;
import jogo.Itens.ItensGuerreiro.ArmaduraPesada;
import jogo.Itens.ItensGuerreiro.EspadaLendaria;
import jogo.Itens.ItensGuerreiro.EspadaLeve;
import jogo.Itens.ItensGuerreiro.ItemGuerreiro;
import jogo.Itens.ItensLadino.AdagaEnvenenada;
import jogo.Itens.ItensLadino.BrincoFurtivo;
import jogo.Itens.ItensLadino.CapaSombria;
import jogo.Itens.ItensLadino.FacaArremesso;
import jogo.Itens.ItensLadino.ItemLadino;
import jogo.Itens.ItensMago.AmuletoGelo;
import jogo.Itens.ItensMago.CajadoMagico;
import jogo.Itens.ItensMago.CetroRaios;
import jogo.Itens.ItensMago.ItemMago;
import jogo.Itens.ItensMago.MantoSagrado;
import jogo.personagens.herois.*;

public class AcoesItem implements AcoesLevel {
    public static List<Class<? extends ItemArqueiro>> itemsArqueiro;
    public static List<Class<? extends ItemGuerreiro>> itemsGuerreiro;
    public static List<Class<? extends ItemMago>> itemsMago;
    public static List<Class<? extends ItemLadino>> itemsLadino;

    static {
        itemsArqueiro =  Arrays.asList(ArcoEncantado.class, ArcoNegro.class, Bracelete.class, Elmo.class);
        itemsGuerreiro =  Arrays.asList(ArmaduraCouro.class, ArmaduraPesada.class, EspadaLendaria.class, EspadaLeve.class);
        itemsLadino =  Arrays.asList(AdagaEnvenenada.class, BrincoFurtivo.class, CapaSombria.class, FacaArremesso.class);
        itemsMago =  Arrays.asList(AmuletoGelo.class, CajadoMagico.class, CetroRaios.class, MantoSagrado.class);
    }
    
    @Override
    public void executar(Personagem personagem) {
        Random rd = new Random();
        Item item = null;

        try {
            if (personagem instanceof Arqueiro) {
                var itemClass = itemsArqueiro.get(rd.nextInt(itemsArqueiro.size()));

                item = itemClass.getConstructor().newInstance();
            }

            if (personagem instanceof Guerreiro) {
                var itemClass = itemsGuerreiro.get(rd.nextInt(itemsGuerreiro.size()));

                item = itemClass.getConstructor().newInstance();
            }

            if (personagem instanceof Ladino) {
                var itemClass = itemsLadino.get(rd.nextInt(itemsLadino.size()));

                item = itemClass.getConstructor().newInstance();
            }

            if (personagem instanceof Mago) {
                var itemClass = itemsMago.get(rd.nextInt(itemsMago.size()));

                item = itemClass.getConstructor().newInstance();
            }

            if (item == null) {
                throw new Exception("Impossivel gerar item!");
            }

            personagem.pickItem(item, true);

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
