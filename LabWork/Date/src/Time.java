import java.util.Date;

public class Time {

	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.printf("%s%n", date.toLocaleString());
		System.out.printf("%s", date.toGMTString());
	}

}
