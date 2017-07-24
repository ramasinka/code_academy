package mysql.jdbc.data;

/**
 * Created by CodeAcademy on 2017.07.24.
 */
public class Company {
    int id;
    String name;
    String country;
    public Company(int id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public Company() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
