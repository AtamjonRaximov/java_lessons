import java.util.Random;
import java.util.Scanner;

public class guessgame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter min number: ");
        int min = scanner.nextInt();
        System.out.print("enter max number: ");
        int max = scanner.nextInt();
        int compyuter = (int) Math.round(Math.random()*(max-min)+min);

        int counter =0;


        do{
            System.out.print("enter guess number : ");
            int guessnumber = scanner.nextInt();

            if(guessnumber == compyuter){
                System.out.println("you win ! 😊");
                break;
            }
            else {
                counter++;

                if (counter == 3){
                    System.out.println("you lose :( 😒😒");
                    break;
                }else {
                    if (guessnumber < compyuter){
                        System.out.println("your's number smaller than computer's number :) "+ compyuter);
                    }else {
                        System.out.println("your's number bigger than computer's number :) "+ compyuter);
                    }
                    System.out.println("try again !");
                }
            }

        }while (true);

    }
}
