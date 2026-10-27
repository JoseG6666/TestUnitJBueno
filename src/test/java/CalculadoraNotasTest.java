import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculadoraNotasTest {
    @Test
    void mediaDeTresNotas() {
        double resultado = CalculadoraNotas.calcularMedia(6, 8, 10);
        assertEquals(8.0, resultado, 0.0001);
        double resultado2 = CalculadoraNotas.calcularMedia(5, 5, 5);
        assertEquals(5, resultado2, 0.0001);
        double resultado3 = CalculadoraNotas.calcularMedia(0, 0, 0);
        assertEquals(0, resultado3, 0.0001);
    }
    @Test
    void notaFinalCorrecta() {
        double resultado = CalculadoraNotas.calcularNotaFinal(7, 9);
        assertEquals(7.8, resultado, 0.0001);
    }
    @Test
    void notaFinalSinPracticas() {
        double resultado = CalculadoraNotas.calcularNotaFinal(10, 0);
        assertEquals(6.0, resultado, 0.0001);
    }
    @Test
    void notaFinalSinExamen() {
        double resultado = CalculadoraNotas.calcularNotaFinal(0, 10);
        assertEquals(4.0, resultado, 0.0001);
    }
}
