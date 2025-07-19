import java.util.Random;
import java.util.Scanner;

public class tictactoe {

    public static String chooseturn() {
        Random random = new Random();
        return random.nextBoolean() ? "X" : "O";

    }

    public static String[] fillboard() {
        String[] strings = new String[10];
        for (int i = 0; i < 10; i++) {
            strings[i] = String.valueOf(i);
        }
        return strings;
    }

    public static void printboard(String[] board) {

        System.out.println(getslot(board[1]) + " " + getslot(board[2]) + " " + getslot(board[3]));
        System.out.println();
        System.out.println(getslot(board[4]) + " " + getslot(board[5]) + " " + getslot(board[6]));
        System.out.println();
        System.out.println(getslot(board[7]) + " " + getslot(board[8]) + " " + getslot(board[9]));


    }

    static String getslot(String slot) {
        String RED_BACKGROUND = "\033[41m ";
        String YELLOW_BACKGROUND = "\033[43m ";
        String GREEN_BACKGROUND = "\033[42m ";
        String RESET = " \033[0m";
        if (slot.equals("X")){
            return RED_BACKGROUND + slot + RESET;
        }
        if (slot.equals("O")){
            return YELLOW_BACKGROUND + slot + RESET;
        }
        return GREEN_BACKGROUND + slot + RESET;
    }

    public static boolean isboadFull(String[] board) {
        for (int i = 1; i < board.length; i++) {
            if (board[i].equals(String.valueOf(i))) {
                return false;

            }

        }
        return true;
    }

    private static boolean checkWin(String[] board, String turn) {
        String[] winCases = {
                board[1] + board[2] + board[3],
                board[4] + board[5] + board[6],
                board[7] + board[8] + board[9],

                board[1] + board[4] + board[7],
                board[2] + board[5] + board[8],
                board[3] + board[6] + board[9],

                board[1] + board[5] + board[9],
                board[3] + board[5] + board[7]

        };
        for (String winCase : winCases) {
            if (winCase.equals(turn.repeat(3)))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] board = fillboard();
        String turn = chooseturn();
        printboard(board);
        System.out.println(turn + " first player");
        Scanner scanner = new Scanner(System.in);
        while (!isboadFull(board)) {
            printboard(board);
            System.out.print(turn + " Enter slot number : ");
            int slotNumber = scanner.nextInt();

            if (!board[slotNumber].equals(String.valueOf(slotNumber))) {
                System.out.println("slot already taken");
                continue;
            }
            board[slotNumber] = turn;
            if (checkWin(board, turn)) {
                printboard(board);
                System.out.println("Player " + turn + " win ))");
                return;
            } else {
                turn = turn.equals("X") ? "O" : "X";
            }

        }
        System.out.println("Draw ))");


    }


}
