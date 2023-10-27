package Lab4;

public class Main4 {
    public static void main(String[] args){
        //1) Создать переменную, содержащую ваше любимое время года и
        //распечатать всю информацию о нем.

        Seasons s1 = Seasons.Winter;
        System.out.println("S1 value: " + s1);
        System.out.println("S1 ordinal: " + s1.ordinal());
        System.out.println("S1 name: " + s1.name());
        System.out.println("S1: " + whatIlove(s1));

        //6) В цикле распечатать все времена года, среднюю температуру и
        // описание времени года

        for(Seasons s: Seasons.values()){
            System.out.println(s + " mean temperature is " +s.getMean_temperature() + " " + s.getDescription());
            System.out.println("Value: " + s);
            System.out.println("Ordinal: " + s.ordinal());
            System.out.println("Name: " + s.name());
        }

    }
    public enum Seasons {
        Winter(-10.7),
        Spring(12.7),
        Summer(19.5),
        Fall(7.2);

        //3) Перечисление должно содержать переменную, содержащую среднюю
        //температуру в каждом времени года

        private final double mean_temperature;

        //4) Добавить конструктор, принимающий на вход среднюю температуру
        Seasons(double mean_temperature) {
            this.mean_temperature = mean_temperature;
        }
        private double getMean_temperature(){
            return mean_temperature;
        }

        //5) Создать метод getDescription, возвращающий строку “Холодное время
        // года”. Переопределить метод getDescription - для константы Лето
        // метод должен возвращать “Тёплое время года”.

        public String getDescription() {
            if (mean_temperature == Summer.mean_temperature){
                return "Тёплое время года";
            }else{
                return "Холодное время года";
            }
        }



    }

    //2) Создать метод, который принимает на вход переменную созданного
    //вами enum типа. Если значение равно Лето, выводим на консоль “Я
    //люблю лето” и так далее. Используем оператор switch.


    static public String whatIlove(Seasons s){
        switch (s){
            case Winter:
                return "Я люблю зиму";
            case Spring:
                return "Я люблю весну";
            case Summer:
                return "Я люблю лето";
            case Fall:
                return "Я люблю осень";
        }
        return null;
    }

}

