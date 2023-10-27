package Lab10;
import java.util.Comparator;

public class StudentGPAComparator implements Comparator<Student>{
    @Override
    public int compare(Student a, Student b){
        if (a.getFinal_score() > b.getFinal_score()){
            return -1;
        }
        else if (a.getFinal_score() < b.getFinal_score()){
            return 1;
        }
        return 0;
    }
}
