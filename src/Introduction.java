public class Introduction {
    public static void intro(){
        System.out.println("Hello and welcome to our dice game.");
        System.out.println("The rules are as follows: " + System.lineSeparator());
        System.out.println("1. Two dice are rolled and their sum is added to a total points score of each player." + System.lineSeparator() + "The first player to reach 40, as well as score two of a kind, wins.");
        System.out.println("2. If a player scores two 6's in two consecutive turns, the player wins immediately.");
        System.out.println("3. If a player scores two 1's, they lose all their points.");
        System.out.println("4. If a player scores two of a kind (excluding 1's), they get one extra turn" + System.lineSeparator());
    }
}