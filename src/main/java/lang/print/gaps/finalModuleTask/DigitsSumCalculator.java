package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int firstDigit = number/1000;
        int secondDigit = (number%1000)/100;
        int thirdDigit = (number%100)/10;
        int fourthDigit = number%10;
        System.out.println(firstDigit+secondDigit+thirdDigit+fourthDigit);
    }
}
