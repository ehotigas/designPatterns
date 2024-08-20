package command.proj3.command;

import command.proj3.receiver.TV;

public class AumentarVolumeTVComando implements ICommand {
    private TV tv;
    public AumentarVolumeTVComando(TV tv) {
        this.tv = tv;
    }

    @Override
    public void executar() {
        System.out.println("Volume da TV Aumentado");
        this.tv.setVolume(this.tv.getVolume() + 1);
    }
}
