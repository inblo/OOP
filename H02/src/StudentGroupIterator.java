import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student>{
    private List<Student> students;
    private int counter;

    public StudentGroupIterator(StudentGroup students) {
        this.students = students.getStudents();
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < students.size();
    }

    @Override
    public Student next() {
        if(hasNext())
            return students.get(counter++);
        return null;
    }

    @Override
    public void remove() {
        if(hasNext())
            students.remove(counter);
    }
}

