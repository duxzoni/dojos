package br.ghizoni.dojo.caixaeletronico;

import java.util.HashMap;
import java.util.Map;

public class Caixa {
    public Map<Integer, Integer> saque(Integer valor) {

        if (valor == null || valor % 10 != 0){
            throw new IllegalArgumentException("Não pode notas não divisiveis por 10 ou saque nulo");

        }
        Map<Integer, Integer> listaNotas = new HashMap<>();

        int resto = valor;

        resto = getResto(valor, listaNotas, resto, 100);
        resto = getResto(resto, listaNotas, resto, 50);
        resto = getResto(resto, listaNotas, resto, 20);
        resto = getResto(resto, listaNotas, resto, 10);

        return listaNotas;
    }

    private int getResto(Integer valor, Map<Integer, Integer> listaNotas, int resto, int cem) {
        if(valor >= cem) {
            resto = valor % cem;
            listaNotas.put(cem, valor / cem);
        }
        return resto;
    }
}
