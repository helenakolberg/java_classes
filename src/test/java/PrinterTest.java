import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(20, 100);
    }

    @Test
    public void hasSheets() {
        assertEquals(20, printer.getSheets());
    }

    @Test
    public void hasEnoughSheets() {
        printer.print(5, 2);
        assertEquals(10, printer.getSheets());
        assertEquals(90, printer.getToner());
    }

    @Test
    public void doesNotHaveEnoughSheets() {
        printer.print(15, 3);
        assertEquals(20, printer.getSheets());
        assertEquals(100, printer.getToner());
    }

    @Test
    public void hasToner() {
        assertEquals(100, printer.getToner());
    }

}
