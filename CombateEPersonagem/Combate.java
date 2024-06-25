package CombateEPersonagem;

import CombateEPersonagem.Monstros;
import CombateEPersonagem.Personagem;

import java.util.Scanner;

public class Combate {
    
    int round;
    int cargaSuprema;
    Scanner scanner = new Scanner(System.in);

    public void iniciarCombate(Personagem personagem, Monstros inimigo) {
        
        while(personagem.getVidaPersonagem() > 0 && inimigo.getVidaMonstro() > 0) {
            
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
                        
                        personagem.atacar(inimigo);
                        break;
                    case 2:
                        
                        if()    
                    
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
                }
            }



            System.out.println();
        }

        
        
    }
}


