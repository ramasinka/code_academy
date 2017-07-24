package lambda_streams.data;

/**
 * Created by CodeAcademy on 2017.07.21.
 */
public class User {
    int id;
    String first_name;
    String email;
    String gender;
    String job_title;
    double bonus;
    int salary;

    public User() {
    }

    public User(int id, String first_name, String email, String gender, String job_title, double bonus, int salary) {
        this.id = id;
        this.first_name = first_name;
        this.email = email;
        this.gender = gender;
        this.job_title = job_title;
        this.bonus = bonus;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
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

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", job_title='" + job_title + '\'' +
                ", bonus=" + bonus +
                ", salary=" + salary +
                '}';
    }
}
