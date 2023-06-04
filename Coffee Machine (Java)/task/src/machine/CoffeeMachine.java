package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
        System.out.println("");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need:");
        int cupsOfCoffee = scanner.nextInt();
        System.out.println("For " + cupsOfCoffee + " cups of coffee you will need:");
        int water = cupsOfCoffee*200 ;
        int milk = cupsOfCoffee*50;
        int coffeeBeans = cupsOfCoffee*15;
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
    }
}
