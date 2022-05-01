package to_dos.singleton;

//Create the FIT_Test for testing purpose
public class FIT_Test {
	//TO-DO: Implement the main() method
	public static void main(String args[]) {
		//Create 2 new instances (objects) by calling getInstance() method
		FIT f1 = FIT.getInstance();
		FIT f2 = FIT.getInstance();

		//With 1st instance, display given text in upper case
		System.out.println(f1.toUpper());
		//With 2nd instance, display given text in lower case
		System.out.println(f2.toLower());
	}
}
