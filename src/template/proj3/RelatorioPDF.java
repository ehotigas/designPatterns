package template.proj3;


public class RelatorioPDF extends Relatorio {
    private PDF pdf;
    public RelatorioPDF(IDadosRelatorio dadosRelatorio, PDF pdf) {
        super(dadosRelatorio);
        this.pdf = pdf;
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

    public PDF getPdf() {
        return pdf;
    }
}
