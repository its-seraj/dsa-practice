import java.util.Scanner;

public class prime{
    public static boolean isPrime(int number){
        if(number == 0 || number == 1){
            return false;
        }

        for(int i = 2; i <= number / 2; i++){
            if(number % i == 0) return false;
        }

        return true;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        boolean result = isPrime(number);

        if(result)System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}
