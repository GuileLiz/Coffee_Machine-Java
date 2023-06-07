import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        switch (inputValue) {
            case 1:
                System.out.print("Yes!");
                break;
            case 2:
            case 3:
            case 4:
                System.out.print("No!");
                break;
            default:
                System.out.print("Unknown number");
                break;
        }
    }
}