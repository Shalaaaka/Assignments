import java.util.*;
import java.util.HashMap;
import java.util.Set;
class DateClass 
{
        private int date;
	    private int month;
	    private int year;

		public int getDate() {
			return date;
		}
		public void setDate(int date) {
			this.date = date;
		}
		public int getMonth() {
			return month;
		}
		public void setMonth(int month) {
			this.month = month;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public DateClass(int date, int month, int year) {
			super();
			this.date = date;
			this.month = month;
			this.year = year;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + date;
			result = prime * result + month;
			result = prime * result + year;
			return result;
		}
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			DateClass other = (DateClass) obj;
			if (date != other.date)
				return false;
			if (month != other.month)
				return false;
			if (year != other.year)
				return false;
			return true;
		}
	    
		@Override
		public String toString() {
			return "DateClass [date=" + date + ", month=" + month + ", year=" + year + "]";
		}
}
public class Assignment3Q4 
{

    public String getEmployee(HashMap<DateClass, String> dob,String employeeName)
	{
		Map<DateClass, String> map=new HashMap<>();
		Set<DateClass> keys=map.keySet();
		for(DateClass d:keys)
		{
			System.out.println(d+"==>"+map.get(d));
		}
		return null;
	}
    public static void main(String[] args)
	{
		HashMap<DateClass, String>hm=new HashMap<>();
		hm.put(new DateClass(1,1,1990),"Mona");
		hm.put(new DateClass(1,1,1992),"Ruby");
		hm.put(new DateClass(3,3,1993),"Anagha");
		hm.put(new DateClass(4,4,1994),"Sneha");
		hm.put(new DateClass(4,4,1996),"Aka");
		hm.forEach((k,v)->System.out.println(k+"=>"+v));
	}
}

