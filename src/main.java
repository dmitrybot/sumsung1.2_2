import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int c = a % 10 + a/ 100 + a / 10 % 10;
        System.out.println(c);
    }
}