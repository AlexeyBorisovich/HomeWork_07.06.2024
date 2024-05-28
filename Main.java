import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Rabota so stydentamy
        Student student1 = new Student(4, "aab", "aab", "aab");
        Student student2 = new Student(2, "aaa", "aaa", "aaa");
        Student student3 = new Student(3, "Aaa", "Aaa", "Aaa");
        Student student4 = new Student(1, "bbb", "bbb", "bbb");

        System.out.println("Список студентов:");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println();

        StudentGroup group1 = new StudentGroup(new ArrayList<>(List.of(student1, student2)));
        StudentGroup group2 = new StudentGroup(new ArrayList<>(List.of(student3)));
        StudentGroup group3 = new StudentGroup(new ArrayList<>(List.of(student4)));

        Stream stream1 = new Stream(new ArrayList<>(List.of(group1, group2)));
        Stream stream2 = new Stream(new ArrayList<>(List.of(group3)));
        Stream stream3 = new Stream(new ArrayList<>(List.of(group1, group2, group3)));

        List<Stream> streams = new ArrayList<>(List.of(stream1, stream2, stream3));

        System.out.println("Оригинальный список потоков:");
        for (Stream stream : streams) {
            System.out.println("Stream with " + stream.getStudyGroups().size() + " groups");
        }
        System.out.println();

        StreamService streamService = new StreamService();
        streamService.sortStreams(streams);

        System.out.println("Отсортированный список потоков:");
        for (Stream stream : streams) {
            System.out.println("Stream with " + stream.getStudyGroups().size() + " groups");
        }
        System.out.println();
        // Rabota s uchitelymi
        TeacherService teacherService = new TeacherService();
        TeacherView teacherView = new TeacherView();
        TeacherController teacherController = new TeacherController(teacherService, teacherView);

        Teacher teacher1 = new Teacher(1, "Ivanov", "Andrey");
        Teacher teacher2 = new Teacher(2, "Petrov", "Alexandr");

        teacherController.addTeacher(teacher1);
        teacherController.addTeacher(teacher2);

        System.out.println();

        System.out.println("Список учителей:");
        teacherController.displayTeachers();

        teacherController.updateTeacher(1, "Ivanov", "AndreyUpdated");

        System.out.println();

        System.out.println("Обновленный список учителей:");
        teacherController.displayTeachers();
    }
}