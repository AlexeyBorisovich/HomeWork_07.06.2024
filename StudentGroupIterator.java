import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class StudentGroupIterator implements Iterator<Student> {
    private List<Student> studentList;
    private int counter;
    private boolean canRemove = false;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentList = studentGroup.getStudentList();
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < studentList.size();
    }

    @Override
    public Student next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        canRemove = true;
        return studentList.get(counter++);
    }

    @Override
    public void remove() {
        if (!canRemove) {
            throw new IllegalStateException("You can't call remove() before calling next() at least once.");
        }
        studentList.remove(--counter);
        canRemove = false;
    }
}