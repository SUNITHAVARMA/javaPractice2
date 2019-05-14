import java.io.File;
import java.util.Scanner;
import java.io.*;
public class FileOfFolder
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        File f=new File("/home/suneetha/IdeaProjects/javaExcercise2/src/");
        String file[]=f.list();
        for(String names:file)
        {
            System.out.println(names);
        }
        String fname;
        Scanner scan = new Scanner(System.in);

        /* enter filename with extension to open and read its content */

        System.out.print("Enter File Name to Open (with extension like file.txt) : ");
        fname = scan.nextLine();

        /* this will reference only one line at a time */

        String line = null;
        try
        {
            /* FileReader reads text files in the default encoding */
            FileReader fileReader = new FileReader(fname);


            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println("Original content:");
            while((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }
            /* always close the file after use */
            bufferedReader.close();
        }
        catch(IOException ex)
        {
            System.out.println("Error reading file named '" + fname + "'");
        }
    }
}