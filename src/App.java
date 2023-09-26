public class App {
    public static void main(String[] args) throws Exception {
        //Scanner!
        var s = new java.util.Scanner(System.in);
        s.useLocale(java.util.Locale.ENGLISH);

        //Variables!
        var player1LastRound = false;
        var player2LastRound = false;
        var player1Won = false;
        var player2Won = false;
        var player1WinnerThroughTwoSame = false;
        var player2WinnerThroughTwoSame = false;
        int D1;
        int D2;
        int player1Points = 0;
        int player2Points = 0;

        //Introduction and rules!!
        Introduction.intro();

        //Initialising names!
        System.out.println( "We would like for you to name the two players, starting with Player 1:");
        var name1 = s.nextLine();
        System.out.println("And now, Player 2:");
        var name2 = s.nextLine();

        //Checking names!
        name1 = NameChecker.checkName(name1, 1);
        name2 = NameChecker.checkName(name2, 2);

        //The game begins!!
        System.out.println(System.lineSeparator() + name1 + " rolls first!");

        do{
            D1 = Dice.rollDice();
            D2 = Dice.rollDice();

            player1Points += (D1 + D2);

            if (D1 == 1 && D2 == 1){
                //Checks for consecutive 1's
                player1Points = 0;
                System.out.println(name1 + " scored two 1's and lost all their points :(");
            }
            else if (player1Points >= 40 && (D1 == D2)){
                //Checks if player won
                System.out.println(System.lineSeparator() + name1 + " scores " + D1 + " and " + D2 + " and their total score is " + player1Points + ".");
                player1WinnerThroughTwoSame = true;
                break;
            }
            else if (D1 == D2){
                //Checks if player rolls two of the same excluding 1's and gives extra turn
                System.out.println(System.lineSeparator() + name1 + " scores " + D1 + " and " + D2 + " and their total score is " + player1Points + ".");
                System.out.println(name1 + " rolled two of a kind. You get an extra turn!");
                
                var tempD1 = Dice.rollDice();
                var tempD2 = Dice.rollDice();

                player1Points += (tempD1 + tempD2);

                System.out.println(System.lineSeparator() + name1 + " scores " + tempD1 + " and " + tempD2 + " on their extra turn and their total score is " + player1Points + ".");
            }
            else{
                //player rolled normally
                System.out.println(System.lineSeparator() + name1 + " scores " + D1 + " and " + D2 + " and their total score is " + player1Points + ".");
            }

            //Checks for consecutive sixers
            if (D1 == 6 && D2 == 6 && player1LastRound){
                player1Won = true;
                break;
            }
            else if (D1 == 6 && D2 == 6 && !player1LastRound){
                player1LastRound = true;
            }
            else {
                player1LastRound = false;
            }

            System.out.println("Press Enter to continue.");
            var ans1 = s.nextLine();

            D1 = Dice.rollDice();
            D2 = Dice.rollDice();

            player2Points += (D1 + D2);

            if (D1 == 1 && D2 == 1){
            //Checks for consecutive ones
                player2Points = 0;
                System.out.println(name2 + " scored two 1's and lost all their points :(");
            }
            else if (player2Points >= 40 && (D1 == D2)){
                //Checks if player won
                System.out.println(System.lineSeparator() + name2 + " scores " + D1 + " and " + D2 + " and their total score is " + player2Points + ".");
                player2WinnerThroughTwoSame = true;
                break;
            }
            else if (D1 == D2){
                //Checks if player rolls two of the same excluding 1's and gives extra turn
                System.out.println(System.lineSeparator() + name2 + " scores " + D1 + " and " + D2 + " and their total score is " + player2Points + ".");
                System.out.println(name2 + " rolled two of a kind. You get an extra turn!");
                
                var tempD1 = Dice.rollDice();
                var tempD2 = Dice.rollDice();

                player2Points += (D1 + D2);
                System.out.println(System.lineSeparator() + name2 + " scores " + tempD1 + " and " + tempD2 + " on their extra turn and their total score is " + player2Points + ".");
            }
            else{
                //Player rolled normally
                System.out.println(System.lineSeparator() + name2 + " scores " + D1 + " and " + D2 + " and their total score is " + player2Points + ".");
            }

            //Checks for consecutive sixers
            if (D1 == 6 && D2 == 6 && player2LastRound){
                player2Won = true;
                break;
            }
            else if (D1 == 6 && D2 == 6 && !player2LastRound){
                player2LastRound = true;
            }
            else {
                player2LastRound = false;
            }

            System.out.println("Press Enter to continue.");
            var ans2 = s.nextLine();
        } while(true);
        //Game is finished!!!
        s.close();

        //Winner is being checked
        WinnerChecker.checkWinner(name1, name2, player1Won, player2Won, player1WinnerThroughTwoSame, player2WinnerThroughTwoSame);
    }
}
