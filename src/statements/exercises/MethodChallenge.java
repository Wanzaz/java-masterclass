public class MethodChallenge {

    public static void displayHighScorePosition(String playerName, int highScoreListPosition) {
        System.out.println(playerName + " managed to get into position " 
                           + highScoreListPosition + " on the high schore list");
    }

    public static int calculateHighScorePositon(int playerScore) {

        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }
    
    public static void main(String[] args) {
        String playerName = "Wanzaz";
        displayHighScorePosition(playerName, calculateHighScorePositon(1500));
        displayHighScorePosition(playerName, calculateHighScorePositon(1000));
        displayHighScorePosition(playerName, calculateHighScorePositon(500));
        displayHighScorePosition(playerName, calculateHighScorePositon(100));
        displayHighScorePosition(playerName, calculateHighScorePositon(25));
    }
}
