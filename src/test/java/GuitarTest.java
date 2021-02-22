import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {


    Guitar testGuitar;

    @Before
    public void before() {
        testGuitar = new Guitar("Blackie","Gibson", "Black", 300, 600);
    }

    @Test
    public void hasName() {
        assertEquals("Blackie", testGuitar.getName());
    }

    @Test
    public void hasColour() {
        assertEquals("Black", testGuitar.getColour());

    }

    @Test
    public void hasModel(){
        assertEquals("Gibson", testGuitar.getModel());
    }

    @Test
    public void hasCostPrice(){
        assertEquals(300, testGuitar.getCostPrice());
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(600, testGuitar.getSellingPrice());

    }

    @Test
    public void canSetSellingPrice() {
        testGuitar.setSellingPrice(540);
        assertEquals(540, testGuitar.getSellingPrice());
    }

    @Test
    public void canPlayGuitar(){
        assertEquals("Dram-dram", testGuitar.play());
    }
    @Test
    public void canCalculateMarkup() {
        assertEquals(300, testGuitar.calculateMarkup());
    }

}




