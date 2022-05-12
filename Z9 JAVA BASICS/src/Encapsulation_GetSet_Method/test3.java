package Encapsulation_GetSet_Method;

class Account {
	// private data members
	private long acc_no;
	private String name, email;
	private float amount;

	public long getAcc_no() {
		return acc_no;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public float getAmount() {
		return amount;
	}

	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}
}

public class test3 {
	public static void main(String[] args) {
	}
}
