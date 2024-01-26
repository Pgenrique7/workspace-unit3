package ejercicios.ingles.problem6;

public class Account {

	private String id;
	private String name;
	private int balance;
	private EnumAccount property;
	
	public Account() {
		
	}

	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int credit (int amount) {
		
		this.balance+=amount;
		
		return this.balance;
	}
	
	
	public int debit (int amount) {
		
		if (amount<=this.balance) {
			this.balance=this.balance-amount;
		}
		else {
			System.out.println("Amount exceeded balance");
		}
		
		return this.balance;
	}
	
	public int transferTo(int amount, Account another ) {
		
		if (amount <= this.balance) {
			
			this.balance=this.balance-amount;
			another.balance=another.balance+amount;
			
			
		}
		else {
			System.out.println("Amount exceeded balance");
		}
		
		return this.balance;
		
	}
	
	
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	
	
}
	
