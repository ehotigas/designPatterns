package command.proj3.command;

import command.proj3.receiver.TV;

public class LigarTVComando implements ICommand {
    private TV tv;
    public LigarTVComando(TV tv) {
        this.tv = tv;
    }

    @Override
    public void executar() {
        System.out.println("TV Ligada");
        this.tv.setLigado(true);
    }
}
