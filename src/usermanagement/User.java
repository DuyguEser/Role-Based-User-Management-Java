package usermanagement;

public class User {
    private String yetki;
    private boolean isactive;

    public User(){
        yetki = "-1";
        isactive = false;
    }

    public void login(String kad, String sifre){
        if(kad.equals("Duygu") && sifre.equals("12345")){
            yetki = "User";
            isactive = true;
        }
        else if(kad.equals("admin") && sifre.equals("root")){
            yetki = "Admin";
            isactive = true;
        }
        else{
            yetki = "Giris basarisiz";
            isactive = false;
        }
    }

    public String getYetki() {
        return yetki;
    }

    public boolean getIsactive() {
        return isactive;
    }
}
