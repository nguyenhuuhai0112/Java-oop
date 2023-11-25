package TInhKeThua;

public class Person {
    private String _name;

    private int _age;

    private String _phone;

    private String _email;

    public String get_name() {
        return _name;
    }

    public int get_age() {
        return _age;
    }

    public String get_phone() {
        return _phone;
    }

    public String get_email() {
        return _email;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public void set_age(int _age) {
        if (_age < 16) {
            System.out.println("Tuoi nguoi khong hop le");
        }
        if (_age > 80) {
            System.out.println("tuoi nguoi qua lon");
        }
        this._age = _age;
    }

    public void set_phone(String _phone) {
        this._phone = _phone;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

}
