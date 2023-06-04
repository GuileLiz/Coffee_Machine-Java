import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int end = scanner.nextInt();
        int accumulatorOfD = 0;
        int accumulatorOfC = 0;
        int accumulatorOfB = 0;
        int accumulatorOfA = 0;
        for (int start = 0; start <= end; start++) {
            String str = scanner.nextLine();
            accumulatorOfD += "D".equals(str) ? 1 : 0;
            accumulatorOfC += "C".equals(str) ? 1 : 0;
            accumulatorOfB += "B".equals(str) ? 1 : 0;
            accumulatorOfA += "A".equals(str) ? 1 : 0;
        }
        System.out.print(accumulatorOfD + " " + accumulatorOfC + " " + accumulatorOfB + " " + accumulatorOfA);
    }
}
