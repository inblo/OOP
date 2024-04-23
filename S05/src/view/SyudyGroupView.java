package view;

import controller.StudyGroupController;
import model.Student;
import model.StudyGroup;
import model.Teacher;

import java.util.List;

public class SyudyGroupView {
    private StudyGroupController studyGroupController = new StudyGroupController();

    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        return studyGroupController.createStudyGroup(teacher, students);
    }

    public void addGroup(String teacherName, StudyGroup group) {
        studyGroupController.addGroup(teacherName, group);
        System.out.println("Добавлена учебная группа преподавателя " + teacherName);
    }

    public StudyGroup getGroupByTeacher(String teacherName) {
        System.out.println("Группа преподавателя " + teacherName + ":");
        return studyGroupController.getGroupByTeacher(teacherName);
    }
}
