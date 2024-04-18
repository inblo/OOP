//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Flow flow1 = new Flow(1, "501", "2", "Разработчик");
        Flow flow2 = new Flow(3, "503", "3", "Программист");
        Flow flow3 = new Flow(2, "502", "2", "Тестировщик");
        Flow flow4 = new Flow(4, "504", "4", "Аналитик");
        Stream stream = new Stream();
        stream.add(flow1);
        stream.add(flow2);
        stream.add(flow3);
        stream.add(flow4);
        Stream stream1 = new Stream();
        stream1.add(flow1);
        stream1.add(flow3);
        Stream stream2 = new Stream();
        stream2.add(flow2);
        stream2.add(flow4);
        Student student1 = new Student(1, "1", "1", "1");
        Student student2 = new Student(2, "2", "2", "2");
        Student student3 = new Student(3, "3", "3", "3");
        StudentGroup studentGroup1 = new StudentGroup();
        studentGroup1.add(student1);
        studentGroup1.add(student2);
        studentGroup1.add(student3);
        StudentGroupService service = new StudentGroupService(studentGroup1);
        for (Student student : studentGroup1) {
            System.out.println(student);
        }
        System.out.println();
        for (Student student : service.getSortedStudentGroup()) {
            System.out.println(student);
        }
        System.out.println();
        for (Student student : service.getSortedStudentGroupByFio()) {
            System.out.println(student);
        }
    }
}