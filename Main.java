import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Sozdaem stydentov
        Student student1 = new Student(4, "aab", "aab", "aab");
        Student student2 = new Student(2, "aaa", "aaa", "aaa");
        Student student3 = new Student(3, "Aaa", "Aaa", "Aaa");
        Student student4 = new Student(1, "bbb", "bbb", "bbb");

        StudentGroup group1 = new StudentGroup(new ArrayList<>(List.of(student1, student2)));
        StudentGroup group2 = new StudentGroup(new ArrayList<>(List.of(student3)));
        StudentGroup group3 = new StudentGroup(new ArrayList<>(List.of(student4)));

        // Sozdaem potoki
        Stream stream1 = new Stream(new ArrayList<>(List.of(group1, group2)));
        Stream stream2 = new Stream(new ArrayList<>(List.of(group3)));
        Stream stream3 = new Stream(new ArrayList<>(List.of(group1, group2, group3)));

        List<Stream> streams = new ArrayList<>(List.of(stream1, stream2, stream3));

        // Pechat bez sortyrovki
        System.out.println("Original list of streams:");
        for (Stream stream : streams) {
            System.out.println("Stream with " + stream.getStudyGroups().size() + " groups");
        }
        System.out.println();

        // Sortirovka potokov
        StreamService streamService = new StreamService();
        streamService.sortStreams(streams);

        // Pechat otsortyrovannyh spiskov
        System.out.println("Sorted list of streams:");
        for (Stream stream : streams) {
            System.out.println("Stream with " + stream.getStudyGroups().size() + " groups");
        }
    }
}