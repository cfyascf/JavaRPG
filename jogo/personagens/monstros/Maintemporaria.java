package CombateEPersonagem;

public class Maintemporaria {
    public static void main(String[] args) {
        Personagem personagem = new Personagem("Carlos");

        CaveiraFlamejante inimigo = new CaveiraFlamejante();

        Combate.iniciarCombate(personagem, inimigo);


    }
}
