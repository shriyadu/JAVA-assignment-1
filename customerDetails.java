package CD_ATM;

import java.text.DateFormat.Field;

class customerDetails extends MAIN{
	int accNo;
	String ahName;
	int sPin;
	int balance;
	public customerDetails(int accNo, String ahName, int sPin, int balance) {
		super();
		this.accNo = accNo;
		this.ahName = ahName;
		this.sPin = sPin;
		this.balance = balance;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAhName() {
		return ahName;
	}
	public void setAhName(String ahName) {
		this.ahName = ahName;
	}
	public int getsPin() {
		return sPin;
	}
	public void setsPin(int sPin) {
		this.sPin = sPin;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void updatebalaance(int amt) {
		balance-=amt;
		return;
	}
	void customercashupdate(customerDetails obj,int amt,int _2000count,int _500count,int _100count) {
		if(amt<=obj.balance) {
    		if(a12.update_withdrawl(amt,_2000count,_500count,_100count)) {
    		  obj.updatebalaance(amt);
    		} 
    		else {
    			System.out.println(" Atm Balance Is Low");
    		}
    	}
    	else {
    		System.out.println(" Your Account Balance Is Low");
    	}
		return;
	}
	public String toString() {
		return  accNo + ahName + sPin + balance;
	}	
}
