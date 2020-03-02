import java.util.Scanner;

/**
 * this is the interface class that handles the inputs and outputs of the program
 * @FaresElkhouli
 * @ZhiyuFeng
 */
imput java.io.*;
public class TuitionManager {
	/**
	 * To read the command from the file.
	 */
	Scanner scanner = new Scanner(System.in);
	String commandline = scanner.nextLine();
	/**
	 * find the command
	 */
	String[] parts = commandline.split(" ");
	newstudents = new Student[];
	fname = parts[1];
	lname = parts[2];
	credit = Integer.parseInt(parts[3]);
	
	public void addcommand() {
	/**
	 * If the command is Instate student
	 * check the fund.
	 */
	if (parts[0].equals("I")) {
		if(parts[4].equals("0")) {
			fund = 0;
		}
		else {
			fund = Integer.parseInt(parts[4]);
		}
		add(newstudents);
		return;
	}
	/**
	 * if the command is outstate student
	 * check the tristate
	 */
	if (parts[0].equals("O")) {
		if(parts[4].equals("T")) {
			tristate == true;
		}
		else
			tristate == false;
		add(newstudents);
		return;
	}
	/**
	 * if the command is a international student
	 * check the exchange
	 * check the credit is smaller than 9
	 */
	if (parts[0].equals("N")) {
		if(parts[4].equals("T")) {
			exchange == true;
		}
		else
			exchange == false;
		int creditinernational = Integer.parseInt(parts[3]);
		if(creditinternational < 9) {
			return null;
		}
		add(newstudents);
		return;
	}
	}
	
	public void remove() {
	/**
	 * if the command is remove the student.
	 */
	if (parts[0].equals("R")) {
		if (remove(newstudents) == false) {
			return null;
		}
	}
	}
	
	public void print() {
		/**
		 * the command is to print the whold chart out.
		 */
		if (parts[0].equals("P")) {
			System.out.print(super);
		}
	}
	public void terminate() {
		if (parts[0].equals("Q"))
		System.out.print("Program terminated");
	}
}
