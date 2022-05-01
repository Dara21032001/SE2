package to_do.strategy.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Concrete strategy. Implements credit card payment method.
 */
public class PayByCreditCard implements PayStrategy {
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;

    /**
     * Collect credit card data.
     */
    @Override
    public void collectPaymentDetails() {
    	//TO-DO: Add 'try-catch' block to catch the IO error
    	
    	//TO-DO: Ask for card number, expiration date, CVV code then save them to suitable variables
        
    	//TO-DO: Create new CreditCard instance with given information

        //TO-DO: Validate credit card number...

    try {

        System.out.print("Enter the card number: ");
        String number = READER.readLine();
        System.out.print("Enter the card expiration date 'mm/yy': ");
        String date = READER.readLine();
        System.out.print("Enter the CVV code: ");
        String cvv = READER.readLine();
        card = new CreditCard(number, date, cvv);
    }
    catch (Exception e){
        e.printStackTrace();
    }
    }

    //TO-DO: Implement the pay() method
    /**
     * After card validation we can charge customer's credit card.
     */
    @Override
    public boolean pay(int paymentAmount) {
    	/*if 'cardIsPresent' => display a message 
    	to show that customer is paying with Credit Card with money amount
    	then reduce the card amount with that number
    	finally return true else return false */
        if (cardIsPresent()) {
            System.out.println("Paying " + paymentAmount + "using card");
            card.setAmount(card.getAmount()-paymentAmount);
            return true;
        } else {
            return false;
        }
    }

    private boolean cardIsPresent() {
        return card != null;
    }
}
