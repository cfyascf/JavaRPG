import java.util.Random;
public abstract class Monstros {
    protected String descricao;
    protected String nomeAtaque;
    protected float danoAtaque;
    protected  int vida;
    protected  int escudo;


    public abstract void ataque();
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNomeAtaque() {
        return nomeAtaque;
    }

    public void setNomeAtaque(String nomeAtaque) {
        this.nomeAtaque = nomeAtaque;
    }

    public float getDanoAtaque() {
        return danoAtaque;
    }

    public void setDanoAtaque(float danoAtaque) {
        this.danoAtaque = danoAtaque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    static int numeroAleatorio(){
        Random numeroAleatorio = new Random();
        return numeroAleatorio.nextInt(21);
    }
}
