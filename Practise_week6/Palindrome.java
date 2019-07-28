package practise_week6;

import java.util.Scanner;
import java.lang.*;


public class Palindrome {
    public static void main(String args[])
    {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = input.nextLine();

            if (IsDigit(s))
            {
                System.out.println("String not palindrome.This is a number");
            }
            else
                {
                s= s.replaceAll("[^A-Za-z]","");
                if(isPalindrome(s)){
                    System.out.println("It`s palindrome");
                }
                else{
                    System.out.println("It`s not godamn palindrome");
                }

                System.out.println(s);
            }
    }
    public static boolean isPalindrome(String s)
    {
        return s.equals((new StringBuilder(s)).reverse().toString());
    }



    static boolean IsDigit(String string)
    {
        char str [] = string.toCharArray();

        for (char c: str)
        {
            if (c < '0' || c > '9')
                return false;
        }

        return true;
    }
}