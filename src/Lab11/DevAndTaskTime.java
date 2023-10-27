package Lab11;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Calendar;


// 1. Написать программу, выводящую фамилию разработчика, дату и время
//получения задания, а также дату и время сдачи задания. Для получения
//последней даты и времени использовать класс Date из пакета java.util.*
//(Объявление Dated=newDate() или метод System.currentTimeMillis()

// 2. Приложение, сравнивающее текущую дату и дату, введенную
//пользователем c текущим системным временем

// 4. Напишите пользовательский код, который формирует объекты Date и
//Calendar по следующим данным, вводимым пользователем:
//<Год><Месяц><Число>
//<Часы1><минуты>
public class DevAndTaskTime {

    public static void main(String[] args) {
        String surname = "Ульянова";
        System.out.println("Фамилия разработчика - " + surname);
        timeGetTask();
        timeDeliveryTask();

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = new Date(); // Returns the current date and time

        Scanner in = new Scanner(System.in);
        int year2 = 0, month2 = 0, day2 = 0, hour4 = 0, minutes4 = 0;

        boolean flag = false;

        while (flag == false){
            System.out.println("Введите год (от 1901):");
            year2 = in.nextInt();
            System.out.println("Введите месяц:");
            month2 = in.nextInt();
            System.out.println("Введите число:");
            day2 = in.nextInt();
            System.out.println("Введите час:");
            hour4 = in.nextInt();
            System.out.println("Введите минуты:");
            hour4 = in.nextInt();
            if ((year2 > 1900) && (month2 > 0) && (month2 < 13) && (day2 > 0) && (day2 < 32) && (hour4 >= 0) && (hour4 < 24) && (minutes4 >= 0) && (minutes4 < 61)){
                flag = true;
            }
        }

        Date date2 = new Date(year2 - 1900, month2 - 1, day2);

        String formatted1 = formatter.format(date1);
        String formatted2 = formatter.format(date2);

        if(formatted1.equals(formatted2))
            System.out.println("Это одинаковые даты.");
        else if(date1.after(date2))
            System.out.println(String.format("%s наступил после %s", formatted1, formatted2));
        else if(date1.before(date2))
            System.out.println(String.format("%s наступил раньше %s", formatted1, formatted2));

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year2);
        cal.set(Calendar.MONTH, month2);
        cal.set(Calendar.DATE, day2);
        cal.set(Calendar.HOUR_OF_DAY,hour4);
        cal.set(Calendar.MINUTE,minutes4);
        cal.set(Calendar.SECOND,8);
        cal.set(Calendar.MILLISECOND,9);

        Date d = cal.getTime();

        System.out.println(d);
    }

    static Date timeGetTask() {
        Date getTaskTime = new Date();
        getTaskTime.getDate();
        System.out.println("Дата и время получения задания: " + getTaskTime);
        return getTaskTime;
    }
    static Date timeDeliveryTask() {
        Date getDeliveryTaskTime = new Date();
        Long time = getDeliveryTaskTime.getTime();
        time = time + (60 * 60 * 24 * 1000 * 4); // 4 дня от сегодня
        getDeliveryTaskTime = new Date(time);
        System.out.println("Дата и время сдачи задания: " + getDeliveryTaskTime);
        return getDeliveryTaskTime;
    }
}

