package jogo.combate;

import java.util.Scanner;

import jogo.personagens.herois.Personagem;
import jogo.personagens.monstros.Monstros;

public class Combate {
    
    static int round = 0;
    static int cargaSuprema = 0;
    static Scanner scanner = new Scanner(System.in);

    public void iniciarCombate(Personagem personagem, Monstros inimigo) {
        cargaSuprema = 0;
        while(personagem.getVidaPersonagem() > 0 && inimigo.getVidaMonstro() > 0) {
            
            if(round % 2 == 0){
                System.out.println("Vida "+ personagem.getNomePersonagem() +": "+ personagem.getVidaPersonagem());
                System.out.println("Carga da suprema: "+cargaSuprema);

                System.out.println();

                System.out.println("Vida do inimigo: "+ inimigo.getVidaMonstro());

                System.out.println("Escolha uma opção:");
                System.out.println("1. Atacar");
                System.out.println("2. Suprema");
                System.out.println("3. Curar");
                System.out.println("4. Fugir");
                System.out.print("Digite sua escolha: ");
                
                int escolha = scanner.nextInt();

                switch (escolha) {
                    case 1:
                        System.out.println("Você escolheu Atacar!");
                        personagem.ataque(inimigo);
                        cargaSuprema++;
                        round++;
                        break;
                    case 2:

                        if(cargaSuprema == 5){
                            System.out.println("Você escolheu Suprema!");
                            personagem.Suprema(inimigo);
                            round++;
                            break;
                        }
                        else {
                            System.out.println("Você não pode usar a Suprema ainda!");
                            continue;
                        }

                    case 3:
                        System.out.println("Você escolheu Curar!");
                        
                        personagem.curarPersonagem();
                        round++;

                        break;
                    case 4:
                        System.out.println("Você escolheu Fugir!");
                        return;
                    default:
                        System.out.println("Escolha inválida. Por favor, tente novamente.");
                        continue;
                }
            } else if (round % 2 == 1) {
                inimigo.ataque(personagem);
            }

        }
        
    }
}


