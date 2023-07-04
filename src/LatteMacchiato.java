import java.util.Scanner;

public class LatteMacchiato extends Cappuccino {

    public String choiceChocolate;
    public Boolean plusChocolate = false;
    public double extraChocolate = 0.5;

    public void addChocolate() {
        System.out.println("Do you want to add chocolate?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("If yes, press 1, if not, press 0");
        choiceChocolate = scanner.nextLine();
        if(choiceChocolate.equals("1")) {
            price += extraChocolate;
            plusChocolate = true;
        } else if (choiceChocolate.equals("0")) {
            price += 0;
        } else {
            System.out.println("Invalid input. Please try again.");
            addChocolate();
        }
    }

    public void getBill() {
        System.out.println("Coffee: " + getBasePrice());
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
        if(plusChocolate) {
            bill += "Extra caramel added " + extraChocolate + "\n";
        }
        price += getBasePrice();
        bill += "Bill: " + price + "\n";
        System.out.println(bill);
    }


    @Override
    protected double getBasePrice(){
        return 2.25;
    }

}
