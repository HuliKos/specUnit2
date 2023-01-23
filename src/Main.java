import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();

        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();

        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on the menu but we need to decide on pricing");

        Scanner input = new Scanner(System.in);

        System.out.println("We are deciding on the price for our standard cupcake. Here is the description:");
        cupcake.type();
        System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");
        String priceText = input.nextLine();
        double price = Double.parseDouble(priceText);
        cupcake.setPrice(price);

        System.out.println("We are deciding on the price for our standard cupcake. Here is the description:");
        redVelvet.type();
        System.out.println("How much would you like to charge for the red velvet? (Input a numerical number taken to 2 decimal places)");
        String priceTextRedVelvet = input.nextLine();
        double priceRedVelvet = Double.parseDouble(priceTextRedVelvet);
        redVelvet.setPrice(priceRedVelvet);

        System.out.println("We are deciding on the price for our standard cupcake. Here is the description:");
        chocolate.type();
        System.out.println("How much would you like to charge for the chocolate? (Input a numerical number taken to 2 decimal places)");
        String priceTextChocolate = input.next();
        double priceChocolate = Double.parseDouble(priceTextChocolate);
        chocolate.setPrice(priceChocolate);

        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);


        ArrayList<Drink> drinkMenu = new ArrayList<Drink>();

        Drink water = new Drink();
        Soda soda = new Soda();
        Milk milk = new Milk();

        System.out.println("How much would you like to charge for the water? (Input a numerical number taken to 2 decimal places)");
        String priceTextWater = input.next();
        double priceWater = Double.parseDouble(priceTextWater);
        water.setPrice(priceWater);

        System.out.println("How much would you like to charge for the soda? (Input a numerical number taken to 2 decimal places)");
        String priceTextSoda = input.next();
        double priceSoda = Double.parseDouble(priceTextSoda);
        soda.setPrice(priceSoda);

        System.out.println("How much would you like to charge for the milk? (Input a numerical number taken to 2 decimal places)");
        String priceTextMilk = input.next();
        double priceMilk = Double.parseDouble(priceTextMilk);
        milk.setPrice(priceMilk);

        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);

        new Order(cupcakeMenu,drinkMenu);

    }
}

class Cupcake{

    public double price;

    public double getPrice(){
        return price;
    }

    public void setPrice (double price) {
        this.price = price;
    }

    public void type (){
        System.out.println("A basic, generic cupcake, with vanilla frosting");
    }
}

class RedVelvet extends Cupcake {
    @Override
    public void type() {
        System.out.println("A red velvet based cupcake, with cream cheese frosting");
    }
}

class Chocolate extends Cupcake {
    @Override
    public void type() {
        System.out.println("A chocolate based cupcake, with chocolate frosting");
    }
}

class Drink {
    public double price;

    public double getPrice(){
        return price;
    };

    public void setPrice(double price){
        this.price = price;
    }

    public void type (){
        System.out.println("A bottle of water");
    }
}

class Soda extends Drink {
    @Override
    public void type() {
        System.out.println("A bottle of soda.");
    }
}

class Milk extends Drink {
    @Override
    public void type() {
        System.out.println("A bottle of milk.");
    }
}
