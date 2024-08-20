import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount in USD: ");
        float usd = scanner.nextFloat();
        System.out.print("Enter exchange rate: ");
        float rate = scanner.nextFloat();
        float result = usd * rate;
        System.out.printf("Result: %.2f%n", result);
        scanner.close();
    }
}
