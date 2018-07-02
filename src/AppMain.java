import java.util.ArrayList;

public class AppMain {
    private ArrayList<People> Users;
    //Lecture, Work
    private String Mode;

    public void AddUser(String name, String type){
        Users.add(new People(name, type));
    }

}
