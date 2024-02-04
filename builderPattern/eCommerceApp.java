package builderPattern;

public class eCommerceApp {

    public static void main(String[] args) {
        User user1 = new User.UserBuilder()
                .firstName("Isaiah")
                .lastName("Pangilinan")
                .email("isaiah.pangilinan@neu.edu.ph")
                .address("Bago Bantay, Quezon City")
                .phone("09612796712")
                .age(21)
                .build();

        User user2 = new User.UserBuilder()
                .lastName("Pangilinan")
                .firstName("Phil")
                .age(20)
                .address("Meycauayan, Bulacan")
                .email("isaiahphilpangilinan@gmail.com")
                .phone("09665508464")
                .build();

        System.out.println("ACCOUNT 1");
        System.out.println("First Name: " + user1.firstName + "\n"
                         + "Last Name: " + user1.lastName + "\n"
                         + "Email: " + user1.email + "\n"
                         + "Address: " + user1.address + "\n"
                         + "Phone: " + user1.phone + "\n"
                         + "Age: " + user1.age + "\n");
        System.out.println("ACCOUNT 2");
        System.out.println("First Name: " + user2.firstName + "\n"
                         + "Last Name: " + user2.lastName + "\n"
                         + "Email: " + user2.email + "\n"
                         + "Address: " + user2.address + "\n"
                         + "Phone: " + user2.phone + "\n"
                         + "Age: " + user2.age);
    }

}
