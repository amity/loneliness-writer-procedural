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
		String name = "Sophie";
		String partner = null;
		Date birthday = new Date(1998, 1, 5);
		details = new HashMap<String, String>();
		details.put("athletics", "swimming on my team");
		details.put("games", "playing with Legos");
		details.put("interest", "taking guitar lessons");
		details.put("dislike-food", "calliflower");
		details.put("favorite-food", "spaghetti");
		details.put("favorite-dessert", "ice cream");
		details.put("favorite-book", "Harry Potter and the Prisener of Azkaban");
		details.put("favorite-movie", "the Harry Potter movie Goblet of Fire");
		details.put("misc-1",
				"My favorite basketball player is Kyrie Irving! He's on the Boston Celtics and I really like them.");
		details.put("misc-2", "I like to rollerblade and scooter! It's a lot of fun.");
		details.put("misc-3", "I really like amusement parks. I went to Six Flags one time, and it was very fun.");
		details.put("future-goals",
				"want to be a scientist because I like science class, or a professional basketball player like LeBron James");
		details.put("favorite-color", "blue");
		details.put("halloween-costume", "batman");
		details.put("favorite-animal", "tigers");
		details.put("fave-class", "science");
		details.put("dislike-class", "math");
		address = "2892 Hinman";
		Writer myWriter = new Writer();

		for (int i = 0; i < 10; i++) {
			System.out.println(myWriter.generateSentence());
		}
	}
}
