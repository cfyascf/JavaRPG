package jogo.combate;

import java.util.Scanner;

import jogo.personagens.herois.Personagem;
import jogo.personagens.monstros.Monstros;

public class Combate {
    
    int round = 0;
    int cargaSuprema = 0;
    Scanner scanner = new Scanner(System.in);

    void start(Personagem personagem, Monstros inimigo) {
        while (personagem.getVidaPersonagem() > 0 && inimigo.getVidaMonstro() > 0) {
            if(round % 2 == 0){
                System.out.println("Escolha uma opção:");
                System.out.println("1. Atacar");
                System.out.println("2. Suprema");
                System.out.println("3. Curar");
                System.out.println("4. Fugir");
                System.out.print("Digite sua escolha: ");
                
                int choice = scanner.nextInt();
    
                switch (choice) {
                    case 1:
                        System.out.println("Você escolheu Atacar!");
                        
                        personagem.ataque(inimigo);
                        break;
                    case 2:
                        
                        System.out.println("Você escolheu Suprema!");
                        
                        personagem.Suprema(inimigo);
                        break;
                    case 3:
                        System.out.println("Você escolheu Curar!");
                        
                        //personagem.curar();
                        break;
                    case 4:
                        System.out.println("Você escolheu Fugir!");
                        
                        return;
                    default:
                        System.out.println("Escolha inválida. Por favor, tente novamente.");
                        break;
                } else {
                    inimigo.ataque(personagem);
                }
            }       
        }
        
    }
}


