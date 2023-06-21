public class HarvardLawyer extends Employee{
	
	public double getSalary(){
		return (1.20*super.getSalary());
	}

	public int getVacationDays(){
		return super.getVacationDays() + 3;
	}

	public String getVacationForm(){
		return "pinkpinkpink";
	}
}