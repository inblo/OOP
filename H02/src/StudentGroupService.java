import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupService {
    private StudentGroup students;

    public StudentGroupService(StudentGroup students) {
        this.students = students;
    }

    public StudentGroup getStudents() {
        return students;
    }
    public List<Student> getSortedStudentGroup(){
        List<Student> studentList = new ArrayList<>(students.getStudents());
        Collections.sort(studentList);
        return studentList;
    }
    public List<Student> getSortedStudentGroupByFio(){
        List<Student> studentList = new ArrayList<>(students.getStudents());
        studentList.sort(new StudentsComporator());
        return studentList;
    }
}

