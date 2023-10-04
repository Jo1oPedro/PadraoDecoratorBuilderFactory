import org.example.LancheBuilder;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.fail;

public class LancheBuilderTest {
    @Test
    public void deveRetornarExcecaoParaLancheIncompleto() {
        try {
            LancheBuilder lancheBuilder = new LancheBuilder();
            lancheBuilder.constroiLanche();
            fail();
        } catch (IllegalArgumentException exception) {
            assertEquals("Lanche incompleto", exception.getMessage());
        }
    }

    @Test
    public void deveRetornarPaoComCarne() {
        LancheBuilder lancheBuilder = new LancheBuilder();
        try {
            lancheBuilder.adicionaIngrediente("Carne");
            assertEquals("pao / carne", lancheBuilder.constroiLanche().getEstruturaLanche());
        } catch (ClassNotFoundException e) {
            fail();
        }
    }

    @Test
    public void deveRetornarPaoComCarneMaisTomate() {
        LancheBuilder lancheBuilder = new LancheBuilder();
        try {
            lancheBuilder.adicionaIngrediente("Carne").adicionaIngrediente("Tomate");
            assertEquals("pao / carne / tomate", lancheBuilder.constroiLanche().getEstruturaLanche());
        } catch (ClassNotFoundException e) {
            fail();
        }
    }
}
