package service;

import model.Student;
import model.Teacher;
import model.Type;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> userList;

    public DataService(){
        this.userList = new ArrayList<>();
    }
    public void create(String firstName, String secondName,
                       String lastName, Type type) {
        int id = getFreeID(type);
        if (Type.STUDENT == type) {
            Student student = new Student(firstName, secondName, lastName, id);
            userList.add(student);
        }else if(Type.TEACHER == type){
            Teacher teacher = new Teacher(firstName, secondName, lastName, id);
            userList.add(teacher);
        }
    }
    private int getFreeID(Type type) {
        boolean itsStudent = Type.STUDENT == type;
        int lastID = 1;
        for (User user : userList) {
            if (user instanceof Teacher && !itsStudent) {
                lastID = ((Teacher) user).getTeacherID() + 1;
            }
            if (user instanceof Student && itsStudent) {
                lastID = ((Student) user).getStudentID() + 1;
            }
        }
        return lastID;
    }
    public List<User> getAllStudent(){
        List<User> resultlist = new ArrayList<>();
        for(User user : userList){
            if(user instanceof Student){
                resultlist.add(user);
            }
        }
        return resultlist;
    }
}
