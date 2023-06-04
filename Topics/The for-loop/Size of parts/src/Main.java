import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int end = scanner.nextInt();
        int accumulatorOf0 = 0;
        int accumulatorOf1 = 0;
        int accumulatorOfNeg1 = 0;
        for (int start = 1; start <= end; start++) {
            int inputValue = scanner.nextInt();
            if (inputValue == 0) {
                accumulatorOf0++;
            } else if (inputValue == 1) {
                accumulatorOf1++;
            } else if (inputValue == -1) {
                accumulatorOfNeg1++;
            }
        }
        System.out.println(accumulatorOf0 + " " + accumulatorOf1 + " " + accumulatorOfNeg1);
    }
}
