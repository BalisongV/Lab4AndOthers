package Lab9;
import java.util.Comparator;
import Lab9.MyVector;
import java.util.Arrays;
import Lab9.Student;

public class MainNine {
    public static void main(String[] args) {
        MyVector<Student> students = new MyVector<Student>();
        students.add(new Student("Василий Иванов", 2352));
        students.add(new Student("Никита Петров", 1234));
        students.add(new Student());
        students.add(new Student("Алёна Рыбова", 6111));
        students.add(new Student("Ольга Кузнецова", 1371));

        System.out.println("Неотсортированные студенты:");
        System.out.println(Arrays.asList(students));

        int[] iDNumber = new int[5];
        for(int i = 0; i < 5; i++){
            iDNumber[i] = students.get(i).getId_num();
        }

        insertionSort(iDNumber);

        System.out.print("Sorted iDNumber array: ");
        System.out.println(Arrays.toString(iDNumber));

        // A Comparator is a FunctionalInterface that has a single abstract method compare.
        // The Comparator is a comparison function in Java that imposes a total ordering on
        // a collection of objects. The comparing is a static method in it.

        //Arrays.sort(students, Comparator.comparing(Student::getId_num));

        students.sort(new StudentIdComparator());
        System.out.println("Отсортированные студенты:");
        System.out.println(Arrays.asList(students));
    }
    public static void insertionSort(int[] sortArr) {
        int j;
        for (int i = 1; i < sortArr.length; i++) {
            int swap = sortArr[i];
            for (j = i; j > 0 && swap < sortArr[j - 1]; j--) {
                sortArr[j] = sortArr[j - 1];
            }
            sortArr[j] = swap;
        }
    }
}

