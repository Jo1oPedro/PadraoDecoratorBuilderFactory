import org.example.*;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PaoTest {

    @Test
    public void deveRetornarPaoVazio() {
        Pao pao = new Pao();
        assertEquals(1.0f, pao.getPrecoLanche(), 0.01);
        assertEquals("pao", pao.getEstruturaLanche());
    }

    @Test
    public void deveRetornarPaoComCarne() {
        IngredienteDecorator carne = new Carne(new Pao());
        assertEquals(1.5f, carne.getPrecoLanche(), 0.01);
        assertEquals("pao / carne", carne.getEstruturaLanche());
    }

    @Test
    public void deveRetornarPaoComCarneMaisTomate() {
        IngredienteDecorator tomate = new Tomate(new Carne(new Pao()));
        assertEquals(1.9f, tomate.getPrecoLanche(), 0.01);
        assertEquals("pao / carne / tomate", tomate.getEstruturaLanche());
    }

    @Test
    public void deveRetornarPaoComCarneMaisTomateMaisAlface() {
        IngredienteDecorator alface = new Alface(new Tomate(new Carne(new Pao())));
        assertEquals(2.3f, alface.getPrecoLanche(), 0.01);
        assertEquals("pao / carne / tomate / alface", alface.getEstruturaLanche());
    }
}
