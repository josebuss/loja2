package br.com.alura.loja.orcamento;

import java.math.BigDecimal;
import java.util.Objects;

public class OrcamentoProxy extends Orcamento {

    private BigDecimal valor;
    private Orcamento orcamento;

    /**
     * @param valor
     * @param orcamento
     */
    public OrcamentoProxy(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    @Override
    public BigDecimal getValor() {
        if (Objects.isNull(this.valor)) {
            this.valor = orcamento.getValor();
        }
        return this.valor;
    }

}
