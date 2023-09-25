public class WinnerChecker {
    public static void checkWinner(int player1Points, int player2Points, String name1, String name2) {
        if(player1Points >= 40 && player2Points >= 40){
            if (player1Points > player2Points)
            System.out.println(System.lineSeparator() + "Both of the players reached above 40 points, but ultimately, " + name1 + " won the game with a point difference of " + (player1Points - player2Points) + " points.");
            else
            System.out.println(System.lineSeparator() + "Both of the players reached above 40 points, but ultimately, " + name2 + " won the game with a point difference of " + (player2Points - player1Points) + " points.");
        }
        else if (player1Points >= 40){
            System.out.println(System.lineSeparator() + "The player " + name1 + " won the game with " + player1Points + " points and a point difference of " + (player1Points - player2Points) + " points. Congratulations " + name1 + "!!");
        }
        else if (player2Points >= 40) {
            System.out.println(System.lineSeparator() + "The player " + name2 + " won the game with " + player2Points + " points and a point difference of " + (player2Points - player1Points) + " points. Congratulations " + name2 + "!!");
        }
        
    }
}
