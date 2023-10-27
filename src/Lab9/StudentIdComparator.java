package Lab9;

import java.util.Comparator;
import Lab9.Student;
public class StudentIdComparator implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        Integer s1Id=(Integer)s1.getId_num();
        Integer s2Id=(Integer)s2.getId_num();

        return s1Id.compareTo(s2Id);
    }

}
