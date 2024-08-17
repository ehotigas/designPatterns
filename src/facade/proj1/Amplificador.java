package facade.proj1;

public class Amplificador {
    private boolean ligado;
    private int volume;
    public Amplificador(int volume) {
        this.ligado = false;
        this.volume = volume;
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
