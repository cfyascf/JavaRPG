package jogo.ui;

public class Utilidades {
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
