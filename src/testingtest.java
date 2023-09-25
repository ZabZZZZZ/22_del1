        do{
            do {
            D1 = Dice.rollDice();
            D2 = Dice.rollDice();

            player1Points += (D1 + D2);

            System.out.println(System.lineSeparator() + name1 + " scores " + D1 + " and " + D2 + " and their total score is " + player1Points + ".");

            Var DiceTotal1 = D1 + D2;

            if (DiceTotal1 !=12) {
                break;
            }

            } while(!gameFinished);

            if (player1Points >= 40){
                break;
            }
            System.out.println("Press Enter to continue.");
            var ans1 = s.nextLine();

            do {
            D1 = Dice.rollDice();
            D2 = Dice.rollDice();

            player2Points += (D1 + D2);

            System.out.println(System.lineSeparator() + name2 + " scores " + D1 + " and " + D2 + " and their total score is " + player2Points + ".");

            var Dicetotal2 = D1 + D2;

            if (Dicetotal2 !=12) {
                break;
            }

        } while (!gameFinished);

            if (player2Points >= 40){
                break;
            }
            System.out.println("Press Enter to continue.");
            var ans2 = s.nextLine();

            if (player1Points >= 40 || player2Points >= 40)
            gameFinished = true;
        } while(!gameFinished);
