package Lab10;
import java.util.Comparator;
public class Student{
    String name, last_name, specialization, group;
    int year, final_score;

    public Student(String name, String last_name, String specialization, String group, int year, int final_score) {
        this.name = name;
        this.last_name = last_name;
        this.specialization = specialization;
        this.group = group;
        this.year = year;
        this.final_score = final_score;
    }

    public Student() {
        this.name = "Аноним";
        this.last_name = "Неизвестно";
        this.specialization = "Не указано";
        this.group = "ОООО-00-00";
        this.year = 0;
        this.final_score = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getFinal_score() {
        return final_score;
    }

    public void setFinal_score(int final_score) {
        this.final_score = final_score;
    }

    @Override
    public String toString() {
        return  name + " " + last_name + " " + specialization + " " + year + " " + group + " " + final_score;
    }

    @Override public boolean equals(Object other) {
        if (!(other instanceof Student)) {
            return false;
        }
        Student otherStudent = (Student) other;
        return name == otherStudent.name && last_name == otherStudent.last_name &&  specialization == otherStudent.specialization && group == otherStudent.group && year == otherStudent.year && final_score == otherStudent.final_score;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    /*
    @Override
    public int compareTo(Student other) {
        Student te = (Student) other;
        if (te == null)
            return 1;
        return this.getName().compareTo(te.getName());
    }
    */
   /*
    @Override public int compareTo(Student other) {

        return year == other.year ? 0 : 1;
    }*/

}
