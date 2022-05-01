package to_dos.factory;

// Creating the Health class that extends Course abstract class 
class Health extends Course {
	// TO-DO: Implement getDuration() method: set a specific duration and print value
	public void getDuration() {
 	duration = 5;
		System.out.println("health duration time: " + duration);
	}

	// TO-DO: Implement getFeePerSemester() method: set a specific fee and print value
	public void getFeePerSemester() {
 	fee = 5000;
		System.out.println("health fee: " + fee);
	}
}// end of Health class.