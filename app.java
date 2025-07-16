import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter text: ");
        String s = scanner.nextLine();
        int counter =0;



        for (int i = 0; i<s.length();i++ ){
            if(s.substring(i,i+1).equalsIgnoreCase("b") && s.substring(i+2,i+3).equalsIgnoreCase("b")){
                System.out.println(true);
                counter++;
                break;
            }
        }

        if (counter==0){
            System.out.println(false);
        }
    }

}
