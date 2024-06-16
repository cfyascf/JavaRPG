import java.io.IOException;
import java.util.Scanner;

public class App {
    public static Scanner scan = new Scanner(System.in);
    public static double digitTime = 0.07; 

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
        sleep(5.0);
        clear();

        printf("Indentifique-se diante do", digitTime);
        Panels.oracle();

        sleep(1.0);
        skipLine(); 
        System.out.println("[1] Identifique-se");
        System.out.println("[2] Registre-se");
        System.out.println("[0] Encerrar");
        int opcao = Integer.parseInt(scan.nextLine());

        clear();

        return opcao;
    }

    public static void entrar() throws IOException {
        printf("Voce e conhecido como: ", digitTime);
        String nome = scan.nextLine();

        printf("Sua palavra secreta e: ", digitTime);
        String password = scan.nextLine();

        if(ManipuladorArquivo.buscarJogador(nome, password) == "") {

        }

        skipLine();
        printf("O", digitTime);
        Panels.oracle();
        printf("lembra de voce!", digitTime);
        sleep(3.0);
        skipLine();
        mainMenu();
    }

    public static void criarConta() throws IOException {

        printf("Responda com sinceridade,", digitTime);
        Panels.ele();
        printf("pode farejar suas mentiras...", digitTime);
        skipLine();
        sleep(1.0);

        printf("Voce e conhecido como: ", digitTime);
        String nome = scan.nextLine();

        printf("Sua palavra secreta e: ", digitTime);
        String password = scan.nextLine();

        skipLine();
        printf("O", digitTime);
        Panels.oracle();
        printf("parece te reconhecer!", digitTime);
        sleep(1.0);
        skipLine();

        printf("Eres aquele", digitTime);
        skipLine();

        System.out.println("[1] Mago");
        System.out.println("[2] Guerreiro");
        System.out.println("[3] Ladino");
        System.out.println("[4] Arqueiro");
        int opcao = Integer.parseInt(scan.nextLine());
        String classe = "";

        skipLine();
        if(opcao == 1) {
            printf("mago", digitTime);
            classe = "mago";
        } else if(opcao == 2) {
            printf("guerreiro", digitTime);
            classe = "guerreiro";
        } else if(opcao == 3) {
            printf("ladino", digitTime);
            classe = "ladino";
        } else if(opcao == 4) {
            printf("arqueiro", digitTime);
            classe = "arqueiro";
        }

        skipLine(); 
        printf("agora famigerado pelas redondezas.", digitTime);
        skipLine();
        sleep(2);

        printf("Agora", digitTime);
        Panels.ele();
        printf("estará te vigiando...", digitTime);

        try {
            ManipuladorArquivo.registrarJogador(nome, password, classe);
        } catch(Exception e) {
            System.out.println("Erro registrando no arquivo.");
            throw new IOException();
        }

        sleep(3);
        clear();

        // Jogador j = new Jogador(dados);
        // jogador = j;
        mainMenu();
    }

    public static int mainMenu() {
        Panels.welcome();
        sleep(2);
        printf("O que te traz aqui hoje?", digitTime);
        skipLine();
        sleep(2);

        System.out.println("[1] Personagem");
        System.out.println("[2] Inventário");
        System.out.println("[3] Loja");
        System.out.println("[4] Raid");
        System.out.println("[0] Sair");
        int opcao = Integer.parseInt(scan.nextLine());

        clear();

        return opcao;
    }

    public static void skipLine() {
        System.out.println();
    }

    public static void clear() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printf(String word, double t) {
        for (char l : word.toCharArray()) {
            System.out.print(l);
            System.out.flush();
            sleep(t);
        }

        skipLine();
    }

    public static void sleep(double seconds) {
        // Converte segundos para milissegundos
        long milliseconds = (long) (seconds * 1000);
        // Obtém a parte fracionária dos milissegundos em nanosegundos
        int nanoseconds = (int) ((seconds * 1000 - milliseconds) * 1_000_000);
    
        try {
            Thread.sleep(milliseconds, nanoseconds); // Pausa pelo tempo calculado
        } catch (InterruptedException e) {
            System.err.println("Thread foi interrompida");
        }
    }
}
