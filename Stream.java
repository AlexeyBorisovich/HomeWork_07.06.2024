import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {
    private List<StudentGroup> studyGroups;

    public Stream(List<StudentGroup> studyGroups) {
        this.studyGroups = studyGroups;
    }

    public List<StudentGroup> getStudyGroups() {
        return studyGroups;
    }

    public void setStudyGroups(List<StudentGroup> studyGroups) {
        this.studyGroups = studyGroups;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return studyGroups.iterator();
    }
}