import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        boolean bool = inputNum > 0 && inputNum < 10;
        System.out.print(bool);
    }
}
