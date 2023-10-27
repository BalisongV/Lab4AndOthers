package Lab5;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.util.Scanner;

// Создать окно, нарисовать в нем 20 случайных фигур, случайного цвета.
public class TwentyShapes extends JPanel {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int width = 400;
        int height = 400;
        boolean flag = false;

        while (flag == false){
            System.out.println("Введите ширину окна:");
            width = in.nextInt();
            System.out.println("Введите высоту окна:");
            height = in.nextInt();
            if ((width < 1001) && (height < 1001)){
                flag = true;
            }
        }

        JFrame f = new JFrame("20 shapes");
        // Задать размер окна с ограничениями;

        f.setSize(width, height);
        f.setResizable(false);
        f.add(new TwentyShapes());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void paint(Graphics g) {
        for (int i = 0; i < 20; i++) {
            int shape = (int) (Math.random() * 6);
            int x = (int) (Math.random() * 500);
            int y = (int) (Math.random() * 500);
            int width = (int) (Math.random() * 100);
            int heights = (int) (Math.random() * 100);
            int rgb = (int) (Math.random() * 0x1000000);

            switch (shape) {

                case 1:
                    g.setColor(new Color(rgb));
                    g.fillOval(x, y, width, heights);
                    break;

                case 2:
                    g.setColor(new Color(rgb));
                    g.fillRect(x, y, width, heights);
                    break;

                case 3:
                    g.setColor(new Color(rgb));
                    g.drawLine(x, y, width, heights);
                    break;


                case 4:
                    g.setColor(new Color(rgb));
                    g.drawArc(x, y, width, heights, 360, 360);
                    break;


                case 5:
                    g.setColor(new Color(rgb));
                    g.fillRoundRect(x, y, width, heights, 50, 50);
                    break;

                default:
                    break;
            }

        }

    }
}

