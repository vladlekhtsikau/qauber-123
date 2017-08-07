

import java.util.ArrayList;
import java.util.List;


public class Company {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("John",5000);
		Employee e2 = new Employee("Mike",5000);
		Employee e3 = new Employee("Sean",5000);
		Employee e4 = new Employee("Joe",5000);
		Employee e5 = new Employee("Jim",5000);
		Employee e6 = new Employee("Steve",5000);
		Employee e7 = new Employee("Brian",5000);
		Employee e8 = new Employee("Bill",5000);
		Employee e9 = new Employee("Bill",5000);
		Employee e10 = new Employee("Bill",5000);
		Employee e11 = new Manager("Justin",10000);
		Employee e12 = new Manager("Karl",10000);
		
		List<Employee> paychecks = new ArrayList<Employee>();
		paychecks.add(e1);
		paychecks.add(e2);
		paychecks.add(e3);
		paychecks.add(e4);
		paychecks.add(e5);
		paychecks.add(e6);
		paychecks.add(e7);
		paychecks.add(e8);
		paychecks.add(e9);
		paychecks.add(e10);
		paychecks.add(e11);
		paychecks.add(e12);
		
		

	}

}
