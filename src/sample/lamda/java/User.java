package sample.lamda.java;

/**
 * Created by mukesh on 7/12/2017.
 */
public class User {

    private String name;

    public User(String name){
        this.name = name;
    }
    public void create(Created created){
        created.onCreate(this);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
