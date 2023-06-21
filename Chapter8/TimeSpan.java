public class TimeSpan{

	private int totalMinutes;
	
	public TimeSpan(int hours, int minutes){
		totalMinutes = 0;
		add(hours, minutes);
	}

	public void add(int hours, int minutes){
		if(hours < 0 || minutes < 0){
			throw new IllegalArgumentException();	
		}

		totalMinutes += 60*hours + minutes;
	}
	
	public String toString(){
		return (totalMinutes / 60) + "h " + (totalMinutes % 60) + "m"; 
	}

	
	//Additional Methods 
	//This is an overloading of the add method with a TimeSpan object Passed 
	public void add(TimeSpan other){
		this.add(0, other.totalMinutes);
	}
		
	public void subtract(TimeSpan other){
		if(this.totalMinutes < other.totalMinutes){
			this.totalMinutes = 0;
		}else{
			this.totalMinutes -= other.totalMinutes;
		}
	}

	public void scale(int multiplier){
		if(multiplier < 0){
			this.totalMinutes *= -multiplier;
		}else{
			this.totalMinutes *= multiplier;
		}
	}
	
	public compareTo(TimeSpan other){
		return this.totalMinutes - other.totalMinutes;
	}
	
}