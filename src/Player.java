public class Player {
    public final static char RHAND = 'R';
    public final static char LHAND = 'L';
    
    String firstName;
    String lastName;
    String address;
    String phoneNumber;
    char bats;
    char throwingArm;
    int number;
    // int yearInOrganization;
    
    // Constructor initializes basic player information
    Player(String FirstName, String LastName, String Address, String Phone, char Bats, char Throws, int Number){
        firstName = FirstName;
        lastName = LastName;
        address = Address;
        phoneNumber = Phone;
        bats = Bats;
        throwingArm = Throws;
        number = Number;
    }

    // Programmer defined toString method that outputs player record as string
    public String toString() {
        return(firstName + "\n\t" + number + "\n\t" + address +"\n\t" + phoneNumber + "\n\tBats: " + bats +
                "\tThrows: " + throwingArm);
    }

    public void update() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
    
} 
