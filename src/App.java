public class App {
    public static void main(String[] args) throws Exception {
        var s = new java.util.Scanner(System.in);
        s.useLocale(java.util.Locale.ENGLISH);

        var gameFinished = false;
        int D1;
        int D2;
        int player1Points = 0;
        int player2Points = 0;

        System.out.println("Hello and welcome to our dice game, we would like for you to name the two players:");
        var name1 = s.nextLine();
        System.out.println("For the second player:");
        var name2 = s.nextLine();

        //Initialising names!
        if(name1 == "" && name2 == ""){
            System.out.println(System.lineSeparator() + "You have not chosen any names, so the names will be set to P1 and P2");
            name1 = "P1";
            name2 = "P2";
        }
        else if (name1 == ""){
            System.out.println(System.lineSeparator() + "You have not chosen the name for Player 1, so it will be set to P1, Player 2 will be: " + name2 + ".");
            name1 = "P1";
        }
        else if (name2 == ""){
            System.out.println(System.lineSeparator() + "You have chosen the name for Player 1: " + name1 + ", and you have not chosen a name for Player 2, so it will be set to P2.");
            name2 = "P2";
        }
        else{
            System.out.println(System.lineSeparator() + "You have chosen the names of the players to be: Player 1: " + name1 + ", Player 2: " + name2 + ".");
        }

        System.out.println(System.lineSeparator() + name1 + " rolls first!");

        //The game begins!!
        do{
            D1 = Dice.rollDice();
            D2 = Dice.rollDice();

            player1Points += (D1 + D2);

            System.out.println(System.lineSeparator() + name1 + " scores " + D1 + " and " + D2 + " and their total score is " + player1Points + ".");
            if (player1Points >= 40){
                break;
            }
            System.out.println("Press Enter to continue or 'N' to stop the game.");
            var ans1 = s.nextLine();

            D1 = Dice.rollDice();
            D2 = Dice.rollDice();

            player2Points += (D1 + D2);

            System.out.println(System.lineSeparator() + name2 + " scores " + D1 + " and " + D2 + " and their total score is " + player2Points + ".");
            if (player2Points >= 40){
                break;
            }
            System.out.println("Press Enter to continue or 'N' to stop the game.");
            var ans2 = s.nextLine();

            if (player1Points >= 40 || player2Points >= 40)
            gameFinished = true;
        } while(!gameFinished);
        //Game is finished!!!

        //Winner is being checked
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
        else {
            System.out.println(System.lineSeparator() + "The game did not finish. Total score: " + System.lineSeparator() + name1 + ": " + player1Points + System.lineSeparator() + name2 + ": " + player2Points);
        }
        s.close();
    }
}
