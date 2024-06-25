package jogo.saves;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ManipuladorArquivo {
    public static String path = "dados.txt";

    public static void registrarJogador(String nome, String password, String classe) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        String linha = nome + "," + password + "," + classe;
        writer.append(linha);
        writer.close();
    }

    public static String buscarJogador(String nome, String password) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String jogador = "";

		String linha = "";
		while (true) {
			if (linha == null) {
				break;
			}

			linha = buffRead.readLine();
            String[] campos = linha.split(",", -1);

            if(nome.equals(campos[0]) && password.equals(campos[1])) {
                jogador = linha;
                break;
            }
		}
		buffRead.close();

        return linha;
	}
}
