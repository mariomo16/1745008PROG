import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class OperacionesTest {
    @Test
    void testEsPrimo() {
    OperacionesMatematicas operaciones = new OperacionesMatematicas();
    equals(operaciones.esPrimo(4));
    }

    @Test
    void testEsCapicua() {
    OperacionesMatematicas operaciones = new OperacionesMatematicas();
    equals(operaciones.esCapicua(989));
    }
    @ParameterizedTest
    @CsvSource({
        "5,3,4,5",
        "9,1,3,9",
        "8,1,8,3"
    })
    @DisplayName("Test de mayor")
    @Test
    void testEsMayor (int nEsperado, int a, int b, int c) {
        OperacionesMatematicas operaciones = new OperacionesMatematicas();

    }
}
