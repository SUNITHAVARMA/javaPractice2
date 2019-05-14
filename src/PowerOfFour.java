import java.util.Scanner;

public class PowerOfFour {
    static int isPowerOfFour(int n)
    {
        if(n == 0)
            return 0;
        while(n != 1)
        {
            if(n % 4 != 0)
                return 0;
            n = n / 4;
        }
        return 1;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
       int num=s.nextInt();

        if(isPowerOfFour(num) == 1)
            System.out.println(num +
                    " is a power of 4");
        else
            System.out.println(num +
                    "is not a power of 4");

    }
}
