import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter n number: ");
        int n = scanner.nextInt();


        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.print("enter arr's " + i + " value: ");
            arr[i] += scanner.nextInt();

        }




        for (int i = 0; i < n; i++) {
            boolean isduplicate = false;

            for (int j = 0; j < i; j++) {
                if(arr[i]==arr[j]){
                    isduplicate=true;
                    break;
                }

            }
            if(!isduplicate){
                System.out.print(arr[i]+" ");
            }


        }


    }

}
