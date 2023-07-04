import java.util.Scanner;

public class UserChoice {
    private String userChoice;

    public void userCoffeeChoice() {
        System.out.println("Choice your coffee 1-normal, 2-cappuccino, 3-Latte macchiato");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of coffee: ");
        userChoice = scanner.nextLine();
        Billable bill = null;
        if(userChoice.equals("1")) {
            Coffee coffee = new Coffee();
            coffee.addMilk();
            coffee.addSugar();
            coffee.getBill();
            bill = coffee;
        } else if(userChoice.equals("2")) {
            Cappuccino cappuccino = new Cappuccino();
            cappuccino.addMilk();
            cappuccino.addSugar();
            cappuccino.addCaramel();
            cappuccino.getBill();
            bill = cappuccino;
        } else if (userChoice.equals("3")) {
            LatteMacchiato latteMacchiato = new LatteMacchiato();
            latteMacchiato.addMilk();
            latteMacchiato.addSugar();
            latteMacchiato.addCaramel();
            latteMacchiato.addChocolate();
            latteMacchiato.getBill();
            bill = latteMacchiato;
        } else {
            System.out.println("Invalid input. Please try again.");
            userCoffeeChoice();
        }
        YourPay yourPay = new YourPay();
        yourPay.yourPay();
        yourPay.fiveCentPay();
        yourPay.tenCentPay();
        yourPay.twentyCentPay();
        yourPay.fiftyCentPay();
        yourPay.oneEuroPay();
        yourPay.twoEuroPay();
        yourPay.yourAccount(bill);
        scanner.close();

    }

}
