public class BowlingGame {
    private int rollsMany[] = new int[21];

    private int RowNow = 0;

    public void roll(int pins) {
        rollsMany[RowNow++] = pins;
    }

    public int score() {
        int score = 0;
        int frameIndex = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (strike(frameIndex)) {
                score += 10 + strikebonus(frameIndex);
                frameIndex++;
            } else if (spare(frameIndex)) {
                score += 10 + sparebonus(frameIndex);
                frameIndex += 2;
            } else {
                score += frameBalls(frameIndex);
                frameIndex += 2;
            }
        }
        return score;
    }

    private boolean strike(int frameIndex) {
        return rollsMany[frameIndex] == 10;
    }

    private int frameBalls(int frameIndex) {
        return rollsMany[frameIndex] + rollsMany[frameIndex+1];
    }

    private int sparebonus(int frameIndex) {
        return rollsMany[frameIndex+2];
    }

    private int strikebonus(int frameIndex) {
        return rollsMany[frameIndex+1] + rollsMany[frameIndex+2];
    }

    private boolean spare(int frameIndex) {
        return rollsMany[frameIndex]+rollsMany[frameIndex+1] == 10;
    }
}