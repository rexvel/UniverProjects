package week1;
import java.lang.*;
public class PalindromeChecker {


    public static void main(String[] args) {
        String string_to_check="rot0ator";
        if(isPalindrome(string_to_check)) {
            System.out.println(string_to_check+" is a palindrome");
        }else {
            System.out.println(string_to_check+" is NOT a palindrome");
        }
    }

    public static boolean isPalindrome(String s) {
        String reverse="";
        for(int i=s.length()-1;i>=0;i--) {
            reverse = reverse+s.charAt(i);
        }
        if(s.equalsIgnoreCase(reverse)) {  // case insensitive check
            return true;
        }else {
            return false;
        }
    }

}
