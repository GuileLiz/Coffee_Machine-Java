import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String replaceString = input.replace('a', 'b');
        System.out.print(replaceString);
    }
}
