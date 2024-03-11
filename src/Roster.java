import java.util.Scanner;

public class Roster {
    private final Player[] teamRoster;  // variable of array of Players
    int numPlayers;

    Roster() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of players on the team: ");
        numPlayers = scanner.nextInt();
        scanner.nextLine(); // Consumes new line leftover

        teamRoster = new Player[numPlayers];  // Creates a reference array of 7 players

        // Each team member is added to the array, though each one is a Player, they
        // each are created using their appropriate subclass
        for (int i = 0; i < numPlayers; i++) {
            System.out.println("Enter player type (1 for Pitcher or 2 for Fielder)");
            int playerType = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter player first name: ");
            String firstName = scanner.nextLine();

            System.out.println("Enter player last name: ");
            String lastName = scanner.nextLine();

            System.out.println("Enter player address: ");
            String address = scanner.nextLine();

            System.out.println("Enter player phone number: ");
            String phone = scanner.nextLine();

            System.out.println("Enter player batting hand (Left/Right): ");
            char bats = scanner.nextLine().charAt(0);

            System.out.println("Enter player throwing hand (Left/Right): ");
            char throwHand = scanner.nextLine().charAt(0);


            System.out.println("Enter player number: ");
            int number = scanner.nextInt();
            scanner.nextLine();

            if (playerType == 1) {
                System.out.println("Enter pitcher type Starter/Reliever (S/R): ");
                char pitchType = scanner.nextLine().charAt(0);
                teamRoster[i] = new Pitcher(firstName, lastName, address, phone, bats,
                        throwHand, number, pitchType);
            } else if (playerType == 2) {
                System.out.println("Enter player position: ");
                String position = scanner.nextLine();
                teamRoster[i] = new FieldPosition(firstName, lastName, address, phone, bats, throwHand, number, position);
            } else {
                System.out.println("Invalid player type:");
                i--; //Decrement i to retry the loop.
            }
        }
        scanner.close();
    }

    // teamUpdate method, updates each team member with the update method from their
    // creation class
    public void teamUpdate() {

        // Prints and updates each player in array
        for (int i = 0; i < numPlayers; i++) {
            System.out.println(this.teamRoster[i]); // Print Record
            this.teamRoster[i].update(); // Update Record
        }
        System.out.println("\n======================= PLAYERS UPDATED =======================\n\n");
    }

    // Prints each player record to screen
    public void printRecord() {

        // Enhanced for loop to print each Player member's record
        for (Player teamMember : this.teamRoster) {
            System.out.println(teamMember + "\n");
        }
    }
}
