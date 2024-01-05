import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class main {
    public static void main(String[] args) 
        throws IOException {

        System.out.println("Hi, I'm your first Java program! Stay tuned!");


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your amount in DKK: ");

        int amount = Integer.parseInt(reader.readLine());
        double amountInDollars = calcDKKtoUSD(amount);
        System.out.println("Your " + amount + " kr. is equal to: " + amountInDollars + " dollars." );
    }


    public static double calcDKKtoUSD(int DKK) {
        return DKK *0.15;
    }
}