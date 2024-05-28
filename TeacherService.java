import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private List<Teacher> teacherList;

    public TeacherService() {
        this.teacherList = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }

    public void updateTeacher(int teacherId, String firstName, String lastName) {
        for (Teacher teacher : teacherList) {
            if (teacher.getTeacherId() == teacherId) {
                teacher.setFirstName(firstName);
                teacher.setLastName(lastName);
                return;
            }
        }
    }

    public List<Teacher> getTeachers() {
        return teacherList;
    }
}