package Lab4;

public class MainAbstract {
    public static void main(String[] args){
        Chair ch =new Chair("Chair", "yellow", 1222.59, 4);
        System.out.println(ch.getLegs_num());

        Closet cl = new Closet("Closet", "brown", 44900, 200, 100, 50);
        System.out.println(cl.getSizeX3());

        Door dr = new Door("Door", "red", 2558, 200, 80);
        System.out.println(dr.getArea());

        dr.buy();

    }
}

abstract class Furniture{

    String name;
    String color;
    double price;

    public Furniture(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public Furniture() {
        this.name = "Nothing";
        this.color = "White";
        this.price = 0.0;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void buy(){
        System.out.println("Вы купили " + name + " за " + price + " рублей.");
    }
}

class Chair extends Furniture{
    private int legs_num;

    public Chair(String name, String color, double price, int legs_num) {
        super(name, color, price);
        this.legs_num = legs_num;
    }

    public int getLegs_num() {
        return legs_num;
    }

    public void setLegs_num(int legs_num) {
        this.legs_num = legs_num;
    }
}

class Closet extends Furniture{
    private int height;
    private int width;
    private int depth;

    public Closet(String name, String color, double price, int height, int width, int depth) {
        super(name, color, price);
        this.height = height;
        this.width = width;
        this.depth = depth;

    }

    public int getSizeX3(){
        return height * width * depth;
    }
}

class Door extends Furniture{
    private int height;
    private int width;

    public Door(String name, String color, double price, int height, int width) {
        super(name, color, price);
        this.height = height;
        this.width = width;

    }

    public int getArea(){
        return height * width;
    }
}