package br.com.alura.loja.imposto;

import java.math.BigDecimal;
import java.util.Objects;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class Imposto {

    private Imposto outroImposto;

    public Imposto(Imposto outroImposto) {
        this.outroImposto = outroImposto;
    }

    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

	public BigDecimal calcular(Orcamento orcamento) {
	    BigDecimal valor = realizarCalculo(orcamento);

	    if (Objects.nonNull(outroImposto)) {
	        valor = valor.add(outroImposto.realizarCalculo(orcamento));
	    }

	    return valor;
	}

}
