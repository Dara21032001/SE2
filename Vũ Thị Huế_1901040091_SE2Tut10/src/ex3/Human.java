package ex3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Human {
    private String firstName;
    private String lastName;

    public Human(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName
        );
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws IllegalArgumentException{
        Pattern pattern = Pattern.compile("[A-Z][a-z]*");
        Matcher matcher = pattern.matcher(firstName);
       if(!matcher.matches()){
           throw new IllegalArgumentException("Expected upper case letter!Argument: firstName");
       }
       else if(firstName.length() < 4){
           throw new IllegalArgumentException("Expected length at least 4 symbols!Argument: firstName" );
       }
       else
           this.firstName = firstName;

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws IllegalArgumentException{
       if(lastName.length() < 3){
           throw new IllegalArgumentException("\"Expected length at least 3\n" +
                   "symbols!Argument: lastName\"");
       }
       else
           this.lastName = lastName;
    }
}
