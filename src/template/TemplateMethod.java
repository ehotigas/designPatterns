package template;

abstract class Compilador {
    abstract void coletarCodigoFonte();

    abstract void compilarObjeto();

    abstract void executar();

    public final void compilarExecutar() {
        coletarCodigoFonte();
        compilarObjeto();
        executar();
    }
}

class IOS extends Compilador {
    @Override
    void coletarCodigoFonte() {
        System.out.println("Coletando código fonte");
    }

    @Override
    void compilarObjeto() {
        System.out.println("Compilando objeto.");
    }

    @Override
    void executar() {
        System.out.println("Executando Programa.");
    }
}

class Android extends Compilador {
    @Override
    void coletarCodigoFonte() {
        System.out.println("Coletando código fonte");
    }

    @Override
    void compilarObjeto() {
        System.out.println("Compilando objeto.");
    }

    @Override
    void executar() {
        System.out.println("Executando Programa.");
    }
}

public class TemplateMethod {
    /*
     * Template:
     *  - É uma classe usada para definir os passos de um algoritmo.
     *  - Esses passos são conhecidos como operações primitivas no contexto do padrão.
     *  - Essas operações são definidas como métodos abstratos.
     * 
     * Exemplo: Criar um template bebida com métodos como: ferverAguar(). Implementar classes Café e Chá que implementem o template Bebida
     */

     public static void main(String[] args) {
        IOS ios = new IOS();
        Android android = new Android();
        ios.compilarExecutar();
        android.compilarExecutar();
     }
}
