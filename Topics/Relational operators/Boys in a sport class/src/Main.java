import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum1 = scanner.nextInt();
        int inputNum2 = scanner.nextInt();
        int inputNum3 = scanner.nextInt();
        boolean bool = inputNum1 >= inputNum2 && inputNum2 >= inputNum3 ||
                inputNum2 >= inputNum1 && inputNum3 >= inputNum2;
        System.out.print(bool);
    }
}
