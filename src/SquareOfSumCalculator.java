/**
 * Created by jvdberg on 17/07/2014.
 */
public class SquareOfSumCalculator {


    int squareOfSum;

    public SquareOfSumCalculator(int naturalNumber) {
        calculateSquareOfSum(naturalNumber);
    }

    private void calculateSquareOfSum(int naturalNumber) {
        int sum = 0;
        for (int i = 1; i <= naturalNumber; i++) {
            sum = sum + i;
        }
        squareOfSum = (int) Math.pow(sum, 2);
    }

    public int getSquareOfSum() {
        return squareOfSum;
    }

}
