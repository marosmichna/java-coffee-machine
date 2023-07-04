import java.util.Scanner;

public class Coffee implements Billable {
    public double price = 0;
    private String choiceMilk;
    private String choiceSugar;
    public Boolean plusMilk = false;
    public Boolean plusSugar = false;

    public double extraMilk = 0.5;
    public double extraSugar = 0.5;
    public Coffee() {
    }

    public void addMilk() {
        System.out.println("Do you want to add milk?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("If yes, press 1, if not, press 0");
        choiceMilk = scanner.nextLine();
        if(choiceMilk.equals("1")) {
            price += extraMilk;
            plusMilk = true;
        } else if (choiceMilk.equals("0")) {
            price += 0;
        } else {
            System.out.println("Invalid input. Please try again.");
            addMilk();
        }
    }

    public void addSugar() {
        System.out.println("Do you want to add sugar?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("If yes, press 1, if not, press 0");
        choiceSugar = scanner.nextLine();
        if(choiceSugar.equals("1")) {
            price += extraSugar;
            plusSugar = true;
        } else if (choiceSugar.equals("0")) {
            price += 0;
        } else {
            System.out.println("Invalid input. Please try again.");
            addSugar();
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
        price += getBasePrice();
        bill += "Bill: " + price + "\n";
        System.out.println(bill);
    }

    @Override
    public double getSum() {
        return price;
    }

    protected double getBasePrice(){
        return 0.75;
    }
}
