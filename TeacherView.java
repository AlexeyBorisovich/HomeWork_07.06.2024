import java.util.List;

public class TeacherView {
    public void displayTeacherDetails(Teacher teacher) {
        System.out.println(teacher);
    }

    public void displayTeacherList(List<Teacher> teachers) {
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }
}