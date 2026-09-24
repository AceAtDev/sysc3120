public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;


    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public BuddyInfo() {
        this("", "","");
    }


    public String getAddress() {
        return address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getName() {
        return name;
    }


    static void main() {
        BuddyInfo homer = new BuddyInfo("Homer",
                "1233 colonel by drive",
                "+1 123 123 1234");

        System.out.println("Hello " + homer.getName());
    }
}
