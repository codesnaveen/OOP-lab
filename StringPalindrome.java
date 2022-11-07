import java.util.Scanner;

public class StringPalindrome
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scn.nextLine();
        String revStr="";
        int i;
        int strLen = str.length();
        for(i = strLen - 1; i >= 0; i--){
            revStr = revStr + str.charAt(i);
        }
        if(str.equals(revStr)){
            System.out.println(str+" IS A PALINDROME STRING");
        }else{
            System.out.println(str+" IS A NOT PALINDROME STRING");
        }
    }
} 

