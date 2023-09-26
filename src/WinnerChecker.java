public class WinnerChecker {
    public static void checkWinner(String name1, String name2, boolean p1Won, boolean p2Won, boolean p1Winner, boolean p2Winner) {
        if (p1Won){
            System.out.println(name1 + " has won by throwing two consecutive sixes!");
            return;
        } else if (p2Won){
            System.out.println(name2 + " has won by throwing two consecutive sixes!");
            return;
        }
        else if (p1Winner){
            System.out.println(name1 + " has won the game. Congratulations " + name1 + "!!!");
            System.out.println("Better luck next time " + name2 + " :)");
        }
        else if (p2Winner){
            System.out.println(name2 + " has won the game. Congratulations " + name2 + "!!!");
            System.out.println("Better luck next time " + name1 + " :)");
        }
    }
}
