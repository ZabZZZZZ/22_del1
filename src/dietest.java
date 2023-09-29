public class dietest {
    public static void main(String[] args) {
        int i = 0;
        var twos = 0;
        var threes = 0;
        var fours = 0;
        var fives = 0;
        var sixes = 0;
        var sevens = 0;
        var eights = 0;
        var nines = 0;
        var tens = 0;
        var elevens = 0;
        var twelves = 0;

        while (i < 1000) {
            i++;
            int d1 = Dice.rollDice();
            int d2 = Dice.rollDice();
            int sum = d1 + d2;
            System.out.println("Round: " + i + ", Die 1: " + d1 + ", Die 2:" + d2 + ", Sum: " + sum);

            switch (sum){
                case 2:
                twos += 1;
                break;
                case 3:
                threes += 1;
                break;
                case 4:
                fours += 1;
                break;
                case 5:
                fives += 1;
                break;
                case 6:
                sixes += 1;
                break;
                case 7:
                sevens += 1;
                break;
                case 8:
                eights += 1;
                break;
                case 9:
                nines += 1;
                break;
                case 10:
                tens += 1;
                break;
                case 11:
                elevens += 1;
                break;
                case 12:
                twelves += 1;
                break;
            }
        }
        System.out.println(twos);
        System.out.println(threes);
        System.out.println(fours);
        System.out.println(fives);
        System.out.println(sixes);
        System.out.println(sevens);
        System.out.println(eights);
        System.out.println(nines);
        System.out.println(tens);
        System.out.println(elevens);
        System.out.println(twelves);
        System.out.println((twos + threes + fours + fives + sixes + sevens + eights + nines + tens + elevens + twelves));
    }

}