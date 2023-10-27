package Lab6;
import Lab6.Movable;
import Lab6.MovablePoint;

public class MovableRectangle implements Lab6.Movable{
    private Lab6.MovablePoint topLeft;
    private Lab6.MovablePoint bottomRight;

    MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new Lab6.MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new Lab6.MovablePoint(x2, y2, xSpeed, ySpeed);
        System.out.println("Создан объект MovableRectangle");
    }

    public String toString() {
        return "MovableRectangle topLeft: " + this.topLeft.toString() + ", bottomRight: " + this.bottomRight.toString();
    }

    public void moveUp() {
        this.topLeft.moveUp();
        this.bottomRight.moveUp();
        System.out.println("MovableRectangle moves up");
    }

    public void moveDown() {
        this.topLeft.moveDown();
        this.bottomRight.moveDown();
        System.out.println("MovableRectangle moves down");
    }

    public void moveLeft() {
        this.topLeft.moveLeft();
        this.bottomRight.moveLeft();
        System.out.println("MovableRectangle moves left");
    }

    public void moveRight() {
        this.topLeft.moveRight();
        this.bottomRight.moveRight();
        System.out.println("MovableRectangle moves right");
    }
}
