public class App {
    public static void main(String[] args) throws Exception {
        var s = new java.util.Scanner(System.in);
        s.useLocale(java.util.Locale.ENGLISH);

        var D1 = Dice.rollDice();
        var D2 = Dice.rollDice();

        System.out.println(D1 + " " + D2 + " " + (D1+D2));

    }
}
