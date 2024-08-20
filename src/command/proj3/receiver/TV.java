package command.proj3.receiver;

public class TV {
    private String canal;
    private boolean ligado;
    private int volume;

    public TV() {
        canal = "";
        ligado = false;
        volume = 0;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
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
