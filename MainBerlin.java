import java.util.Scanner;
public class MainBerlin {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String time_in = in.nextLine();
		//String ar_time[]=new String[3];
		String ar_time[] = time_in.split(":");
		/*for(int i=0;i<ar_time.length;i++)
		{
			System.out.println(ar_time[i]);
		}*/
		BerlinClock b= new BerlinClock();
		b.seconds(ar_time[2]);
		b.hours(ar_time[0]);
		b.minutes(ar_time[1]);
		in.close();
	}

}
