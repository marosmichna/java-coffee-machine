import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class YourPay {

    public double allSumPay;
    public String fiveCent;
    public String tenCent;
    public String twentyCent;
    public String fiftyCent;
    public String oneEuro;
    public String twoEuro;

    public void yourPay() {
        System.out.println("Please insert coins");
    }

    public void fiveCentPay() {
        System.out.println("How many five cent coins do you want to insert?");
        Scanner scanner = new Scanner(System.in);
        fiveCent = scanner.nextLine();
        allSumPay += (Double.parseDouble(fiveCent) * 0.05);
    }

    public void tenCentPay() {
        System.out.println("How many ten cent coins do you want to insert?");
        Scanner scanner = new Scanner(System.in);
        tenCent = scanner.nextLine();
        allSumPay += (Double.parseDouble(tenCent) * 0.10);
    }

    public void twentyCentPay() {
        System.out.println("How many twenty cent coins do you want to insert?");
        Scanner scanner = new Scanner(System.in);
        twentyCent = scanner.nextLine();
        allSumPay += (Double.parseDouble(twentyCent) * 0.20);
    }

    public void fiftyCentPay() {
        System.out.println("How many fifty cent coins do you want to insert?");
        Scanner scanner = new Scanner(System.in);
        fiftyCent = scanner.nextLine();
        allSumPay += (Double.parseDouble(fiftyCent) * 0.50);
    }

    public void oneEuroPay() {
        System.out.println("How many one Euro coins do you want to insert?");
        Scanner scanner = new Scanner(System.in);
        oneEuro = scanner.nextLine();
        allSumPay += (Double.parseDouble(oneEuro) * 1.00);
    }

    public void twoEuroPay() {
        System.out.println("How many two Euro coins do you want to insert?");
        Scanner scanner = new Scanner(System.in);
        twoEuro = scanner.nextLine();
        allSumPay += (Double.parseDouble(twoEuro) * 2.00);
    }

    public void yourAccount(Billable bill) {
        double coffeeSum = bill.getSum();
        if(allSumPay < coffeeSum) {
            System.out.println("You put in a lack of money. Please repeat the option");
            UserChoice userChoice = new UserChoice();
            userChoice.userCoffeeChoice();
        } else {
            DecimalFormat df = new DecimalFormat("0.00");
            df.setRoundingMode(RoundingMode.HALF_UP);
            String yourExpenseNumber = df.format((allSumPay - coffeeSum));
            System.out.println("Your expense is: " + yourExpenseNumber);
            System.out.println("Thank you for your purchase");
            System.out.println("Have a nice day. Bye :-)");
        }
    }
}
