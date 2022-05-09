import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100);
    }
    @Test
    public void testPrinterHasPaper(){
        assertEquals(100, printer.getNumOfSheets());
    }
    @Test
    public void testPrint(){
        assertEquals("6 copies printed. 94 sheets of paper left", printer.print(3, 2));
    }
    @Test
    public void testWontPrintIfNotEnoughPaper(){
        assertEquals("Failed to print, not enough paper.", printer.print(10, 11));
    }
    @Test
    public void testHasToner(){
        assertEquals(100, printer.getTonerVolume());
    }
    @Test
    public void testTonerReducesOnPrint(){
        printer.print(2, 3);
        assertEquals(94, printer.getTonerVolume());
    }
}
