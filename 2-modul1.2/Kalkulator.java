public class Kalkulator {

    public int calculate(int first, int second, char sign) {
        int result = 0;

        if (sign == '+') {
            result = first + second;
        } else if (sign == '-') {
            result = first - second;
        } else if (sign == '*') {
            result = first * second;
        } else if (sign == '/') {
            result = first / second;
        } else {
            System.out.println("Noto‘g‘ri amal kiritildi!");
        }

        return result;
    }
}
