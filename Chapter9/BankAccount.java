public class BankAccount{
	String name;
	double balance; 
	double transactionFee;
		
	public void deposit(double amount){
		this.balance += amount;
	}

	public void withdraw(double amount){
		if(amount + transactionFee < this.balance){
			this.balance -= amount + transactionFee; 
		}
	}

	public String toString(){
		return name + ", $" + balance;
	}
		
	public void transfer(BankAccount other, double transferAmount){
		if(this.balance > 5.00 + transferAmount){
			other.balance += transferAmount;
			this.balance = this.balance - transferAmount - 5.00;
		}else if(this.balance > 5.00){
			other.balance += (transferAmount - 5.00);
			this.balance = 0;
		}
	}

	
}