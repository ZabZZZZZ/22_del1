public class dietest {
    public static void main(String[] args) {
            int i = 0;
        while (i < 1000) {
            i++;
            int d = Dice.rollDice();
            System.out.println("Round: " + i + " Die: " + d);

        }
    }

}