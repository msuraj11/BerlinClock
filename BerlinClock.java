public class BerlinClock 
{
	
	public void seconds(String sec_string)
	{
		int sec=Integer.parseInt(sec_string);
		char sec_dis;
		if(sec%2==0)
		{
			sec_dis='R';
			System.out.println(sec_dis);
		}
		else
			sec_dis='Y';
			System.out.println(sec_dis);
	}
	public void hours(String hour_string)
	{
		int q;
		int r;
		int hour=Integer.parseInt(hour_string);
		q=hour/5;
		r=hour%5;
		char[] hour_dis_5 ={'0','0','0','0'};
		char[] hour_dis_1 ={'0','0','0','0'};
		
		for(int i=0;i<q;i++)
		{
			hour_dis_5[i]='R';
		}
			
		for(int i=0;i<hour_dis_5.length;i++)
			System.out.print(hour_dis_5[i]);
		
		System.out.println();
		
		
		for(int j=0;j<r;j++)
		{
			hour_dis_1[j]='R';
		}
		for(int j=0;j<hour_dis_1.length;j++)
			System.out.print(hour_dis_1[j]);
		
		System.out.println();
	}
	public void minutes(String min_string)
	{
		int q;
		int r;
		int mins=Integer.parseInt(min_string);
		q=mins/5;
		r=mins%5;
		char[] mins_dis_5 ={'0','0','0','0','0','0','0','0','0','0','0'};
		char[] mins_dis_1 ={'0','0','0','0'};
		
		for(int i=0;i<q;i++)
		{
			mins_dis_5[i]='Y';
		}
		
		if((q>2)&&(q<=5))
		{
			mins_dis_5[2]='R';
		}
		if((q>5)&&(q<=8))
		{
			mins_dis_5[2]='R';
			mins_dis_5[5]='R';
		}
		if((q>8)&&(q<=11))
		{
			mins_dis_5[2]='R';
			mins_dis_5[5]='R';
			mins_dis_5[8]='R';
		}
		for(int i=0;i<mins_dis_5.length;i++)
			System.out.print(mins_dis_5[i]);
		
		
		System.out.println();
		
		
		for(int j=0;j<r;j++)
		{
			mins_dis_1[j]='Y';
		}
		for(int j=0;j<mins_dis_1.length;j++)
			System.out.print(mins_dis_1[j]);
	}
}
