import java.util.Calendar;
import java.util.TimeZone;

public class MilliTime {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		System.out.println(1543111594888L - 1543110418327L);
		
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("PST"));
		long time = cal.getTimeInMillis();
		System.out.println(time - 1543113035593L);
	}
}
