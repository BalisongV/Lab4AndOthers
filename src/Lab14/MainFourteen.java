package Lab14;
import java.util.Scanner;
import java.util.regex.*;
public class MainFourteen {
    public static void main(String[] args) {
        // 2. Написать регулярное выражение, определяющее является ли данная
        //строка строкой "abcdefghijklmnopqrstuv18340" или нет

        String str, password;
        Pattern p1 = Pattern.compile("abcdefghijklmnopqrstuv18340");

        Scanner in = new Scanner(System.in);

        System.out.println("Введите строку: ");
        str = in.next();


        Matcher m1 = p1.matcher(str);
        boolean b = m1.matches();

        if (b){
            System.out.println("Является abcdefghijklmnopqrstuv18340");
        }
        else{
            System.out.println("Не является abcdefghijklmnopqrstuv18340");
        }

        //5. Написать регулярное выражение, определяющее является ли данная
        //строчка датой в формате dd/mm/yyyy. Начиная с 1900 года до 9999 года.
        // да
        System.out.println(checkString("29/02/2000"));
        System.out.println(checkString("30/04/2003"));
        System.out.println(checkString("01/01/2003"));
        // нет
        System.out.println(checkString("29/02/2001")); // не високосный
        System.out.println(checkString("30-04-2003"));
        System.out.println(checkString("1/1/1899"));

        // 7. Проверить, надежно ли составлен пароль. Пароль считается
        //надежным, если он состоит из 8 или более символов. Где символом может быть
        //цифр, английская буква, и знак подчеркивания. Пароль должен содержать хотя
        //бы одну заглавную букву, одну маленькую букву и одну цифру

        System.out.println("Введите пароль: ");
        password = in.next();
        isStrong(password);
        isStrong("F032_Password");
        isStrong("TrySpy1");
        isStrong("smart_pass");
        isStrong("A007");

    }

    private static final Pattern DATE_PATTERN = Pattern.compile(
            "^(0[1-9]|[12]\\d|3[01])/([0][1-9]|1[0-2])/((?:1[6-9]|[2-9]\\d)\\d{2})$"
    );

    private static boolean checkString(final String dateAsString) {
        Matcher m = DATE_PATTERN.matcher(dateAsString);
        boolean result = m.matches();
        if (result) {
            int day = Integer.parseInt(m.group(1));
            int month = Integer.parseInt(m.group(2));
            int year = Integer.parseInt(m.group(3));
            if ((day > 28) && (month == 2)) {
                if (year % 4 == 0){
                    return true;
                }
                else {
                    return false;
                }

            }
        }
        return result;
    }

    private static boolean isStrong(String p){
        int p_length = p.length();
        int cnt_letters = 0, cnt_digits = 0, cnt_ = 0;
        int capital = 0, lowercase = 0;
        boolean flag = p.matches("\\w+");
        if (p_length < 8){
            System.out.println("Слишком короткий пароль");
            return false;
        }
        if (flag == false){
            System.out.println("Неверные символы");
            return false;
        }
        else{
            for (int i = 0; i < p_length; i++) {
                char x = p.charAt(i);
                if (Character.isLetter(x)) {
                    cnt_letters++;
                    if (Character.isUpperCase(x)) {
                        capital++;
                    } else {
                        lowercase++;
                    }
                }
                if (Character.isDigit(x)) {
                    cnt_digits++;
                }
                if (x == '_') {
                    cnt_++;
                }
            }
            if (((cnt_ + cnt_digits + cnt_letters) == p_length) && (capital > 0) && (lowercase > 0) && (cnt_digits > 0)){
                System.out.println("Хороший пароль");
                return true;
            }
            else{
                System.out.println("Чего-то не хватает");
                return false;
            }
        }
    }
}


