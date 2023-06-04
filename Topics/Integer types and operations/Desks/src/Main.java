import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum1 = scanner.nextInt();
        int inputNum2 = scanner.nextInt();
        int inputNum3 = scanner.nextInt();
        int result = inputNum1 / 2 + inputNum2 / 2 + inputNum3 / 2
                + inputNum1 % 2 + inputNum2 % 2 + inputNum3 % 2;
        System.out.print(result);
    }
}