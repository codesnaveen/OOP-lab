import java.util.Scanner;

public class sum
{
    public static void main(String[] args) {
        int sum=0;
        System.out.print("Enter the number limit: ");
        Scanner scn = new Scanner(System.in);
        int num= scn.nextInt();
        for(int i=0;i<=num;i++)
        {
        sum=sum+i;
        }
        System.out.println("Sumof numbers:"+sum);
        }
    
} 

