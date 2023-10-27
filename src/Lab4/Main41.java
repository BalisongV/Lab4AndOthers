package Lab4;
public class Main41 {
    public static void main(String[] args){
        // 1
        Phone unknown = new Phone();
        Phone grisha = new Phone("89167771254", "Samsung", 0.8);
        Phone olya = new Phone("89162123587", "Honor", 1.2);

        // 2
        unknown.info();
        grisha.info();
        olya.info();

        // 6
        unknown.receiveCall("Аноним");
        grisha.receiveCall("Григорий");
        olya.receiveCall("Ольга");

        // 12
        unknown.receiveCall("Аноним", "89167771254");

        // 14
        unknown.sendMessage("3528532", "513641538", "223747214");
    }
}

class Phone{
    String number;
    String model;
    double weight;

    // 3 4
    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    // 11
    public void receiveCall(String name, String num){
        System.out.println("Звонит " + name + " с номера " + num);
    }

    // 13
    public void sendMessage(String ... receivers){
        for(String x : receivers){
            System.out.println("Сообщение отправляется к " + x);
        }
    }

    // 8
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    // 7
    public Phone(String number, String model, double weight) {
        // 10
        this(number, model);
        //this.number = number;
        //this.model = model;
        this.weight = weight;
    }

    // 9
    public Phone() {
        this.number = "00000000000";
        this.model = "None";
        this.weight = 0.0;
    }

    // 5
    public String getNumber() {
        return number;
    }

    public void info() {
        System.out.println(number + ", " + model + ", " + weight);
    }
}
