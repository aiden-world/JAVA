import org.junit.Test;

public class Mydate {
	int year;
	int month;
	int day;
	public Mydate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public String toDateString() {
		return year+"年"+month+"月"+day+"日" ;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + month;
		result = prime * result + year;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mydate other = (Mydate) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Mydate [year=" + year + ", month=" + month + ", day=" + day + ", toDateString()=" + toDateString()
				+ ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
  @Test
  public void didi() {
	  System.out.println("dsa");
  }





