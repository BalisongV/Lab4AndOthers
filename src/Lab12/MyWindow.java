package Lab12;

import java.awt.*;
import javax.swing.*;

// 2. Создать окно, отобразить в нем картинку, путь к которой указан в аргументах командной строки.

class MyWindow extends JFrame {
    int width = 600;
    int height = 600;
    String background_image_path;

    MyWindow() {
        super("Task 12");
        setSize(width, height);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    void set_background_image_path(String path) {
        this.background_image_path = path;
    }

    @Override
    public void paint(Graphics g2) {
        Graphics2D g = (Graphics2D) g2;
        Image img = Toolkit.getDefaultToolkit().getImage(this.background_image_path);
        g.drawImage(img, 0, 0, width, height, this);

    }

    //Открыть командную строку
    //cd C:\'Program Files'\Java\jdk-20\bin\
    // java C:\Users\Balisong\IdeaProjects\Lab4_and_others\src\Lab12\MainTwelve.java "C:\Users\Balisong\Pictures\my_icon.jpg"

    public static void main(String[] args) {
        MyWindow app = new MyWindow();
        if (args.length == 1) {
            app.set_background_image_path(args[0]);
        }
        else if (args.length > 1) {
            app.set_background_image_path(args[0]);
        }
        else {
            System.out.println("You didn't put an image path!");
        }
    }
}

