package template.proj3;

abstract class Relatorio {
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
}
