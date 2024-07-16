

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VacationPlannerServiceTest {
    @Test
    public void shouldCalculateVacationMonths() {
        VacationPlannerService service = new VacationPlannerService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;
        int actual = service.calculate(income, expenses, threshold);
        assertEquals(expected, actual);
    }
}
