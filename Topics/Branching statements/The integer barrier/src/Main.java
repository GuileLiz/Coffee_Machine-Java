import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int accumulator = 0;

        while (true) {
            int inputVal = scanner.nextInt();
            accumulator += inputVal;
            if (inputVal == 0) {
                System.out.println(accumulator);
                break;
            } else if (accumulator >= 1000) {
                System.out.println(accumulator - 1000);
                break;
            }

        }
    }
}