import java.util.Scanner;

class Employee{
	String name;
	int salary;
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
public class Question2 {

	public static void main(String [] args) {
		Employee e [] = {
				new Employee("sam", 10000),
				new Employee("raj", 10000)
		};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Salary");
		int sal = sc.nextInt();
		
		for (Employee employee : e) {
			if (employee.getSalary()==sal) {
				System.out.println("Employee found: " + employee);
			}
		}
	sc.close();	
	}
}