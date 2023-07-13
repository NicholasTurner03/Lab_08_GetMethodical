import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double price;
        double total = 0;
        boolean YN;
        do {
            price = SafeInput.getRangedDouble(in, "Please enter the price of your item ($0.50-$10.00)", .5, 10);
            YN = SafeInput.getYNConfirm(in, "Would you like to purchase another Item Y/N");
            total = total + price;
        } while (YN == true);

        System.out.printf("Your total is $%.2f.%n", total);
    }
}