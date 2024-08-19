package command;

import java.util.ArrayList;
import java.util.List;

class Programa {
    private String nome;
    private boolean opcao;

    public Programa(String nome, boolean opcao) {
        this.nome = nome;
        this.opcao = opcao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isOpcao() {
        return opcao;
    }

    public void setOpcao(boolean opcao) {
        this.opcao = opcao;
    }
}

class Instalador {
    private String destino;
    private String fonte;
    private List<Programa> opcoes;

    public Instalador(String fonte, String destino) {
        this.destino = destino;
        this.fonte = fonte;
        opcoes = new ArrayList<>();
    }

    public void preferencias(Programa escolha) {
        opcoes.add(escolha);
    }

    public void executar() {
        for (Programa opcao : opcoes) {
            if (opcao.isOpcao()) {
                System.out.println("Copiando arquivos binários de " + fonte + " para " + destino + ".");
            }
            else {
                System.out.println("Operação finalizada.");
            }
        }
    }
}

public class Command {
    /*
     * Command:
     *  - Um objeto é utilizado para encapsular todas informações necessárias para executar uma ação ou disparar um evento.
     * 
     *  Exemplo: assistente de instalação. Navegar pelas telas encapsulando as escolhas e no final realizar a instalação.
     */

     public static void main(String[] args) {
        Instalador python = new Instalador("python3.9.1.gzip", "/usr/bin");
        python.preferencias(new Programa("Python", true));
        python.preferencias(new Programa("Java", false));

        python.executar();
     }
}
