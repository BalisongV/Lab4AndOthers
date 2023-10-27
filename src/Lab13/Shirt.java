package Lab13;
public class Shirt {
    String number, name, color, size;

    public Shirt() {
        this.number = "S000";
        this.name = "Unknown Shirt";
        this.color = "White";
        this.size = "S";
    }

    public Shirt(String number, String name, String color, String size) {
        this.number = number;
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "number = " + number +
                ", name = " + name +
                ", color = " + color +
                ", size = " + size +
                '}';
    }

    // Main is here
    public static void main(String[] args) {
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";

        Shirt[] myShirts = new Shirt[shirts.length];

        for (int i = 0; i < shirts.length; i++){
            String[] parts = shirts[i].split(",");
            myShirts[i] = new Shirt(parts[0], parts[1], parts[2], parts[3]);
        }
        for (Shirt s: myShirts){
            System.out.println(s.toString());
        }
    }
}
