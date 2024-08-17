package facade.proj1;

public class HomeTheaterFacade {
    private Amplificador amplificador;
    private PlayerDVD playerDVD;
    private Projetor projetor;
    private SistemaLuz sistemaLuz;

    public HomeTheaterFacade(
        Amplificador amplificador,
        PlayerDVD playerDVD,
        Projetor projetor,
        SistemaLuz sistemaLuz
    ) {
        this.amplificador = amplificador;
        this.playerDVD = playerDVD;
        this.projetor = projetor;
        this.sistemaLuz = sistemaLuz;
    }


    public void assistirFilme(String filme) {
        this.amplificador.setLigado(true);
        this.playerDVD.setLigado(true);
        this.projetor.setLigado(true);
        this.playerDVD.setDnv(filme);
        this.playerDVD.setPausado(false);
        this.sistemaLuz.setLigado(false);
    }

    public void desligarSistema() {
        this.sistemaLuz.setLigado(true);
        this.playerDVD.setPausado(true);
        this.amplificador.setLigado(false);
        this.playerDVD.setLigado(false);
        this.projetor.setLigado(false);
    }


    public Amplificador getAmplificador() {
        return amplificador;
    }

    public void setAmplificador(Amplificador amplificador) {
        this.amplificador = amplificador;
    }

    public PlayerDVD getPlayerDVD() {
        return playerDVD;
    }

    public void setPlayerDVD(PlayerDVD playerDVD) {
        this.playerDVD = playerDVD;
    }

    public Projetor getProjetor() {
        return projetor;
    }

    public void setProjetor(Projetor projetor) {
        this.projetor = projetor;
    }

    public SistemaLuz getSistemaLuz() {
        return sistemaLuz;
    }

    public void setSistemaLuz(SistemaLuz sistemaLuz) {
        this.sistemaLuz = sistemaLuz;
    }
}
