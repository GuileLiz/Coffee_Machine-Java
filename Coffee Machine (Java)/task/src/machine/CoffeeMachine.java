package machine;
import java.util.Scanner;

public class CoffeeMachine {
    private static final int WATERPERCUP = 200;
    private static final int MILKPERCUP = 50;
    private static final int COFFEEBEANSPERCUP = 15;

    public static void main(String[] args) {
        //input value
        Scanner scanner = new Scanner(System.in);
        int quantityOfWater = 400;
        int quantityOfMilk = 540;
        int gramsOfCoffee = 120 ;
        int numOfCups = 9;
        int money = 550 ;

        System.out.println("The coffee machine has:");
        System.out.println(quantityOfWater + " ml of water");
        System.out.println(quantityOfMilk + " ml of milk");
        System.out.println(gramsOfCoffee + " g of coffee beans");
        System.out.println(numOfCups + "disposable cups");
        System.out.println("$" + money + "disposable cups");

        System.out.println();
        System.out.println("Write action (buy, fill, take):");
        String action = scanner.nextLine();

        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        int coffeeType = scanner.nextInt();

        /**Switch (action) {
            case buy:

        }

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
        } */
    }
}
