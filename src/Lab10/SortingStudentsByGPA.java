package Lab10;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.Random;

public class SortingStudentsByGPA {
    public static void main(String[] args){

        Comparator<Student> gcomp = new StudentGPAComparator();
        Comparator<Student> ncomp = new StudentNameComparator();

        TreeSet<Student> iDNumber = new TreeSet<Student>(gcomp);
        TreeSet<Student> names = new TreeSet<Student>(ncomp);
        //TreeSet<Student> iDNumber = setArray(3, gcomp);

        iDNumber.add(new Student("Василий", "Иванов", "Электрик", "ЭМБО-02-21", 3, 69));
        iDNumber.add(new Student());
        iDNumber.add(new Student("Тамара", "Рыбова", "Журналист", "ЖКБО-01-23", 1, 87));

        names.add(new Student("Ольга", "Петрова", "Электрик", "ЭМБО-02-21", 3, 60));
        names.add(new Student("Фёдор", "Крючнов", "Журналист", "ЖКБО-01-23", 1, 77));
        names.add(new Student("Леонид", "Жилин", "Журналист", "ЖКБО-01-23", 1, 50));

        System.out.println("Отсортированные студенты iDNumber:");
        System.out.println(Arrays.asList(iDNumber));

        System.out.println("Отсортированные студенты names:");
        System.out.println(Arrays.asList(names));

        iDNumber.addAll(names);

        System.out.println("Соединённые:");
        System.out.println(Arrays.asList(iDNumber));
    }

    public static TreeSet<Student> setArray(int size, Comparator<Student> comp)
    {
        TreeSet<Student> students = new TreeSet<Student>(comp);

        for(int i=0; i<size; i++)
        {
            Random r = new Random();
            String n = String.valueOf((char)(r.nextInt(26) + 'a'));
            String ln = String.valueOf((char)(r.nextInt(26) + 'a'));
            String s = String.valueOf((char)(r.nextInt(26) + 'a'));
            String g = String.valueOf((char)(r.nextInt(26) + 'a'));
            int y = r.nextInt(5);
            int f = r.nextInt(101);
            students.add(new Student(n, ln, s, g, y, f));
        }

        return students;
    }
}

