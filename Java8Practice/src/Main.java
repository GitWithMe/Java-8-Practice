import java.util.*;

public class Main {

	public static void main(String[] args) {
//		new Thread(()->{
//			System.out.println("This is Line 1");
//			System.out.println("This is Line 2");
//			System.out.println("This is Line 3");         /*Lambda Expresssion For Threads */
//		}).start();
		
		Employee Namit = new Employee("Namit", 21);
		Employee Abhishek = new Employee("Abhishek", 18);
		Employee Jitesh = new Employee ("Jitesh", 20);
		Employee Baluchka = new Employee("Baluchka", 60);
		
		
		List<Employee> employees = new ArrayList<>(); //Creating An ArrayList which is a Dynamic Array in Java
		employees.add(Namit);
		employees.add(Abhishek);    /*Adding into ArrayList*/
		employees.add(Jitesh);
		employees.add(Baluchka);
		
		/* Normal Implementation*/
		
//		Collections.sort(employees, new Comparator<Employee>() { //This Function will sort the name according to the ascending order from the first letter of their names
//
//			@Override
//			public int compare(Employee employee1, Employee employee2) {
//				// TODO Auto-generated method stub
//				return employee1.getName().compareTo(employee2.getName());   
//			}
//			
//			
//		});
		
		/* Lambda Implementation */
		
		Collections.sort(employees, (employee1, employee2)-> employee1.getName().compareTo(employee2.getName()));
		
		/*In Lambda Functions, in case of one parameter, no Paranthesis is needed and is only required when either there are no or many parameters */
		
		
		for(Employee employee: employees) {
			System.out.println(employee.getName());
		}
	}
}

class Employee{
	private String name;
	private int age;
	public Employee(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
