package br.ghizoni.dojo.fatoresprimos;

import java.util.ArrayList;
import java.util.List;

/*Este problema foi utilizado em 148 Dojo(s).

Todo número inteiro positivo pode ser representado pelo produto de potências de números primos (os chamados fatores primos).

Por exemplo o número 6 pode ser representado pelo produto do números primos 2 x 3.

Outros exemplos:

5 = 5 (números primos só tem um fator primo - ele mesmo)
100 = 2 x 2 x 5 x 5
198 = 2 x 3 x 3 x 11
276 = 2 x 2 x 3 x 23
Desenvolva um programa que dado um número inteiro positivo, retorne os seus fatores primos*/

public class FatoresPrimos {
    public List<Integer> calculaFatores(int i) {

        ArrayList<Integer> listValuePrimo = new ArrayList<>();
        List<Integer> primosList = getPrimos();
            listValuePrimo.add(i);

        return listValuePrimo;
    }

    private List getPrimos() {
    }
}
