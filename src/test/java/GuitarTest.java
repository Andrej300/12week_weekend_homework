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





        }




