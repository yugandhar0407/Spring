
package business;

public class Bank {
	
	private int amount = 5000;
	private String acno = "sbi123";
	
	
	public int deposite(String acno, int amount) {
		if (acno.equals(this.acno)) {
		
			this.amount = this.amount + amount;
			System.out.println("In deposite method");
			return this.amount;
			
		}else {
			throw new AcnoNotFoundException();
		}
		
	}
	
}
