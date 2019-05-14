import java.util.Scanner;

public class InputReverse {

    public String revInput(String st){
        String rev="";
        for(int i=st.length()-1;i>=0;i--)
        {
            rev=rev+st.charAt(i);
        }
        System.out.println("Reverse of the given string:"+" "+rev);
        return rev;


    }
    public static void main(String args[]){
        System.out.println("Enter input:");
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        InputReverse ir=new InputReverse();
       String reverse= ir.revInput(s1);

        String original=s1;
        if(original.equals(reverse))
        {
            System.out.println("Given input is palindrome");
        }
        else
            System.out.println("Given input is not palndrome");


    }
}

