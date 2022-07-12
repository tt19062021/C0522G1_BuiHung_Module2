package SS08_CleanCodeAndRefactoring.Exercise.exercise1.model;

public class TennisGame {
    public static final int LOVE = 0;
    public static final int FIFTEEN = 1;
    public static final int THIRTY = 2;
    public static final int FORTY = 3;

    public static String getScore(int firstPlayerScore, int secondPlayerScore) {
        if (firstPlayerScore == secondPlayerScore) {
            return getFirstPoint(firstPlayerScore);
        } else if (firstPlayerScore >= 4 || secondPlayerScore >= 4) {
            return getMinusResult(firstPlayerScore, secondPlayerScore);
        } else {
            return getTempScore(firstPlayerScore, secondPlayerScore);
        }
    }

    public static String getFirstPoint(int firstPlayerScore) {
       return switch (firstPlayerScore) {
            case LOVE -> "Love-All";
            case FIFTEEN -> "Fifteen-All";
            case THIRTY -> "Thirty-All";
            case FORTY -> "Forty-All";
            default -> "Deuce";
        };
    }

    public static String getMinusResult(int firstPlayerScore, int secondPlayerScore) {
        int minusResult = firstPlayerScore - secondPlayerScore;

        if (minusResult == 1) {
            return "Advantage ";
        } if (minusResult == -1) {
            return "Advantage Second Player";
        } if (minusResult >= 2) {
            return "Win for First Player";
        }
            return "Win for Second Player";
    }

    public static String getTempScore(int firstPlayerScore, int secondPlayerScore) {
        int tempScore;

        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = firstPlayerScore;
            } else {
                tempScore = secondPlayerScore;
            }
            switch (tempScore) {
                case LOVE:
                    return "Love";
                case FIFTEEN:
                    return "Fifteen";
                case THIRTY:
                    return "Thirty";
                case FORTY:
                    return "Forty";
            }
        }
        return "error";
    }
}
