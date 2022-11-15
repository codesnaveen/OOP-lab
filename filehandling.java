import java.util.*;
import java.io.*;
class Files
{
  public static void main(String a[])
  {
    try
    {
      Reader r=new FileReader("/home/mec/naveen/empty.txt");
      int ch;
      ch=r.read();
      while(ch!=1)
      {
        System.out.print((char)ch);
        ch=r.read();
      }
      System.out.println(" ");
      r.close();
    }
    catch(Exception e)
    {
      System.out.println("Program executed"+e);
    }
    try
    {
      Writer w=new FileWriter("/home/mec/naveen/empty.txt");
      String s=" This is the changed file ";
      
      w.write(s);
      w.close();
      System.out.println("file written");
    }
    catch(Exception e)
    {
      System.out.println("Program executed"+e);
    }
  }
