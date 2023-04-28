import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CidadeProxyTest {

    @BeforeEach
    void setUp() {
        CidadeBD.addCidade(new Cidade("Belo Horizonte", 2521564, 331.401, "Minas Gerais"));
        CidadeBD.addCidade(new Cidade("São Paulo", 12325232, 1521.11, "São Paulo"));
    }

    @Test
    void deveRetornarPopulacaoCidade() {
        CidadeProxy cidade = new CidadeProxy("Belo Horizonte");

        assertEquals(2521564, cidade.getPopulacao());
    }

    @Test
    void deveRetornarAreaCidade() {
        CidadeProxy cidade = new CidadeProxy("São Paulo");

        assertEquals(1521.11, cidade.getArea());
    }

    @Test
    void deveRetornarEstadoCidade() {
        CidadeProxy cidade= new CidadeProxy("Belo Horizonte");

        assertEquals("Minas Gerais", cidade.getEstado());
    }

}