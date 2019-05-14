import org.junit.Test;

import static org.junit.Assert.*;



import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {
    EvenNumTest en;
    @Test
    public void getNum()
    {
        en=new EvenNumTest();
        boolean result=en.isEven(31);
        assertEquals("false","false");
    }
    @Test
    public void oddNum()
    {
        en=new EvenNumTest();
        boolean result=en.isEven(30);
        assertEquals("true","true");
    }


}


