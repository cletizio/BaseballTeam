public class Pitcher extends Player {
    final public String STARTER = "Starter"; 
	final public String RELIEVER = "Reliever";
	
	String role; // Pitcher Role: Starter or Reliever
	
	// Constructor calls Player constructor and adds role information
	Pitcher(String FirstName, String LastName, String Address, String Phone, char battingHand, char throwingHand, 
			int Number, char PitchType){
		
		super(FirstName, LastName, Address, Phone, battingHand, throwingHand, Number); // Fix: Remove PitchType parameter
		
		if (PitchType == 's' || PitchType == 'S')
			role = STARTER;
		else
			role = RELIEVER;
	}
	
	// Programmer provided toString method that calls parent class toString method
	// and adds role information as output.
	public String toString(){
		String result = super.toString();
		result += "\n\tPitcher: " + role;
		return result;
	}
	
	// Method asks user if role has changed; 
	// if so, it switches to the opposite role.
	public void update () {
		super.update();
		System.out.print("\nHas " + firstName + "'s role changed? (Y or N) ");
		
		// Take user input from main's Scanner, to check for change 'y' or 'Y'
		char change = Team.input.next().charAt(0);
		
		// If change in role, alter to opposite role 
		if ((change == 'y') || (change == 'Y')){
			if (role == STARTER) // if starter, make reliever
				role = RELIEVER;
			else
				role = STARTER; // else if reliever, make starter
		}
		System.out.println();
	}
}
