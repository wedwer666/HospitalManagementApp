package sample.Pacients;

public class storeContacts {

    String text;
    String name;
    String phone;
    String email;
    String address;

    public storeContacts(String name, String phone, String email, String address) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        text = name + ", " + phone + ", " + email + ", " + address;
    }
    @Override
    public String toString() {
        return text;
    }
}
