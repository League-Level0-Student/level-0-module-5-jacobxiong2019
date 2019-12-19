package _01_prime_or_not;

import javax.swing.JOptionPane;

public class primeOrNot {
public static void main(String[] args) {
		String s = JOptionPane.showInputDialog(null, "Type in any number");
		int num = Integer.parseInt(s);
		int count = 0;
		for(int i1 = 0; i1 < 0; i1++)
		for(int i = 2; i < num; i++)
		{
			if(num%i == 0) {
				count++;
			}
		}
		if(count == 0)
		{
			JOptionPane.showMessageDialog(null, "The number is prime!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "The number is not prime!");
		}
	}
}
