public class FieldPosition extends Player{
String fieldingPosition;

	// Constructor calls Player constructor and adds fieldingPosition
	public FieldPosition(java.lang.String Name, java.lang.String Address, java.lang.String Phone, char Bats,
	char Throws, int Years, java.lang.String fieldingPosition) {		
		super(Name, Address, Phone, Bats, Throws, Years);
		this.fieldingPosition = fieldingPosition;
	}

	// Programmer provided toString method that calls parent class toString method
	// and adds position information as output.
	public String toString(){
		String result = super.toString();
		result += "\n\tField position: " + fieldingPosition;
		return result;
	}
	
	// Method updates the Player's year and asks user if position has changed; 
	// if so, it asks for the new position, taking it as input.
	public void update () {
		super.update();
		System.out.print("\nHas " + name + "'s position changed? (Y or N) ");
		
		// Take user input from main's Scanner, to check for change 'y' or 'Y'
		char change = Team.input.next().charAt(0);
		
		// If position changed, take user input for new position
		if ((change == 'y') || (change == 'Y')){
			System.out.print("\nEnter player's new position: ");
			Team.input.nextLine(); // Clear Buffer
			fieldingPosition = Team.input.nextLine();
		}
		System.out.println();
	}
}