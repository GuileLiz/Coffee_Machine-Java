import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputVal = scanner.nextInt();
        int result = ((inputVal + 1) * inputVal + 2) * inputVal + 3;
        System.out.print(result);
    }
}