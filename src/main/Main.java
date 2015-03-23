package main;

import inputReader.InputReader;

import java.io.FileNotFoundException;

import methods.Actions;
import Util.Util;
import src.UI.UI;

public class Main {

	public static InputReader reader = new InputReader();
	public static Actions actions = new Actions();

	public static void main(String[] args) throws FileNotFoundException {
		int cmd;
		
		reader.readInput();// initialize the reader
		actions.Initialize();// initialize the actions class

		while (true) {
			UI.printMainMenu();
			cmd = Util.getCommand();
			actions.Execute(cmd);
			
		}
	}
}
