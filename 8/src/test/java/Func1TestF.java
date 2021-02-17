import org.junit.Test;

import static org.junit.Assert.*;

public class Func1TestF {

    @Test
    public void func1() throws InterruptedException {
        Func1 func1 = new Func1();
        String actual = func1.func1(new int[]{-4, 3, -9, 0, 4, 1, 0});
        String expected = "0.5" + ' ' + "0.33333334" + ' ' +  "0.16666667";
        assertEquals(expected, actual);
    }
}