package Lab8;
// Задание от A до B
// Даны два целых числа A и В (каждое в отдельной строке). Выведите все
// числа от A до B включительно, в порядке возрастания, если A < B, или в порядке
// убывания в противном случае

public class MainEight {
    public static int recursion(int a, int b) {

        if (a < b) {
            recursion(a, b-1);
            System.out.println(b);
            return b;
        }
        if (a > b) {
            System.out.println(a);
            recursion(a-1, b);
            return a;
        }
        if (a == b){
            System.out.println(a);
            return a;
        }
        return a;
    }

    public static void main(String[] args) {
        recursion(2, 5);
    }
}
