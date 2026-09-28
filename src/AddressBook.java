import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private final List<BuddyInfo> buddies = new ArrayList<>();

    public void addBuddy(BuddyInfo buddy) {
        buddies.add(buddy);
    }

    public boolean removeBuddy(BuddyInfo buddy) {
        return buddies.remove(buddy);
    }

    public static void main(String[] args) {
        AddressBook book = new AddressBook();
        System.out.println("Address book");

        BuddyInfo homer = new BuddyInfo(
                "Homer", "1233 Colonel By Drive", "+1 123 123 1234");

        BuddyInfo homer2 = new BuddyInfo(
                "Homer2", "1233 Colonel By Drive", "+1 123 123 1234");





        book.addBuddy(homer2);


        book.addBuddy(homer);
        book.removeBuddy(homer);

        newFunction();
    }

    public static void newFunction(){
        System.out.println("I'm a new function :)");
    }
}