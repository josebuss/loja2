package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesImposto {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(BigDecimal.valueOf(100)));
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();

        //Decorator
        System.out.println("ICMS + ISS: " + calculadoraDeImpostos.calcular(orcamento, new ICMS(new ISS(null))));
        System.out.println("ICMS: " + calculadoraDeImpostos.calcular(orcamento, new ICMS(null)));
    }
}
