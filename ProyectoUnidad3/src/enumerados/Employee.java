package enumerados;

public class Employee {
	
	private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }


    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public String getFirstName() {
        return firstName;
    }



    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }



    public String getLastName() {
        return lastName;
    }



    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public int getSalary() {
        return salary;
    }



    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public int getAnnualSalary() {
    	
    	return this.salary*12;
    }

    public int raiseSalary(int percent) {
    	
    	double salaryDec = this.salary;
    	double percentage = (double) percent/100;
    	salaryDec+=salaryDec*percentage;
    	
    	
    	setSalary(this.salary +  (int) Math.round(salaryDec));
    	
    	return this.salary;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
                + "]";
    }

}
