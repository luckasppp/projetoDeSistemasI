import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PaisTest {
    Pais brasil;
    Pais argentina;
    Pais uruguai;
    Pais chile;
    Pais colombia;
    Pais equador;
    Pais paraguai;
    Pais bolivia;
    Pais peru;
    Pais venezuela;

    @Before
    public void setUp() {
        brasil = new Pais("Brasil", "Brasília", 8515767);
        argentina = new Pais("Argentina", "Buenos Aires", 2780400);
        uruguai = new Pais("Uruguai", "Montevidéu", 181034);
        chile = new Pais("Chile", "Santiago", 756102);
        colombia = new Pais("Colombia", "Bogotá", 1141748);
        equador = new Pais("Equador", "Quito", 276841);
        paraguai = new Pais("Paraguai", "Assunção", 406752);
        bolivia = new Pais("Bolivia", "La Paz", 1098581);
        peru = new Pais("Peru", "Lima", 1285216);
        venezuela = new Pais("Venezuela", "Caracas", 916445);
    }

    @Test
    public void testEqualsTrue() {
        Pais brasil2 = new Pais("Brasil", "Brasília", 8515767);
        assertEquals(true, brasil.equals(brasil2));
    }

    @Test
    public void testEqualsFalse() {
        Pais brasil2 = new Pais("Brasil", "Rio de Janeiro", 8515767);
        assertEquals(false, brasil.equals(brasil2));
    }

    @Test
    public void testEqualsFalseTwo() {
        Pais brasil2 = new Pais("Austrália", "Rio de Janeiro", 8515767);
        assertEquals(false, brasil.equals(brasil2));
    }

    @Test
    public void testGetCapital() {
        assertEquals("Bogotá", colombia.getCapital());
    }

    @Test
    public void testGetDimensao() {
        assertEquals(1285216, peru.getDimensao(), 0.01);
    }

    @Test
    public void testGetFronteira() {
        brasil.setFronteira(argentina);
        brasil.setFronteira(uruguai);
        brasil.setFronteira(bolivia);

        List<Pais> expectedFronteiras = new ArrayList<Pais>();
        expectedFronteiras.add(argentina);
        expectedFronteiras.add(uruguai);
        expectedFronteiras.add(bolivia);

        assertEquals(expectedFronteiras, brasil.getFronteira());
    }

    @Test
    public void testGetNome() {
        assertEquals(uruguai.getNome(), "Uruguai");
    }

    @Test
    public void testPaisesQueFazemFronteira() {
        brasil.setFronteira(paraguai);
        argentina.setFronteira(paraguai);

        argentina.setFronteira(uruguai);
        brasil.setFronteira(uruguai);

        brasil.setFronteira(bolivia);
        argentina.setFronteira(bolivia);

        brasil.setFronteira(argentina);
        brasil.setFronteira(peru);
        argentina.setFronteira(brasil);
        argentina.setFronteira(chile);

        List<Pais> expectedFronteirasEmComum = new ArrayList<Pais>();
        expectedFronteirasEmComum.add(paraguai);
        expectedFronteirasEmComum.add(uruguai);
        expectedFronteirasEmComum.add(bolivia);

        assertEquals(expectedFronteirasEmComum, brasil.paisesQueFazemFronteira(argentina));
    }

    @Test
    public void testSetCapital() {
        bolivia.setCapital("Sucre");
        assertEquals(bolivia.getCapital(), "Sucre");
    }

    @Test
    public void testSetDimensao() {
        peru.setDimensao(peru.getDimensao()+2);
        assertEquals(1285218, peru.getDimensao(), 0.01);
    }

    @Test
    public void testSetFronteira() {
        Pais brasil2 = new Pais("Brasil", "Brasília", 523145);
        assertFalse(brasil.setFronteira(brasil2));
    }

    @Test
    public void testSetNome() {
        uruguai.setNome("Uruguay");
        assertEquals("Uruguay", uruguai.getNome());
    }
}