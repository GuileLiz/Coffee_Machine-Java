package machine;
import java.util.Scanner;

public class CoffeeMachine {
    private static final int WATERPERCUP = 200;
    private static final int MILKPERCUP = 50;
    private static final int COFFEEBEANSPERCUP = 15;

    public static void main(String[] args) {
        //input value
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int quantityOfWater = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int quantityOfMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int gramsOfCoffee = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cupsOfCoffeeWant = scanner.nextInt();
        
        //determining the number of cups
        int cupsBaseOnWater = quantityOfWater/WATERPERCUP;
        int cupsBaseOnMilk = quantityOfMilk/MILKPERCUP;
        int cupsBaseOnCoffeeBeans = gramsOfCoffee/COFFEEBEANSPERCUP;
        int numbersOfCupsCanServe = Math.min(Math.min(cupsBaseOnWater,cupsBaseOnMilk),cupsBaseOnCoffeeBeans); 
        int excessNumbersOfCupsCanServe = numbersOfCupsCanServe - cupsOfCoffeeWant;

        //verifying if it can and how many can produce
        if (numbersOfCupsCanServe == cupsOfCoffeeWant) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (cupsOfCoffeeWant > numbersOfCupsCanServe) {
            System.out.println("No, I can make only "+ numbersOfCupsCanServe +" cup(s) of coffee");            
        } else if (numbersOfCupsCanServe > cupsOfCoffeeWant){
            System.out.println("Yes, I can make that amount of coffee (and even " 
                               + excessNumbersOfCupsCanServe 
                               + " more than that)");
        }
    }
}
