package tiltfactor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Random;

public class Writer implements Serializable {
	public String name;
	public Writer partner;
	public Date birthday;
	public HashMap<String, String> details;
	public String address;
	public ArrayList<String> unusedDetails;

	@SuppressWarnings("deprecation")
	public Writer() {
		name = "Sophie";
		partner = null;
		birthday = new Date(1998, 1, 5);
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
		unusedDetails = new ArrayList<String>();
		unusedDetails.addAll(details.keySet());
	}

	public Writer(String newName) {
		details = new HashMap<String, String>();
		name = newName;
		partner = null;
		birthday = new Date(1998, 1, 5);
		details = new HashMap<String, String>();
		details.put("book", "The Mysterious Benedict Society");
		details.put("movie", "Spider-Man");
		address = "2892 Hinman";
		unusedDetails = new ArrayList<String>();
		unusedDetails.addAll(details.keySet());
	}

	public String generateSentence() {
		String sentence = "";
		String topic = unusedDetails.remove(new Random().nextInt(unusedDetails.size()));
		switch (topic) {
		case "favorite-book":
			sentence = String.format("My favorite book is %s . I like it so much I keep reading it!",
					details.get(topic));
			break;

		case "favorite-movie":
			sentence = String.format("My favorite movie is %s . It's a really cool movie.", details.get(topic));
			break;

		case "games":
			sentence = String.format("When I have free time, I like %s !", details.get(topic));
			break;

		case "athletics":
			sentence = String.format(
					"My mom always tells me it's really important to keep active. While I do like to just hang out sometimes, I also like %s !",
					details.get(topic));
			break;

		case "interest":
			sentence = String.format("One cool thing I've been doing recently is %s . I think it's super fun!",
					details.get(topic));
			break;

		case "dislike-food":
			sentence = String.format(
					"Are there any foods you dislike? I try not to be a picky eater, but I just can't stand %s !",
					details.get(topic));
			break;

		case "dislike-activity":
			sentence = String.format("I really don't like %s !", details.get(topic));
			break;

		case "favorite-food":
			sentence = String.format(
					"On my birthday, I always get to eat %s! I think it's my favorite food. Do you have a favorite food?",
					details.get(topic));
			break;

		case "favorite-dessert":
			sentence = String.format("My favorite dessert is %s ! Do you have a special dessert you like?",
					details.get(topic));
			break;

		case "misc-1":
			sentence = details.get(topic);
			break;

		case "misc-2":
			sentence = details.get(topic);
			break;
		case "misc-3":
			sentence = details.get(topic);
			break;
		case "future-goals":
			sentence = details.get(topic);
			break;
		case "favorite-color":
			sentence = String.format("What's your favorite color? My favorite color is %s !", details.get(topic));
			break;
		case "halloween-costume":
			sentence = String.format(
					"Did you do anything fun for Halloween? I dressed up as %s and went trick-or-treating!",
					details.get(topic));
			break;
		case "favorite-animal":
			sentence = String.format(
					"My favorite animals are %s ! I wish I had one as a pet. What's your favorite animal?",
					details.get(topic));
			break;
		case "dislike-class":
			sentence = String.format(
					"I really don't like %s class! I just can't stand it, it's so boring to me. Did you have any classes you disliked when you were in school?",
					details.get(topic));
			break;
		case "fave-class":
			sentence = String.format(
					"Did you have a favorite class in school? My favorite class is %s class. I think it's really interesting.",
					details.get(topic));
			break;
		}
		return sentence;
	}

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	public Writer getPartner() {
		return partner;
	}

	public void setPartner(Writer newPartner) {
		partner = newPartner;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(String newBirthday) {
		DateFormat df = DateFormat.getInstance();
		try {
			birthday = df.parse(newBirthday);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String newAddress) {
		address = newAddress;
	}

	public HashMap<String, String> getDetails() {
		return details;
	}

	public void setDetails(String key, String value) {
		details.put(key, value);
	}
}
