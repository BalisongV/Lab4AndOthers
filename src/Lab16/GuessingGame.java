package Lab16;
import javax.swing.JOptionPane;
import java.util.Random;
public class GuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();

        // Generate random integers in range 0 to 20
        int answer = rand.nextInt(21);
        //int answer = 5;
        Integer.toString(answer);
        int try_cnt = 2;

        String your_input;
        your_input = JOptionPane.showInputDialog("Угадайте число от 1 до 20");

        while (try_cnt > 0){
            if (your_input.matches("-?\\d+(\\.\\d+)?") == false){
                JOptionPane.showMessageDialog(null, "Вы ввели не число и проиграли!");
                try_cnt = try_cnt - 2;
            }
            if (Integer.parseInt(your_input) == Integer.parseInt(String.valueOf(answer))){
                JOptionPane.showMessageDialog(null, "Вы угадали!");
                try_cnt = try_cnt - 2;
            }
            else{
                if (Integer.parseInt(your_input) < Integer.parseInt(String.valueOf(answer))){
                    your_input = JOptionPane.showInputDialog("Ваше число меньше, попытайтесь ещё раз");
                    try_cnt = try_cnt - 1;
                } else{
                    your_input = JOptionPane.showInputDialog("Ваше число больше, попытайтесь ещё раз");
                    try_cnt = try_cnt - 1;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Попытки кончились");
        System.exit(0);
    }
}

