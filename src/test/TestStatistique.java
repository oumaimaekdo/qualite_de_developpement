import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class TestStatistique {

    @Test
    public void whenCalculatingMoyenneOfEightAndTwelve_ShouldReturnTen() {

        Calculatrice calc = mock(Calculatrice.class);

        when(calc.add(8, 12)).thenReturn(20);
        when(calc.div(20, 2)).thenReturn(10);

        Statistique stat = new Statistique();
        stat.calculatrice = calc;

        float resultat = stat.moyenne(8, 12);

        assertEquals(10, resultat);
    }
}
