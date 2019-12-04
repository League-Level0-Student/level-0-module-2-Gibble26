package _06_lottery_numbers;
import java.util.Random;

import javax.swing.JOptionPane;



public class lotterynukbers {
public static void main(String[] args) {
	int one = 0;
	int two = 0;
	int three = 0;
	int four = 0;
	int five = 0;
	Random ran = new Random();
	one = ran.nextInt(10);
	two = ran.nextInt(10);
	three = ran.nextInt(10);
	four = ran.nextInt(10);
	five = ran.nextInt(10);
	JOptionPane.showMessageDialog(null, "These are your lottery numbers! \n " + one + " " + two  + " " + three + " " + four + " " + five );
}
}
