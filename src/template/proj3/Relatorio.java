package template.proj3;

abstract class Relatorio {
    public IDadosRelatorio dadosRelatorio;
    
    public Relatorio(IDadosRelatorio dadosRelatorio) {
        this.dadosRelatorio = dadosRelatorio;
    }

    abstract void abrirDocumento();
    abstract void escreverCabecalho();
    abstract void escreverConteudo();
    abstract void fecharDocumento();

    public final void gerarRelatorio() {
        abrirDocumento();
        escreverCabecalho();
        escreverConteudo();
        fecharDocumento();
    }

    public final IDadosRelatorio getDadosRelatorio() {
        return dadosRelatorio;
    }
}
