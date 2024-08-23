package template.proj3;

public class RelatorioCSV extends Relatorio {
    private CSV csv;
    public RelatorioCSV(IDadosRelatorio dadosRelatorio, CSV csv) {
        super(dadosRelatorio);
        this.csv = csv;
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

    public CSV getCsv() {
        return csv;
    }
}
