package controller;

import model.Student;
import model.Type;
import model.User;
import service.DataService;
import view.StudentView;

import java.util.List;

public class Controller {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();

    public void createStudent(String firstName, String secondName,
                              String lastName){
        service.create(firstName, secondName, lastName, Type.STUDENT);
    }
    public void getAllStudent(){
        List<User> userList = service.getAllStudent();
        for(User user : userList){
            studentView.printOnConsole((Student) user);
        }
    }
}
