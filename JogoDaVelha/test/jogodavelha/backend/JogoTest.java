/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha.backend;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vicbona
 */
public class JogoTest {

    private Peca x = new Peca(Face.X);
    private Peca o = new Peca(Face.O);
    private Peca tabuleiro[][] = new Peca[][]{{x, x, x}, {x, null, x}, {x, x, x}};
    Jogador jogador1 = new Jogador("teste", Face.X);
    Jogador jogador2 = new Jogador("teste1", Face.O);

    public JogoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of fazJogada method, of class Jogo.
     */
    @Test
    public void testFazJogada() {
        System.out.println("fazJogada -->");
        int linha = 1;
        int coluna = 1;
        Jogo instance = new Jogo();
        instance.setTabuleiro(tabuleiro);
        instance.incluirJogador(jogador1);
        instance.incluirJogador(jogador2);
        boolean expResult = false;
        boolean result = instance.fazJogada(linha, coluna);
        assertEquals(expResult, result);
    }

    /**
     * Test of incluirJogador method, of class Jogo. ✓
     */
    @Test
    public void testIncluirJogador() {
        System.out.println("incluirJogador");
        Jogo instance = new Jogo();
        instance.incluirJogador(jogador1);
        instance.incluirJogador(jogador2);
        Jogador expResult[] = new Jogador[2];
        expResult[0] = jogador1;
        expResult[1] = jogador2;
        Assert.assertArrayEquals(expResult, instance.getJogadores());
    }

    /**
     * Test of temPeca method, of class Jogo.
     */
    @Test
    public void testTemPeca() {
        System.out.println("temPeca");
        int linha = 0;
        int coluna = 0;
        Jogo instance = new Jogo();
        boolean expResult = false;
        boolean result = instance.temPeca(linha, coluna);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of colocarPeca method, of class Jogo.
     */
    @Test
    public void testColocarPeca() {
        System.out.println("colocarPeca");
        Peca peca = null;
        int linha = 0;
        int coluna = 0;
        Jogo instance = new Jogo();
        instance.colocarPeca(peca, linha, coluna);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of obterVencedor method, of class Jogo.
     */
    @Test
    public void testObterVencedor() {
        System.out.println("obterVencedor");
        Jogo instance = new Jogo();
        Jogador expResult = null;
        Jogador result = instance.obterVencedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of terminouJogo method, of class Jogo.
     */
    @Test
    public void testTerminouJogo() {
        System.out.println("terminouJogo -->");
        Jogo instance = new Jogo();
        instance.setTabuleiro(tabuleiro);
        boolean expResult = true;
        boolean result = instance.terminouJogo();
        assertEquals(expResult, result);
    }

    /**
     * Test of identificaQuemJoga method, of class Jogo.
     */
    @Test
    public void testIdentificaQuemJoga() {
        System.out.println("identificaQuemJoga");
        Jogo instance = new Jogo();
        Jogador expResult = null;
        Jogador result = instance.identificaQuemJoga();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getFaceVitoriosa method, of class Jogo.
     */
    @Test
    public void testGetFaceVitoriosa() {
        System.out.println("getFaceVitoriosa");
        Jogo instance = new Jogo();
        Face expResult = null;
        Face result = instance.getFaceVitoriosa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of hasIa method, of class Jogo. ✓
     */
    @Test
    public void testHasIa() {
        System.out.println("hasIa --->");
        Jogo instance = new Jogo();
        Jogador jogadorHumano = new Jogador("teste", Face.X);
        instance.incluirJogador(jogadorHumano);
        instance.hasIa();
        Jogador expResult = new Jogador("Computador", Face.O);
        Jogador result = instance.getJogadores()[1];
        assertEquals(expResult.getNome(), result.getNome());
    }

    /**
     * Test of fazJogadaIa method, of class Jogo.
     */
    @Test
    public void testFazJogadaIa() {
        System.out.println("fazJogadaIa");
        Jogo instance = new Jogo();
        instance.fazJogadaIa();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getTabuleiro method, of class Jogo.
     */
    @Test
    public void testGetTabuleiro() {
        System.out.println("getTabuleiro");
        Jogo instance = new Jogo();
        Peca[][] expResult = null;
        Peca[][] result = instance.getTabuleiro();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getJogadores method, of class Jogo.
     */
    @Test
    public void testGetJogadores() {
        System.out.println("getJogadores");
        Jogo instance = new Jogo();
        Jogador[] expResult = null;
        Jogador[] result = instance.getJogadores();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setTabuleiro method, of class Jogo.
     */
    @Test
    public void testSetTabuleiro() {
        System.out.println("setTabuleiro");
        Peca[][] tabuleiro = null;
        Jogo instance = new Jogo();
        instance.setTabuleiro(tabuleiro);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setJogadores method, of class Jogo.
     */
    @Test
    public void testSetJogadores() {
        System.out.println("setJogadores");
        Jogador[] jogadores = null;
        Jogo instance = new Jogo();
        instance.setJogadores(jogadores);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isIa method, of class Jogo.
     */
    @Test
    public void testIsIa() {
        System.out.println("isIa");

        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setIa method, of class Jogo.
     */
    @Test
    public void testSetIa() {
        System.out.println("setIa");
        boolean ia = false;
        Jogo instance = new Jogo();
        instance.setIa(ia);
        // TODO review the generated test code and remove the default call to fail.
    }

}
