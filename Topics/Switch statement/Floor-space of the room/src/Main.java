import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();
        double side1;
        double side2;
        double side3;
        double area = 0;
        switch (shape) {
            case "triangle":
                side1 = scanner.nextInt();
                side2 = scanner.nextInt();
                side3 = scanner.nextInt();
                double semiPerimeter = (side1 + side2 + side3) / 2;
                area = Math.sqrt(semiPerimeter * (semiPerimeter - side1)
                        * (semiPerimeter - side2) * (semiPerimeter - side3));
                break;
            case "rectangle":
                side1 = scanner.nextInt();
                side2 = scanner.nextInt();
                area = side1 * side2;
                break;
            case "circle":
                side1 = scanner.nextInt();
                area = 3.14 * Math.pow(side1,2);
                break;
        }
        System.out.print(area);
    }
}
