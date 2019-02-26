package br.ghizoni.dojo.caixaeletronico;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CaixaTest {

    private Caixa caixa;

    @Before
    public void setUp(){
        caixa = new Caixa();
    }

    @Test
    public void should_return_10 () {
        Map<Integer, Integer> notas = new HashMap<>();
        notas = caixa.saque(10);
        Assert.assertEquals(Integer.valueOf(1), notas.get(Integer.valueOf(10)));
    }

    @Test
    public void should_return_20 () {
        Map<Integer, Integer> notas = new HashMap<>();
        notas = caixa.saque(20);
        Assert.assertEquals(Integer.valueOf(1), notas.get(Integer.valueOf(20)));
    }

    @Test
    public void should_return_50 () {
        Map<Integer, Integer> notas = new HashMap<>();
        notas = caixa.saque(50);
        Assert.assertEquals(Integer.valueOf(1), notas.get(Integer.valueOf(50)));
    }

    @Test
    public void should_return_100 () {
        Map<Integer, Integer> notas = new HashMap<>();
        notas = caixa.saque(100);
        Assert.assertEquals(Integer.valueOf(1), notas.get(Integer.valueOf(100)));
    }

    @Test (expected = IllegalArgumentException.class)
    public void should_return_5 () {
        Map<Integer, Integer> notas = new HashMap<>();
        notas = caixa.saque(5);
    }

    @Test (expected = IllegalArgumentException.class)
    public void should_return_15 () {
        Map<Integer, Integer> notas = new HashMap<>();
        notas = caixa.saque(15);
    }

    @Test (expected = IllegalArgumentException.class)
    public void should_not_accepted_null () {
        Map<Integer, Integer> notas = new HashMap<>();
        notas = caixa.saque(null);
    }

    @Test
    public void should_expected_150 () {
        Map<Integer, Integer> notas = new HashMap<>();
        notas = caixa.saque(150);
        Assert.assertEquals(Integer.valueOf(1), notas.get(50));
        Assert.assertEquals(Integer.valueOf(1), notas.get(100));
    }

    @Test
    public void should_expected_160 () {
        Map<Integer, Integer> notas = new HashMap<>();
        notas = caixa.saque(160);
        Assert.assertEquals(Integer.valueOf(1), notas.get(10));
        Assert.assertEquals(Integer.valueOf(1), notas.get(50));
        Assert.assertEquals(Integer.valueOf(1), notas.get(100));
    }

    @Test
    public void should_expected_190 () {
        Map<Integer, Integer> notas = new HashMap<>();
        notas = caixa.saque(190);
        Assert.assertEquals(Integer.valueOf(2), notas.get(20));
        Assert.assertEquals(Integer.valueOf(1), notas.get(50));
        Assert.assertEquals(Integer.valueOf(1), notas.get(100));
    }
}