package to_do.strategy.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Concrete strategy. Implements PayPal payment method.
 */
public class PayByPayPal implements PayStrategy {
    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;

    static {
    	//TO-DO: 'put' some test data (password & email) to DATA_BASE
      DATA_BASE.put("hue2103","vuthihue2103");
      DATA_BASE.put("ngongu","adfsfd@gmail.com");
    }

    //TO-DO: Implement the collectPaymentDetails() method
    /**
     * Collect customer's data.
     */
    @Override
    public void collectPaymentDetails() {
       //TO-DO: Add 'try-catch' block to catch the IO error
                try {
                    while (!signedIn) {
                        //TO-DO: Ask for email & password then save them to suitable variables
                         System.out.println("Enter email");
                        email = READER.readLine();
                        System.out.println("Enter password");
                        password = READER.readLine();
                        if (verify()) {
                            System.out.println("Data verification has been successful.");
                        } else {
                            System.out.println("Wrong email or password!");
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }


                 
            }


    //TO-DO: Verify the input values then display suitable message
    private boolean verify() {
        setSignedIn(email.equals(DATA_BASE.get(password)));
        return signedIn;
    }

    //TO-DO: Implement the pay() method
    /**
     * Save customer data for future shopping attempts.
     */
    @Override
    public boolean pay(int paymentAmount) {
    	/*if customer already 'signedIn' => display a message 
    	to show that customer is paying with PayPal with money amount
    	then return true else return false */
        if (signedIn) {
            System.out.println("Paying " + paymentAmount + " using PayPal.");
            return true;
        } else {
            return false;
        }
    }

    private void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
}