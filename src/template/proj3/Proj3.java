package template.proj3;

public class Proj3 {
    /*
     * Exercício: Implementação de um Sistema de Relatórios
     * 
     * Contexto:
     * 
     * Você trabalha em uma empresa que precisa gerar relatórios de vendas em diferentes formatos. Cada formato de relatório (PDF, CSV, e HTML) tem uma estrutura similar, mas cada um exige uma implementação específica para a formatação e escrita dos dados. A empresa quer uma solução que permita gerar relatórios facilmente, mantendo a flexibilidade para adicionar novos formatos no futuro.
     * 
     * Tarefa:
     * 
     * Implemente um sistema de relatórios usando o padrão de projeto Template Method em Java. O sistema deve permitir a geração de relatórios em PDF, CSV e HTML.
     * 
     * Passos:
     * 
     * Crie a classe abstrata Relatorio:
     * 
     * Defina um método gerarRelatorio que siga os passos gerais para gerar um relatório:
     * abrirDocumento(): Método abstrato que será implementado pelas subclasses.
     * escreverCabecalho(): Método abstrato que será implementado pelas subclasses.
     * escreverConteudo(): Método abstrato que será implementado pelas subclasses.
     * fecharDocumento(): Método abstrato que será implementado pelas subclasses.
     * Dentro do método gerarRelatorio, siga a ordem dos passos acima.
     * Crie as subclasses RelatorioPDF, RelatorioCSV e RelatorioHTML:
     * 
     * Cada classe deve herdar de Relatorio e implementar os métodos abstratos:
     * abrirDocumento: Abrir o documento no formato específico.
     * escreverCabecalho: Escrever o cabeçalho do relatório.
     * escreverConteudo: Escrever o conteúdo do relatório.
     * fecharDocumento: Fechar e salvar o documento.
     * Exemplo de Uso:
     * 
     * Crie um exemplo onde você gera um relatório em PDF, outro em CSV e outro em HTML usando as classes criadas.
     * Requisitos:
     * 
     * Utilize o padrão de projeto Template Method para garantir que o processo de geração de relatórios siga a mesma ordem de passos.
     * As classes concretas (PDF, CSV, HTML) devem focar apenas nas implementações específicas de cada formato.
     * Dica:
     * 
     * Pense em como a implementação pode ser reutilizada para adicionar novos formatos de relatório no futuro sem modificar as classes já existentes.
     */
}
