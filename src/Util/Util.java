package Util;

import java.util.Scanner;

public class Util {
	static Scanner scanner = new Scanner(System.in);

	public static int getCommand() {
		// reads a command and returns it

		int cmd = scanner.nextInt();
		return cmd;
	}

}