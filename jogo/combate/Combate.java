package jogo.combate;

import java.util.Scanner;

import jogo.personagens.herois.Personagem;
import jogo.personagens.monstros.Monstros;
import jogo.ui.Utilidades;

public class Combate {
    
    static int round = 0;
    static int cargaSuprema = 0;
    static Scanner scanner = new Scanner(System.in);
    static double velocidadeTexto = 0.05;

    public void iniciarCombate(Personagem personagem, Monstros inimigo) {
        cargaSuprema = 0;
        while(personagem.getVidaPersonagem() > 0 && inimigo.getVidaMonstro() > 0) {
            Utilidades.clear();

            if(round % 2 == 0){
                Utilidades.printf("Seu turno!\n", 0.06);

                Utilidades.printf(personagem.getNomePersonagem() + ":\n", velocidadeTexto);
                System.out.println();
                Utilidades.printf("Vida "+ personagem.getNomePersonagem() +": "+ personagem.getVidaPersonagem() + "\n", velocidadeTexto);
                Utilidades.printf("Carga da suprema: "+cargaSuprema + "\n", velocidadeTexto);

                Utilidades.skipLine();
                
                Utilidades.printf("Vida do inimigo: "+ inimigo.getVidaMonstro() + "\n\n", velocidadeTexto);

                System.out.println("Escolha uma opção:");
                System.out.println("1. Atacar");
                System.out.println("2. Suprema");
                System.out.println("3. Curar");
                System.out.println("4. Fugir");
                System.out.print("Digite sua escolha: ");
                
                int escolha = scanner.nextInt();
                scanner.nextLine();

                switch (escolha) {
                    case 1:
                        Utilidades.printf("Você escolheu Atacar!\n", velocidadeTexto);
                        personagem.ataque(inimigo);
                        cargaSuprema++;
                        break;
                    case 2:

                        if(cargaSuprema == 5){
                            Utilidades.printf("Você escolheu Suprema!", velocidadeTexto);
                            personagem.Suprema(inimigo);
                            break;
                        }
                        else {
                            Utilidades.printf("Você não pode usar a Suprema ainda!", velocidadeTexto);
                            continue;
                        }

                    case 3:
                        Utilidades.printf("Você escolheu Curar!", velocidadeTexto);
                        
                        personagem.curarPersonagem();

                        break;
                    case 4:
                        Utilidades.printf("Você escolheu Fugir!", velocidadeTexto);
                        return;
                    default:
                        Utilidades.printf("Escolha inválida. Por favor, tente novamente.", velocidadeTexto);
                        continue;
                }
            } else if (round % 2 == 1) {
                Utilidades.printf("Turno do inimigo!\n\n", 0.06);
                inimigo.ataque(personagem);
            }
            
                Utilidades.sleep(3);
            round++;
        }
        
        if (personagem.getVidaPersonagem() <= 0) {
            System.out.println(personagem.getNomePersonagem() + " morreu em combate!");
        }

        if (inimigo.getVidaMonstro() <= 0) {
            Utilidades.printf("O inimigo foi derrotado!     ", 0.2);
        }
    }
}


