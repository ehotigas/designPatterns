package proxy.proj2;

public class Proj2 {
    /*
     * Você foi contratado para desenvolver um sistema de controle de acesso a documentos confidenciais de uma empresa.
     * O sistema deve permitir que apenas usuários autorizados possam visualizar ou modificar esses documentos.
     * 
     * Requisitos:
     * 
     * Documento: Crie uma classe Documento que tenha propriedades como conteudo, titulo, e um método exibir que imprime o conteúdo do documento na tela.
     * 
     * Proxy de Documento: Crie um proxy para a classe Documento chamado ProxyDocumento. Esse proxy deve controlar o acesso ao documento real.
     * O proxy deve verificar se o usuário tem permissão para acessar o documento antes de permitir a visualização ou modificação.
     * 
     * Controle de Acesso: Implemente uma verificação de acesso simples no proxy. Crie uma classe Usuario com propriedades como nome e nivelDeAcesso.
     * O nível de acesso pode ser Leitor (apenas leitura) ou Editor (leitura e escrita). O proxy deve permitir que apenas os usuários com nível de
     * acesso Editor possam modificar o conteúdo do documento, enquanto os usuários com nível de acesso Leitor só podem visualizar o conteúdo.
     * 
     * Teste: Crie um cenário de teste onde diferentes usuários tentam acessar e modificar o documento através do proxy.
     * Verifique se as permissões estão sendo aplicadas corretamente.
    */

    public static void main(String[] args) {
        Usuario tiago = new Usuario("Tiago", NivelAcesso.LEITURA_ESCRITA);
        Usuario gustavo = new Usuario("Gustavo", NivelAcesso.LEITURA);
        Documento relatorioFatoi = new Documento("", "Relatório Fatoi");
        
        ProxyDocumento proxyDocumento = new ProxyDocumento(relatorioFatoi, tiago);
        ProxyDocumento proxyDocumento2 = new ProxyDocumento(relatorioFatoi, gustavo);

        proxyDocumento.editar("teste");
        System.out.println(proxyDocumento2.exibir());

        proxyDocumento2.editar("");
        System.out.println(proxyDocumento.exibir());
    }
}
