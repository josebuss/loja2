package br.com.alura.loja.orcamento;

import java.util.Map;

import br.com.alura.loja.http.HttpAdapter;

public class RegistroDeOrcamento {

    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento) {
        if (!orcamento.isFinalizado()) {
            return;
        }
        String url = "Hppts://api/orcamento";
        Map<String, Object> dados = Map.of(//
                                           "valor",
                                           orcamento.getValor(),
                                           "quantidade",
                                           orcamento.getQuantidadeItens());
        http.post(url, dados);
    }
}
