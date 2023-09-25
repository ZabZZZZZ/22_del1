public class twosixers{

public static void checkForSixers() {

    boolean player1LastRound = false;
    boolean player2LastRound = false;
    int rounds = 0;
    int player1Roll1 = 0;
    int player1Roll2 = 0;
    int player2Roll1 = 0;
    int player2Roll2 = 0;

    while (true) { 
        rounds++;

        if (player1Roll1 = 6 && player1Roll2 = 6) {
            if (player1LastRound) {
            break;
        }
        player1LastRound = true;
    } else {
        player1LastRound = false;
    }

        if (player2Roll1 = 6 && player2Roll2 = 6) {
            if (player2LastRound) {
                break;
            }
            player2LastRound = true;

        } else {
            player1LastRound = false;
        }


    }

    }

}