package lt.spring.rest.example.entity.requests;

/**
 * Created by nevyt on 10/5/2017.
 */
public class AddUserRequest {

    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
