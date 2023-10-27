package Lab6;

import Lab6.Movable;

public class MovablePoint implements Lab6.Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        System.out.println("Cоздан объект MovablePoint");
    }

    public void moveUp() {
        this.y += this.ySpeed;
        System.out.println("MovablePoint moves up by " + this.ySpeed);
    }

    public void moveDown() {
        this.y -= this.ySpeed;
        System.out.println("MovablePoint moves down by " + this.ySpeed);
    }

    public void moveLeft() {
        this.x -= this.xSpeed;
        System.out.println("MovablePoint moves left by " + this.xSpeed);
    }

    public void moveRight() {
        this.x += this.xSpeed;
        System.out.println("MovablePoint moves right by " + this.xSpeed);
    }

    public String toString() {
        return "MovablePoint object - x: " + this.x + ", y: " + this.y + ", xSpeed: " + this.xSpeed + ", ySpeed: " + this.ySpeed;
    }

}

