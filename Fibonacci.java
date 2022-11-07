import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args) {
        int n,a=0,b=0,c=1;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n= scn.nextInt();
        System.out.println("Fibonacci Series");
        for(int i=1;i<=n;i++)
        {
        a=b;
        b=c;
        c=a+b;
        System.out.println(a+"");
        }
    }
} 

