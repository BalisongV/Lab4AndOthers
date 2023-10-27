package Lab7;
// 7. Создать статический метод printMagazines(Printable[] printable) в
// классе Magazine, который выводит на консоль названия только журналов.
// 8. Создать статический метод printBooks(Printable[] printable) в классе
// Book, который выводит на консоль названия только книг.

public class MainSeven {
    public static void main(String[] args) {

        Book b1 = new Book("Колобок");
        Book b2 = new Book("Война и мир");
        Magazine m1 = new Magazine("Секреты огородника");
        Magazine m2 = new Magazine("Тинькофф");

        Printable[] printables = {b1, b2, m1, m2};
        for (Printable printable: printables){
            printable.print();
        }
    }
}

class Book implements Printable{
    String name;
    Book(String name){
        this.name = name;
    }
    public void print() {
        System.out.printf("Книга: %s\n", name);
    }
}
class Magazine implements Printable {
    private String name;
    String getName(){
        return name;
    }
    Magazine(String name){
        this.name = name;
    }
    public void print() {
        System.out.printf("Журнал: %s\n", name);
    }
}

