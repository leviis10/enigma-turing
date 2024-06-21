package StudyCase.Model;

import StudyCase.Utils.Level;

public class User {
    private String name;
    private Level status;

    public User(String name, Level status) {
        this.name = name;
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
