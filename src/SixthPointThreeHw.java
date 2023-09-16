import java.sql.SQLOutput;
import java.util.logging.SocketHandler;

public class SixthPointThreeHw {
    public static void main(String[] args) {
        System.out.println(plus(2, 3));
        System.out.println(minus(3, 5));
        System.out.println(multiplication(5, 4));
        System.out.println(division(3, 6));
    }

    public static int plus(int a, int b){
        return a+b;
    }
    public static int minus(int a, int b){
        return a-b;
    }
    public static int multiplication(int a, int b){
        return a*b;
    }
    public static double division (double a, double b){
        return a/b;
    }
}
