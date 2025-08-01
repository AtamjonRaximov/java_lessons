/**
 * app klassi foydalanuvchi kiritgan raqamga qarab hafta kunini chiqaradi.
 * 1 - Dushanba, 2 - Seshanba, ..., 7 - Yakshanba
 */
import java.util.Scanner;

public class app {

    /**
     * Haftaning kunini raqam asosida topuvchi metod.
     *
     * @param dayNumber 1 dan 7 gacha bo‘lgan son kiritiladi va uni switich case aniqlab o'shanga mos haftani chiqarib beradi
     *                  agar undan raqam bo'lmas no'to'g'ri raqam kiritdiz deydi
     * @return Haftaning mos kuni return qilib yuboradi.
     */
    public static String getWeekday(int dayNumber) {
        switch (dayNumber) {
            case 1: return "Dushanba";
            case 2: return "Seshanba";
            case 3: return "Chorshanba";
            case 4: return "Payshanba";
            case 5: return "Juma";
            case 6: return "Shanba";
            case 7: return "Yakshanba";
            default: return "Noto‘g‘ri son! Iltimos, 1 dan 7 gacha kiriting.";
        }
    }

    /**
     * Dastur kirish nuqtasi. Foydalanuvchidan hafta kuni raqamini olib, natijani chiqaradi.
     *
     * @param getWeekday tepadi klass hafta kunlarini aniqlaydiganga number ni berib yuboryapmiz number foydalunvchidan consoldan raqam aniqlab beradi keyin getweekday ga yuboraddi
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1 dan 7 gacha son kiriting : ");
        int number = scanner.nextInt();

        String result = getWeekday(number);
        System.out.println("Hafta kuni: " + result);
    }
}
