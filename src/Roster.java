
public class Roster {
    private Player [] teamRoster;  // variable of array of Players 
	
	// Constructor creates 7 Player references with appropriate constructors depending on
	// positions (Pitcher, FieldPosition, Minor League)
	Roster () {
		teamRoster = new Player[7];  // Creates a reference array of 7 players
		
		// Each team member is added to the array, though each one is a Player, they
		// each are created using their appropriate subclass
		teamRoster[0] = new Pitcher("Sam Green", "101 N. State St. Chicago, IL 60608", 
                                "317-555-0018", 'R', 'r', 5, 's');
		teamRoster[1] = new Pitcher("Allen Stanley", "1908 E. Polk St. Chicago, IL 60607", 
                                "317-555-9822", 'l', 'L', 1, 'r');
		teamRoster[2] = new FieldPosition("Robert Gilbert", "2208 E. Taylor St. Chicago, IL 60601", 
                                "317-555-2557", 'R', 'R', 4, "Shortstop");
		teamRoster[3] = new FieldPosition("John Stacey", "880 S. Main St. Peotone, IL 60612", 
                                "308-555-9948", 'R', 'L', 7, "Second Base");
		teamRoster[4] = new FieldPosition("William Anderson", "20114 Baughman Ct. South Bend, IN 46614", 
                                "317-555-0295", 'R', 'R', 2, "Astros");
		teamRoster[5] = new FieldPosition("Greg Fulright", "102 W. Gorham St. Madison WI, 53703", 
                                "209-555-2252", 'L', 'L', 1, "Outfield");
		teamRoster[6] = new FieldPosition("Guy Taylor", "12 W. Bueno St. Makebelieve, IN 46612", 
										"317-555-5422", 'R', 'R', 3, "Sox");
	}
	
	// teamUpdate method, updates each team member with the update method from their
	// creation class
	public void teamUpdate(){
		
		// Prints and updates each player in array
		for (int i = 0; i < 7; i++){
			System.out.println(this.teamRoster[i]); // Print Record
			this.teamRoster[i].update(); // Update Record
		}
		System.out.println("\n======================= PLAYERS UPDATED =======================\n\n");
	}
	
	// Prints each player record to screen
	public void printRecord(){ 
		
		// Enhanced for loop to print each Player member's record
		for (Player teamMember: this.teamRoster){
			System.out.println(teamMember + "\n");
		}	
	} 
}
