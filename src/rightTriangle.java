import java.util.Scanner;

public class rightTriangle {
    public static  boolean isRightAngleTriangle(int a, int b, int c){
        if(
            a * a == b * b + c * c ||
            b * b == c * c + a * a ||
            c * c == b * b + a * a) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean result = isRightAngleTriangle(a, b, c);

        if(result) System.out.println("Right Triangle");
        else System.out.println("Not right Triangle");
    }
}
