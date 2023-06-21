public class Chapter9{

	public static void main(String[] args){
		Employee emp1 = new Employee();

		Marketer mark1 = new Marketer();
		
		mark1.advertise();

		Janitor jan = new Janitor();
	
		System.out.println(jan.getSalary());

		HarvardLawyer mikeRoss = new HarvardLawyer();

		System.out.println(mikeRoss.getVacationForm());

	
		SequentialIncrementer seq = new SequentialIncrementer();

		RandomIncrementer rand = new RandomIncrementer();

		for(int i = 0; i < 11; i++){
			seq.increment();
			rand.increment();
			System.out.print(seq.getValue() + " " + rand.getValue());
			System.out.println();
		}
	}
	
	

	
}
