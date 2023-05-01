public class main {

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        // Method in Java

        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);
        }
    }

    public static int calculateScore(int score, int levelCompleted, int bonus) {

        int finalScore = score;
        finalScore += (levelCompleted * bonus);

        return finalScore;
    }

    // Method Overloading
    // - method can have the same name but different nums of parameters and types
    //      - and it will be still unique method

    public static void main(String[] args) {

        // If-then-else Statement
        boolean gameOver = true;
        int score = 10_000;
        int levelCompleted = 8;
        int bonus = 200;

        if (score < 5000 && score > 1000) {
            System.out.println("Average");
        } else if (score < 1000) {
            System.out.println("Go home");
        } else {
            System.out.println("Good job");
        }

        calculateScore(gameOver, score, levelCompleted, bonus);
        calculateScore(true, 9000, 9, 500);
        int highScore = calculateScore(score, levelCompleted, bonus);
        System.out.println("Your final score was: " + highScore);
    }
}
