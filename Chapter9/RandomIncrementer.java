import java.util.Random;

public class RandomIncrementer{
	Random rand = new Random();

	private int value;
	
	public RandomIncrementer(){
		this.value = (int) rand.nextInt(1000);
	}

	public void increment(){
		this.value = (int) rand.nextInt(1000);
	}

	public int getValue(){
		return this.value;
	}

}