package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.OrcamentoProxy;

public class TestesComposicao {

    public static void main(String[] args) {
        Orcamento orcamentoAntigo = new Orcamento();
        orcamentoAntigo.adicionarItem(new ItemOrcamento(BigDecimal.valueOf(200)));
        orcamentoAntigo.reprovar();

        Orcamento orcamentoNovo = new Orcamento();
        orcamentoNovo.adicionarItem(new ItemOrcamento(BigDecimal.valueOf(500)));
        orcamentoNovo.adicionarItem(orcamentoAntigo);

        //Composite
        System.out.println(orcamentoNovo.getValor());


        //Proxy
        OrcamentoProxy proxy = new OrcamentoProxy(orcamentoNovo);
        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());

    }
}
