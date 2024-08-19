package proxy.proj2;

import java.util.Arrays;

public class ProxyDocumento implements IDocumento {
    private Documento documento;
    private Usuario usuario;

    public ProxyDocumento(
        Documento documento,
        Usuario usuario
    ) {
        this.documento = documento;
        this.usuario = usuario;
    }

    @Override
    public String exibir() {
        if (Arrays.asList(NivelAcesso.LEITURA, NivelAcesso.LEITURA_ESCRITA).contains(this.usuario.getNivelAcesso())) {
            return documento.exibir();
        }
        throw new AccessDeniedException("Acesso Negado!");
    }

    public void editar(String conteudo) {
        if (Arrays.asList(NivelAcesso.ESCRITA, NivelAcesso.LEITURA_ESCRITA).contains(this.usuario.getNivelAcesso())) {
            documento.editar(conteudo);
            return;
        }
        throw new AccessDeniedException("Acesso Negado!");
    }
}
