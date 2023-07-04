import java.util.Scanner;

public class Cappuccino extends Coffee{

    public String choiceCaramel;
    boolean plusCaramel = false;
    public double extraCaramel = 0.5;

    public void addCaramel() {
        System.out.println("Do you want to add caramel?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("If yes, press 1, if not, press 0");
        choiceCaramel = scanner.nextLine();
        if(choiceCaramel.equals("1")) {
            price += extraCaramel;
            plusCaramel = true;
            System.out.println(price);
        } else if (choiceCaramel.equals("0")) {
            price += 0;
        } else {
            System.out.println("Invalid input. Please try again.");
            addCaramel();
        }
    }

    public void getBill(double baseCoffeePrice) {
        System.out.println("Coffee: " + baseCoffeePrice);
        String bill = "";
        if(plusMilk) {
            bill += "Extra milk added " + extraMilk + "\n";
        }
        if(plusSugar) {
            bill += "Extra sugar added " + extraSugar + "\n";
        }
        if(plusCaramel) {
            bill += "Extra caramel added " + extraCaramel + "\n";
        }
        bill += "Bill: " + (price + baseCoffeePrice) + "\n";
        System.out.println(bill);
    }

    protected double getBasePrice(){
        return 1.75;
    }

}
