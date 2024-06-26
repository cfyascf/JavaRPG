import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import jogo.GerenciadorJogo;
import jogo.Itens.Pocao;
import jogo.Itens.PocaoGrande;
import jogo.personagens.herois.Arqueiro;
import jogo.personagens.herois.Guerreiro;
import jogo.personagens.herois.Ladino;
import jogo.personagens.herois.Mago;
import jogo.personagens.herois.Personagem;
import jogo.saves.ManipuladorArquivo;
import jogo.ui.Panels;
import jogo.ui.Utilidades;

public class App {
    public static Scanner scan = new Scanner(System.in);
    public static double digitTime = 0.06; 
    private static Personagem personagem;
    private static GerenciadorJogo jogo;

    // public static Jogador j;

    public static void run() throws IOException {
        int opcao = -1;
        
        while(opcao != 0) {
            opcao = logIn();

            switch(opcao) {
                case 1:
                    entrar();
                    break;
    
                case 2:
                    criarConta();
                    break;
    
                case 0:
                    System.out.println("Encerrando programa...");
                    break;
            }
        }

        scan.close();

    }

    public static int logIn() {
        Panels.mainTitle();
        Utilidades.sleep(5.0);
        Utilidades.clear();

        Utilidades.printf("Indentifique-se diante do", digitTime);
        Panels.oracle();

        Utilidades.sleep(1.0);
        Utilidades.skipLine(); 
        System.out.println("[1] Identifique-se");
        System.out.println("[2] Registre-se");
        System.out.println("[0] Encerrar");
        int opcao = Integer.parseInt(scan.nextLine());

        Utilidades.clear();

        return opcao;
    }

    public static void entrar() throws IOException {
        Utilidades.printf("Voce e conhecido como: ", digitTime);
        String nome = scan.nextLine();

        Utilidades.printf("Sua palavra secreta e: ", digitTime);
        String password = scan.nextLine();

        if((personagem = ManipuladorArquivo.buscarJogador(nome, password)) == null) {
            System.out.println("Login invalido!");
            System.exit(0);
        }

        Utilidades.skipLine();
        Utilidades.printf("O", digitTime);
        Utilidades.skipLine();
        Panels.oracle();
        Utilidades.printf("lembra de voce!", digitTime);
        Utilidades.sleep(3.0);
        Utilidades.skipLine();
        mainMenu();
    }

    public static void criarConta() throws IOException {

        Utilidades.printf("Responda com sinceridade,", digitTime);
        Panels.ele();
        Utilidades.printf("pode farejar suas mentiras...", digitTime);
        Utilidades.skipLine();
        Utilidades.sleep(1.0);

        Utilidades.printf("Voce e conhecido como: ", digitTime);
        String nome = scan.nextLine();

        Utilidades.printf("Sua palavra secreta e: ", digitTime);
        String password = scan.nextLine();

        Utilidades.skipLine();
        Utilidades.printf("O", digitTime);
        Panels.oracle();
        Utilidades.printf("parece te reconhecer!", digitTime);
        Utilidades.sleep(1.0);
        Utilidades.skipLine();

        Utilidades.printf("Eres aquele", digitTime);
        Utilidades.skipLine();

        System.out.println("[1] Mago");
        System.out.println("[2] Guerreiro");
        System.out.println("[3] Ladino");
        System.out.println("[4] Arqueiro");
        int opcao = Integer.parseInt(scan.nextLine());

        Utilidades.skipLine();

        if(opcao == 1) {

            Utilidades.printf("mago", digitTime);
            personagem = new Mago(nome);

        } else if(opcao == 2) {

            Utilidades.printf("guerreiro", digitTime);
            personagem = new Guerreiro(nome);

        } else if(opcao == 3) {

            Utilidades.printf("ladino", digitTime);
            personagem = new Ladino(nome);

        } else if(opcao == 4) {

            Utilidades.printf("arqueiro", digitTime);
            personagem = new Arqueiro(nome);

        }

        personagem.listaDeItens.add(new Pocao());
        personagem.listaDeItens.add(new Pocao());
        personagem.listaDeItens.add(new Pocao());
        personagem.listaDeItens.add(new PocaoGrande());
        personagem.listaDeItens.add(new PocaoGrande());

        Utilidades.skipLine(); 
        Utilidades.printf("agora famigerado pelas redondezas.", digitTime);
        Utilidades.skipLine();
        Utilidades.sleep(2);

        Utilidades.printf("Agora", digitTime);
        Panels.ele();
        Utilidades.printf("estará te vigiando...", digitTime);

        try {
            ManipuladorArquivo.registrarJogador(personagem, password);
        } catch(Exception e) {
            System.out.println("Erro registrando no arquivo.");
            throw new IOException();
        }

        Utilidades.sleep(3);
        Utilidades.clear();

        // Jogador j = new Jogador(dados);
        // jogador = j;
        mainMenu();
    }

    public static void mainMenu() {
        jogo = new GerenciadorJogo(personagem);

        
        Panels.welcome();
        
        
        Utilidades.sleep(3);
        while (personagem.getVidaPersonagem() > 0) {
            Utilidades.clear();
            Utilidades.printf("Bem vindo a guilda de aventureiros!", digitTime);
            Utilidades.skipLine();
            Utilidades.skipLine();

            Utilidades.sleep(2);
            Utilidades.printf("O que te traz aqui hoje?", digitTime);
            Utilidades.skipLine();
            Utilidades.sleep(1);

            System.out.println("[1] Personagem");
            System.out.println("[2] Inventário");
            System.out.println("[3] Raid");
            System.out.println("[0] Sair");
            int opcao = Integer.parseInt(scan.nextLine());

            switch (opcao) {
                case 1:
                    System.out.println("\nDescriçao do personagem: "); 
                    System.out.printf("Nome: %s\n", personagem.getNomePersonagem());
                    System.out.printf("Dano: %d\n", personagem.getDanoPersonagem());
                    System.out.printf("Vida: %d\n", personagem.getVidaPersonagem());
                    System.out.printf("Nivel: %d\n", personagem.getNivelPersonagem());

                    Utilidades.printf("\nAperte enter para continuar...", 0.06);
                    scan.nextLine();
                    break;
                case 2:
                    List<String> items = jogo.inventario();
    
                    items.forEach(x -> {
                        Utilidades.printf(x, 0.05);
                        Utilidades.skipLine();
                    });

                    Utilidades.printf("\nAperte enter para continuar...", 0.06);
                    scan.nextLine();
    
                    break;
                case 3:
                    jogo.iniciarRaid();

                    Utilidades.printf("Parabens, voce completou a quest", 0.05);
                    Utilidades.printf("!!!!!", 0.08);
                    break;
                case 0:
                    ManipuladorArquivo.atualizarJogador(personagem);
                    System.exit(0);
                    break;
            
                default:
                    break;
            }

            Utilidades.clear();
        }

        Utilidades.skipLine();
        Utilidades.printf("Game Over!", 0.9);
        Utilidades.skipLine();

        System.exit(0);
    }

}
