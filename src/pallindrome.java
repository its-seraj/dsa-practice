import java.util.Scanner;
import java.util.Stack;

public class pallindrome {

    public static boolean isPallindrome(String inputString){
        Stack<Character> reverseInputChar = new Stack<>();

        for(char ch : inputString.toCharArray()){
            reverseInputChar.push(ch);
        }

        String reverseInputString = "";

        while(!reverseInputChar.isEmpty()){
            reverseInputString += reverseInputChar.pop();
        }

        if(inputString.equals(reverseInputString)) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputString = sc.next();

        boolean result = isPallindrome(inputString);

        if(result) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
