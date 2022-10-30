//Import Scanner to take input from user
import java.util.Scanner;

//Main / Driver Class
public class Main
{
    //Main Function
    public static void main(String[] args) {
        //Creating an object for Scanner
        Scanner scn = new Scanner(System.in);
        //Printing a lable to give user an idea what to enter
        System.out.print("Enter a string: ");
        //Taking entered number in variable of int type
        String str = scn.nextLine();
        //Declaring and Initilizing a variable of String Type
        String revStr="";
        //Declaring a variable of Integer Type
        int i;
        //Get the length of string
        int strLen = str.length();
        //For loop for iteration
        //Iteration will go on till the string length variable greater than equal to 0
        for(i = strLen - 1; i >= 0; i--){
            //Adding the reverse string and charecter at of string at `i` position
            revStr = revStr + str.charAt(i);
        }
        //Check weather entered string equals to reverse string
        if(str.equals(revStr)){
            //If Yes,Then it is a palindrom string
            System.out.println(str+" IS A PALINDROME STRING");
        }else{
            //If No,Then it is not a palindrom string
            System.out.println(str+" IS A NOT PALINDROME STRING");
        }
    }
} 
