import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {


    Piano testPiano;

    @Before
    public void before() {
        testPiano = new Piano("Seiler","Yamaha U1", "Black", 800,  1200);
    }


    @Test
    public void hasManufacturer() {
        assertEquals("Seiler", testPiano.getManufacturer());
    }

    @Test
    public void hasColour() {
        assertEquals("Black", testPiano.getColour());

    }

    @Test
    public void hasModel(){
        assertEquals("Yamaha U1", testPiano.getModel());
    }

    @Test
    public void hasCostPrice(){
        assertEquals(800, testPiano.getCostPrice());
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(1200, testPiano.getSellingPrice());

    }

    @Test
    public void canSetSellingPrice() {
        testPiano.setSellingPrice(1300);
        assertEquals(1300, testPiano.getSellingPrice());
    }

    @Test
    public void canPlayPiano(){
        assertEquals("Lalala", testPiano.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(400, testPiano.calculateMarkup());
    }





}

