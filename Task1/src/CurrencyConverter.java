import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Define exchange rates
        double inrToUsd = 0.013;
        double inrToEuro = 0.011;
        double inrToGBP = 0.0095;
        
        System.out.println("Welcome to Currency Converter!");
        System.out.println("Available currencies: ");
        System.out.println("1. INR (Indian Rupee)");
        System.out.println("2. USD (US Dollar)");
        System.out.println("3. EUR (Euro)");
        System.out.println("4. GBP (British Pound)");
        
        System.out.print("Enter the amount in INR: ");
        double amountINR = sc.nextDouble();
        
        System.out.print("Enter the target currency (e.g., USD, EUR, GBP): ");
        String targetCurrency = sc.next().toUpperCase();
        
        double convertedAmount = 0;
        switch(targetCurrency) {
            case "USD":
                convertedAmount = amountINR * inrToUsd;
                break;
            case "EUR":
                convertedAmount = amountINR * inrToEuro;
                break;
            case "GBP":
                convertedAmount = amountINR * inrToGBP;
                break;
            default:
                System.out.println("Invalid currency selected!");
                return;
        }
        
        System.out.println(amountINR + " INR is equivalent to " + convertedAmount + " " + targetCurrency);
        
        sc.close();
    }
}
