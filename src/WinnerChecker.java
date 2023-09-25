public class WinnerChecker {
    public static void checkWinner(String name1, String name2, var player1Winner, var player2Winner) {

        if (player1Winner = true) {
            System.out.println(System.lineSeparator() + "The player " + name1 + " was the first to reach 40 points and roll 2 of the same number");

        } else if (player2Winner = true) {
            System.out.println(System.lineSeparator() + "The player " + name2 + " was the first to reach 40 points and roll 2 of the same number");

        } else {
            System.out.println(System.lineSeparator() + "The game did not finish. Total score: " + System.lineSeparator() + name1 + ": " + player1Points + System.lineSeparator() + name2 + ": " + player2Points);
        }
    }
}    