/**
 * Created by jvdberg on 17/07/2014.
 */
public class SumOfSquareCalculator {

    int sumOfSquares;

    private void calculateSumOfSquares(int naturalNumber) {
        for (int i = 1; i <= naturalNumber; i++)
        sumOfSquares = (int) (sumOfSquares + Math.pow(i, 2));
    }

    public int getSumOfSquares() {
        return sumOfSquares;
    }

    public SumOfSquareCalculator(int naturalNumber) {
        calculateSumOfSquares(naturalNumber);
    }
}
