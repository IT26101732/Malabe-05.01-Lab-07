import java.util.Scanner;

public class IT26101732Lab7Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int customer = 1; customer <= 5; customer++) {

            System.out.println("Customer " + customer);

            System.out.print("Enter total bill amount: ");
            double bill = input.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char payment = input.next().charAt(0);

            if (payment == 'C' || payment == 'c') {

                double discount = bill * 0.05;
                double amountToPay = bill - discount;

                System.out.println("Discount is: " + discount);
                System.out.println("Amount to be paid: " + amountToPay);

            } else if (payment == 'O' || payment == 'o') {

                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + bill);

            } else {

                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println();
        }
    }
}