import java.util.List;

public class TeacherController {
    private TeacherService teacherService;
    private TeacherView teacherView;

    public TeacherController(TeacherService teacherService, TeacherView teacherView) {
        this.teacherService = teacherService;
        this.teacherView = teacherView;
    }

    public void addTeacher(Teacher teacher) {
        teacherService.addTeacher(teacher);
    }

    public void updateTeacher(int teacherId, String firstName, String lastName) {
        teacherService.updateTeacher(teacherId, firstName, lastName);
    }

    public void displayTeachers() {
        List<Teacher> teachers = teacherService.getTeachers();
        teacherView.displayTeacherList(teachers);
    }

    public void displayTeacherDetails(Teacher teacher) {
        teacherView.displayTeacherDetails(teacher);
    }
}