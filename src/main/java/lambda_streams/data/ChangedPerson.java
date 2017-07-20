package lambda_streams.data;

/**
 * Created by CodeAcademy on 2017.07.20.
 */
public class ChangedPerson {
    int id;
    String name;
    String email;
    String gender;
    String ip;

    public ChangedPerson(int id, String name, String email, String gender, String ip) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.ip = ip;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "ChangedPerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", ip='" + ip + '\'' +
                '}';
    }
}
