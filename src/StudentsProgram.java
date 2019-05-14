import java.util.Scanner;
import java.util.Arrays;

public class StudentsProgram {

        public static void main(String [] args) {
            System.out.println("Enter students :");
            Scanner obj = new Scanner(System.in);
            int n = obj.nextInt();
            int b[] = new int[n];
            StudentsProgram obj1=new StudentsProgram();
            if(n>100 && n<0)
            {
                System.out.println("Please enter student number bteween 0 to 100");
            }
            else {

                for (int i = 0; i < n; i++) {
                    b[i] = obj.nextInt();
                }
                double average = obj1.avg(b);
                System.out.println("Average of " + n + "students is" + average);
                int minimum = obj1.min(b);
                System.out.println("minimum number is" + minimum);
                int maximum = obj1.max(b);
                System.out.println("maximum number is" + maximum);
            }
        }

        public double avg( int a[]) {
            int sum = 0;
            int l = a.length;
            for (int i = 0; i < l; i++) {
                System.out.println("Grade of student "+ (i+1)+ "is" +a[i]);
                sum += a[i];
            }
            int avg1=sum/l;
            return avg1;
        }
        public int min( int a[])
        {
            Arrays.sort(a);
            return a[0];
        }
        public int max( int a[])
        {   int l1 = a.length;
            Arrays.sort(a);
            return a[l1-1];
        }

    }


