package tiltfactor;

import java.io.Serializable;
import java.io.StringWriter;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.HashMap;

import org.jsefa.Serializer;
import org.jsefa.csv.CsvIOFactory;
import org.jsefa.csv.annotation.CsvDataType;
import org.jsefa.csv.annotation.CsvField;

public class Writer implements Serializable {
	public String name;
	public Writer partner;
	public Date birthday;
	public HashMap<String, String> details;
	public String address;
	
	@SuppressWarnings("deprecation")
	public Writer() {
		name = "Sophie";
		partner = null;
		birthday = new Date(1998, 1, 5);
		details = new HashMap<String, String>();
		details.put("book", "The Mysterious Benedict Society");
		details.put("movie", "Spider-Man");
		address = "2892 Hinman";
	}
	
//	public Writer() {
//		details = new HashMap<String, String>();
//	}
	
	@CsvDataType() 
	public class WriterSerial {
		@CsvField(pos = 1)
		String name;
		
		@CsvField(pos = 2, format="dd.MM.yyyy")
		Date birthday;
	}
	
	public void writeMe() {
		Serializer serializer = CsvIOFactory.createFactory(WriterSerial.class).createSerializer();
		StringWriter stringWriter = new StringWriter();
		serializer.open(stringWriter);
		serializer.write(this);
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
