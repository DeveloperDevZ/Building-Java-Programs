public class SequentialIncrementer implements Incrementable{
	private int value; 

	public SequentialIncrementer(){
		this.value = 0;
	}

	public void increment(){
		this.value += 1;
	}

	public int getValue(){
		return this.value;
	}
}