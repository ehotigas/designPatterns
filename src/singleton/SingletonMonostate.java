package singleton;

public class SingletonMonostate {
    /*
     * Objetivo: Compartilhar estados entre instâncias; 
     * 
     * Vantagem: O padrão MonoState pode ser útil quando você deseja que várias instâncias compartilhem o mesmo estado,
     * mas ainda quer permitir múltiplas instâncias da classe.
     * 
     * Desvantagem: Pode ser mais difícil de entender e manter, especialmente em sistemas complexos,
     * onde o compartilhamento de estado pode levar a efeitos colaterais inesperados.
    */
    private static boolean state = false;

    public boolean getState() {
        return SingletonMonostate.state;
    }

    public void setState(boolean state) {
        SingletonMonostate.state = state;
    }
}
