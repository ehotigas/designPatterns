package command.proj3.receiver;

public class AparelhoSom {
    private double estacao;
    private boolean ligado;
    private int volume;

    public AparelhoSom() {
        estacao = .0;
        ligado = false;
        volume = 0;
    }

    public double getEstacao() {
        return estacao;
    }

    public void setEstacao(double estacao) {
        this.estacao = estacao;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
