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
		details.put("book", "The Mysterious Benedict Society");
		details.put("movie", "Spider-Man");
		details.put("catch", "fish");
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
		case "book":
			sentence = String.format("My favorite book is %s . I like it so much I keep reading it!",
					details.get(topic));

		case "movie":
			sentence = String.format("My favorite movie is %s . It's a really cool movie.", details.get(topic));

		case "hobby":
			sentence = String.format("When I have free time, I like to %s !", details.get(topic));

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
