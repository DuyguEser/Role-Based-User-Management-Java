package usermanagement;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        user.login("Duygu", "12345");
        System.out.println(user.getYetki() + " - " + user.getIsactive());

        System.out.println("---------------");

        Admin admin = new Admin();
        admin.login("admin", "root");
        System.out.println(admin.getYetki() + " - " + admin.getIsactive());
    }
}
