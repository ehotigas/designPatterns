package command.proj3;

import command.proj3.command.AumentarVolumeTVComando;
import command.proj3.command.DesligarLuzComando;
import command.proj3.command.LigarLuzComando;
import command.proj3.command.LigarTVComando;
import command.proj3.invoker.ControleRemoto;
import command.proj3.receiver.Luz;
import command.proj3.receiver.TV;

public class SistemaControleRemoto {
    /*
     * Dicas para Desafios Futuros:
     * Implementar Redo: Adicione uma funcionalidade de refazer (redo) após um undo.
     * Estados complexos: Explore como lidar com estados mais complexos, como múltiplas operações que devem ser desfeitas em uma sequência específica.
     * Macro Command: Como mencionei, crie um comando composto que pode executar vários comandos em uma única ação.
     */
    public static void main(String[] args) {
        Luz luzQuarto = new Luz();
        TV tv = new TV();

        ControleRemoto controle = new ControleRemoto();
        controle.add("LigarLuz", new LigarLuzComando(luzQuarto));
        controle.add("DesligarLuz", new DesligarLuzComando(luzQuarto));
        controle.add("LigarTV", new LigarTVComando(tv));
        controle.add("AumentarVolumeTV", new AumentarVolumeTVComando(tv));

        controle.press("LigarTV");
        controle.press("AumentarVolumeTV");
        controle.press("DesligarLuz");

        System.out.println("-----------------");
        System.out.println(controle);
        controle.undo();
        System.out.println("-----------------");
        System.out.println(controle);
    }
}
