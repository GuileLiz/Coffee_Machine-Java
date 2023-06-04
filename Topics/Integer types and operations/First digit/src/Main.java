import java.util.Scanner;

class Main {
    private static final int TENTH_PLACE = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        System.out.print(inputNum / TENTH_PLACE);
    }
}