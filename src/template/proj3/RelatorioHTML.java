package template.proj3;

public class RelatorioHTML extends Relatorio {
    private HTML html;
    public RelatorioHTML(IDadosRelatorio dadosRelatorio, HTML html) {
        super(dadosRelatorio);
        this.html = html;
    }

    @Override
    void abrirDocumento() {
        /* Abrir o documento */
    }

    @Override
    void escreverCabecalho() {
        /* Escrever Cabeçalho */        
    }

    @Override
    void escreverConteudo() {
        /* Escrever Conteúdo */
    }

    @Override
    void fecharDocumento() {
        /* Fechar documento */
    }

    public HTML getHtml() {
        return html;
    }
}
