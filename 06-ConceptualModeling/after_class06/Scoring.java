public class Scoring {
    private int[] judgesScores = new int[5];

    public Scoring(int[] judgesScores) {
        this.judgesScores = judgesScores;
    }
     
    public void excludeMM() {
        int max,min;
        max = min = judgesScores[0];
        for (int i=0; i<judgesScores.length; i++) {
            if (judgesScores[i] > max) {
                max = i;
            } else if (judgesScores[i] < min) {
                min = i;
            }
        }
        judgesScores[max] = 0;
        judgesScores[min] = 0;
    }

    public double arithMean() {
        double sum = 0.0;
        for (int n : judgesScores) {
            sum +=n;
        }
        double avg = sum/(judgesScores.length-2);
        return avg;
    }
}
