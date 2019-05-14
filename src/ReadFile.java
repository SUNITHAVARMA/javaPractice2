                import java.io.File;
                import java.io.*;

                public class ReadFile {
                    public static void main(String args[])throws Exception{
                        File fl=new File("/home/suneetha/IdeaProjects/javaExcercise2/src/exampletext.txt");
                        FileReader file=new FileReader(fl);
                        int i=1;
                        while ((i=file.read())!=-1){
                            System.out.print(Character.toUpperCase((char)i));

                        }
                        System.out.println();
                        System.out.println("Length of the file"+" "+fl.length());




                    }

                }