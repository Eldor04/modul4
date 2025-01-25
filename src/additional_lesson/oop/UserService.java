package additional_lesson.oop;

import java.util.ArrayList;

public class UserService {
    private static ArrayList<User> users = new ArrayList<>();

    public boolean addUser(User user){
        return users.add(user);
    }

    public ArrayList<User> getUsers(){
        return users;
    }
    public void exam(User user,ExamService examService){
        int score = user.getScore();
    }

}
