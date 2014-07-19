/**
 * Created by jvdberg on 17/07/2014.
 */
public class Main {
    public static void main(String[] args) {
        int naturalNumber = 100;
        int sumOfSquares;
        int squareOfSum;

        SumOfSquareCalculator sumOfSquareCalculator = new SumOfSquareCalculator(naturalNumber);
        SquareOfSumCalculator squareOfSumCalculator = new SquareOfSumCalculator(naturalNumber);

        sumOfSquares = sumOfSquareCalculator.getSumOfSquares();
        squareOfSum = squareOfSumCalculator.getSquareOfSum();

        System.out.println("The difference between the sum of squares and the squares of the sum of natural number " +
                naturalNumber + " is: " + squareOfSum + " - " + sumOfSquares + " = " + (squareOfSum - sumOfSquares));
    }
}
