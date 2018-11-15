package tiltfactor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public final class App {
	private App() {
	}

	public HashMap<String, Writer> writers;

	/**
	 * @param args The arguments of the program.
	 */

	public static void main(String[] args) {
		Writer myWriter = new Writer();
		for (int i = 0; i < 10; i++) {
			System.out.println(myWriter.generateSentence());
		}
	}
}
