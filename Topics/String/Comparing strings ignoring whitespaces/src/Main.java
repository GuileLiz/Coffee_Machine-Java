import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strInput1 = scanner.nextLine();
        String strInput2 = scanner.nextLine();
        String strReplace1 = strInput1.replace(" ", "");
        String strReplace2 = strInput2.replace(" ", "");
        boolean bool = strReplace1.equals(strReplace2);
        System.out.print(bool);
    }
}