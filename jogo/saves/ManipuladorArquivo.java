package jogo.saves;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import jogo.Itens.Item;
import jogo.Itens.Pocao;
import jogo.Itens.PocaoGrande;
import jogo.personagens.herois.Arqueiro;
import jogo.personagens.herois.Guerreiro;
import jogo.personagens.herois.Ladino;
import jogo.personagens.herois.Mago;
import jogo.personagens.herois.Personagem;
import jogo.raids.AcoesItem;

public class ManipuladorArquivo {
    public static String path = "dados.txt";

    public static void registrarJogador(Personagem personagem, String password) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
        String lista_items = String.join(",", personagem.listaDeItens.stream().map(x -> x.getClass().getSimpleName()).toList());
        //formato: nome, senha, classe_personagem, classe_armadura, dano, mod_ataque, nivel, vida:items
        String linha_personagem = String.join(",",
                                        personagem.getNomePersonagem(),
                                        password,
                                        personagem.getClass().getSimpleName(),
                                        personagem.getClasseDeArmaduraPersonagem().toString(),
                                        personagem.getDanoPersonagem().toString(),
                                        personagem.getModificadorAtaquePersonagem().toString(),
                                        personagem.getNivelPersonagem().toString(),
                                        personagem.getVidaPersonagem().toString());

        String linha = String.join(":", linha_personagem, lista_items);

        writer.append(linha);
        writer.append(System.lineSeparator());
        writer.close();
    }

    private static Personagem carregarPersonagem(String[] info, String[] items) throws Exception {
        Personagem p = null;
        switch (info[2]) {
            case "Guerreiro":
                p = new Guerreiro(info[0]);
                break;
            case "Arqueiro":
                p = new Arqueiro(info[0]);
                break;
            case "Mago":
                p = new Mago(info[0]);
                break;
            case "Ladino":
                p = new Ladino(info[0]);
                break;
        
            default:
                throw new Exception("Nao foi possivel carregar o personagem!");
        }

        p.setClasseDeArmaduraPersonagem(Integer.parseInt(info[3]));
        p.setDanoPersonagem(Integer.parseInt(info[4]));
        p.setModificadorAtaquePersonagem(Integer.parseInt(info[5]));
        p.setNivelPersonagem(Integer.parseInt(info[6]));
        p.setVidaPersonagem(Integer.parseInt(info[7]));

        for (String i : items) {
            var iMago = AcoesItem.itemsMago.stream().filter(x -> x.getSimpleName().contains(i)).toList();
            var iGuerreiro = AcoesItem.itemsGuerreiro.stream().filter(x -> x.getSimpleName().contains(i)).toList();
            var iLadino = AcoesItem.itemsLadino.stream().filter(x -> x.getSimpleName().contains(i)).toList();
            var iArqueiro = AcoesItem.itemsArqueiro.stream().filter(x -> x.getSimpleName().contains(i)).toList();

            Item itemCarregado = null;
            if (iMago.size()>0) {
                itemCarregado = iMago.getFirst().getConstructor().newInstance();
            }
            if (iGuerreiro.size()>0) {
                itemCarregado = iGuerreiro.getFirst().getConstructor().newInstance();
            }
            if (iArqueiro.size()>0) {
                itemCarregado = iArqueiro.getFirst().getConstructor().newInstance();
            }
            if (iLadino.size()>0) {
                itemCarregado = iLadino.getFirst().getConstructor().newInstance();
            }

            if (i.equals("Pocao")) {
                itemCarregado = new Pocao();
            }

            if (i.equals("PocaoGrande")) {
                itemCarregado = new PocaoGrande();
            }

            p.listaDeItens.add(itemCarregado);
        }

        return p;
    }

    public static Personagem buscarJogador(String nome, String password) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
        Personagem p = null;

		String linha = "";
		while (true) {
            
            linha = buffRead.readLine();
            
			if (linha == null) {
				break;
			}

            String[] campos = linha.split(":");
            String info_str = campos[0];
            String items_str = campos[1];

            String[] info_arr = info_str.split(",");
            String[] item_arr = items_str.split(",");

            if(nome.equals(info_arr[0]) && password.equals(info_arr[1])) {
                try {
                    p = carregarPersonagem(info_arr, item_arr);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            }
		}

		buffRead.close();

        return p;
	}

    public static void atualizarJogador(Personagem personagem) {

        try {
            List<String> linhas = Files.readAllLines(Paths.get(path));
            List<String> updatedList = new ArrayList<>();
            for (String linha : linhas) {
                if (linha.startsWith(personagem.getNomePersonagem())) {
                    String[] campos = linha.split(":");
                    String info_str = campos[0];

                    String[] info_arr = info_str.split(",");

                    info_arr[3] = personagem.getClasseDeArmaduraPersonagem().toString();
                    info_arr[4] = personagem.getDanoPersonagem().toString();
                    info_arr[5] = personagem.getModificadorAtaquePersonagem().toString();
                    info_arr[6] = personagem.getNivelPersonagem().toString();
                    info_arr[7] = personagem.getVidaPersonagem().toString();

                    String lista_items = String.join(",",
                                                         personagem.listaDeItens
                                                                        .stream().map(x -> x.getClass().getSimpleName())
                                                                        .toList()
                                                    );
                    
                    String new_info = String.join(",", info_arr);

                    linha = String.join(":", new_info, lista_items);
                }
                updatedList.add(linha);
            }

            Files.write(Paths.get(path), updatedList);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

