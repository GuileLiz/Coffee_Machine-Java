import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        switch (inputValue) {
            case 1:
                System.out.print("You have chosen a square");
                break;
            case 2:
                System.out.print("You have chosen a circle");
                break;
            case 3:
                System.out.print("You have chosen a triangle");
                break;
            case 4:
                System.out.print("You have chosen a rhombus");
                break;
            default:
                System.out.print("There is no such shape!");
                break;

        }
    }
}
