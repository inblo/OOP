public class Student implements Comparable<Student>{
    private Integer studentID;
    private String firstName;
    private String secondName;
    private String lastName;

    public Student(Integer studentID, String firstName, String secondName, String lastName) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(o.getStudentID() > studentID)
            return -1;
        else if(o.getStudentID() < studentID)
            return 1;
        else
            return 0;
        //return studentID.compareTo(o.getStudentID();
    }
}
