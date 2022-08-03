package Exercises;

public class Author {

    private String name;
    private String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Exercises.Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
