package Lab9;

public class Student {
    String name;
    int id_num;

    public Student(String name, int id_num) {
        this.name = name;
        this.id_num = id_num;
    }

    public Student() {
        this.name = "Аноним";
        this.id_num = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId_num() {
        return id_num;
    }

    public void setId_num(int id_num) {
        this.id_num = id_num;
    }

    @Override
    public String toString() {
        return  name + " " + id_num;
    }
}

