import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TheTest {
    private static void doTheThing(int expected, int actual) {
        assertEquals(expected, actual);
    }

    @Test
    public void simpleTest() throws Exception {
        assertEquals(3, 1 + 2);
    }
}