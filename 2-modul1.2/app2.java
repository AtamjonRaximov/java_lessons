import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Kalkulator kalkulator1 = new Kalkulator();

        System.out.print("enter first number: ");
        int first_n = scanner.nextInt();

        System.out.print("enter sign: ");
        char sign = scanner.next().charAt(0);

        System.out.print("enter second number: ");
        int second_n = scanner.nextInt();

        int result = kalkulator1.calculate(first_n, second_n, sign);
        System.out.println(first_n + " " + sign + " " + second_n + " = " + result);
    }
}
