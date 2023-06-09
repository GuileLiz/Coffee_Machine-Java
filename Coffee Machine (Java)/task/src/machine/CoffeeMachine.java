package machine;
import java.util.Scanner;

public class CoffeeMachine {
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
        System.out.println(numOfCups + " disposable cups");
        System.out.println("$" + money + " of money");

        System.out.println();
        System.out.println("Write action (buy, fill, take):");
        String action = scanner.nextLine();

        switch (action) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                int coffeeType = scanner.nextInt();
                switch (coffeeType) {
                    case 1:
                        quantityOfWater -= 250;
                        gramsOfCoffee -= 16;
                        numOfCups -= 1;
                        money += 4;
                        break;
                    case 2:
                        quantityOfWater -= 350;
                        quantityOfMilk -= 75;
                        gramsOfCoffee -= 20;
                        numOfCups -= 1;
                        money += 7;
                        break;
                    case 3:
                        quantityOfWater -= 200;
                        quantityOfMilk -= 100;
                        gramsOfCoffee -= 12;
                        numOfCups -= 1;
                        money += 6;
                        break;
                }
                break;
            case "fill":
                System.out.println("Write how many ml of water the coffee machine has:");
                quantityOfWater += scanner.nextInt();
                System.out.println("Write how many ml of milk the coffee machine has:");
                quantityOfMilk += scanner.nextInt();
                System.out.println("Write how many grams of coffee beans the coffee machine has:");
                gramsOfCoffee += scanner.nextInt();
                System.out.println("Write how many disposable cups you want to add:");
                numOfCups += scanner.nextInt();
                break;
            case "take":
                System.out.println("I gave you $" + money);
                money -= money;
                break;

        }
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(quantityOfWater + " ml of water");
        System.out.println(quantityOfMilk + " ml of milk");
        System.out.println(gramsOfCoffee + " g of coffee beans");
        System.out.println(numOfCups + " disposable cups");
        System.out.println("$" + money + " of money");
    }
}
