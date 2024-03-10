public class Player {
    public final static char RHAND = 'R';
    public final static char LHAND = 'L';
    
    String name;
    String address;
    String phoneNumber;
    char bats;
    char throwingArm;
    int yearInOrganization;
    
    // Constructor initializes basic player information
    Player(String Name, String Address, String Phone, char Bats, char Throws, int Years){
        name = Name;
        address = Address;
        phoneNumber = Phone;
        bats = Bats;
        throwingArm = Throws;
        yearInOrganization = Years;
    }

    // Programmer defined toString method that outputs player record as string
    public String toString() {
        return(name + "\n\t" + address +"\n\t" + phoneNumber + "\n\tBats: " + bats + 
                "\tThrows: " + throwingArm + "\tYears Playing: " + yearInOrganization);
    }
    
    // Update method to increase player year in organization
    public void update() {
        yearInOrganization++;  //increment
    }
} 
