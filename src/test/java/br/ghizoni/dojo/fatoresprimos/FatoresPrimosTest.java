package br.ghizoni.dojo.fatoresprimos;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FatoresPrimosTest {

    @Test
    public void fatores_primos_de_2(){
        FatoresPrimos fatoresPrimos = new FatoresPrimos();
        List<Integer> fatores = fatoresPrimos.calculaFatores(2);

        assertEquals(1, fatores.size());
        assertEquals(2, fatores.get(0).intValue());
    }

    @Test
    public void fatores_primos_de_3(){
        FatoresPrimos fatoresPrimos = new FatoresPrimos();
        List<Integer> fatores = fatoresPrimos.calculaFatores(3);

        assertEquals(1, fatores.size());
        assertEquals(3, fatores.get(0).intValue());
    }

    @Test
    public void fatores_primos_de_4(){
        FatoresPrimos fatoresPrimos = new FatoresPrimos();
        List<Integer> fatores = fatoresPrimos.calculaFatores(4);

        assertEquals(2, fatores.size());
        assertEquals(2, fatores.get(0).intValue());
        assertEquals(2, fatores.get(1).intValue());
    }
}