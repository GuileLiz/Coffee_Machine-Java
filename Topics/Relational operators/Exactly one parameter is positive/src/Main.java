import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputNum1 = scanner.nextInt() > 0;
        boolean inputNum2 = scanner.nextInt() > 0;
        boolean inputNum3 = scanner.nextInt() > 0;
        boolean unqueness = inputNum1 ^ inputNum2 ^ inputNum3;
        // it will be always T if unique except when all is T (T^T^T) result will be T
        // To counter it we can verify if input is repeated, repeated it will be T, if not, F
        boolean allGreaterThanOne = inputNum1 && inputNum2 && inputNum3;
        // uniqueness and allGreaterThanOne are opposite if goal is true
        boolean bool = unqueness ^ allGreaterThanOne;
        System.out.println(bool);
    }
}
