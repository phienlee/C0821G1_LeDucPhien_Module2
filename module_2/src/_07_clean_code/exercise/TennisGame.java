package _07_clean_code.exercise;

public class TennisGame {
    public static String getScore(String playerFirstName, String playerSecondName, int mScoreFirst, int mScoreSecond) {
        String score = "";
        int tempScore = 0;
        if (mScoreFirst == mScoreSecond) {
            switch (mScoreFirst) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else if (mScoreFirst >= 4 || mScoreSecond >= 4) {
            int minusResult = mScoreFirst - mScoreSecond;
            if (minusResult == 1) {
                score = "Advantage player1";
            } else if (minusResult == -1) {
                score = "Advantage player2";
            } else if (minusResult >= 2) {
                score = "Win for player1";
            } else {
                score = "Win for player2";
            }
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = mScoreFirst;
                else {
                    score += "-";
                    tempScore = mScoreSecond;
                }
                switch (tempScore) {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }
}
