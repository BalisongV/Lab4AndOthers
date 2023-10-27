package Lab6;

import Lab6.MovableRectangle;

public class six_lab {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(0,0, 5, -7, 2, 2);
        System.out.println(rectangle);
        rectangle.moveUp();
        rectangle.moveDown();
        rectangle.moveLeft();
        rectangle.moveRight();
        System.out.println(rectangle);
        rectangle.moveUp();
        rectangle.moveUp();
        rectangle.moveRight();
        System.out.println(rectangle);
    }
}
