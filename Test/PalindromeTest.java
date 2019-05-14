import org.junit.Test;

import static org.junit.Assert.*;
public class PalindromeTest {
    InputReverse p;
    @Test
    public void palindromeCheck(){
        p=new InputReverse();
        String r=p.revInput("hello");
        assertEquals("olleh",r);
    }
    @Test
    public void emptyPalindrome()
    {
        p=new InputReverse();
        String result=p.revInput(" ");

        //assert
        assertEquals(" ",result);

    }
    @Test
    public void palindromeChe(){
        p=new InputReverse();
        String r=p.revInput("wow");
        assertEquals("wow",r);
    }

}
