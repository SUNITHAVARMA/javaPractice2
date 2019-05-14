import org.junit.Test;

import static org.junit.Assert.*;


public class PowerOfFourTest {
    PowerOfFour p;
    @Test
    public void powerOf()
    {
        p=new PowerOfFour();
        int result =p.isPowerOfFour(64);
        assertEquals(1,1);
    }
    @Test
    public void power()
    {
        p=new PowerOfFour();
        int result =p.isPowerOfFour(18);
        assertEquals(0,0);
    }
}

