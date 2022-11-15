import java.util.*;
import java.io.*;
class Fileio
{
  public static void main(String a[])
  {
    try
    {
      FileInputStream fis=new FileInputStream("/home/mec/naveen/fileHandling.txt");
      int i=0;
      while(i!=-1)
      {
        i=fis.read();
        System.out.print((char)i);
      }
      System.out.println(" ");
      fis.close();
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
    try
    {
      FileOutputStream fos=new FileOutputStream("/home/mec/naveen/Handling.txt");
      System.out.println("Enter the new content of the file");
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      byte b[]=s.getBytes();
      fos.write(b);
      System.out.println("File content updated");
      fos.close();
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}
