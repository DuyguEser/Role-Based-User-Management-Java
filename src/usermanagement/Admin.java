package usermanagement;

public class Admin extends User {

    public Admin(){
        super();
        System.out.println("Admin nesnesi olusturuldu");
    }

    @Override
    public void login(String kad, String sifre){
        super.login(kad, sifre);
    }
