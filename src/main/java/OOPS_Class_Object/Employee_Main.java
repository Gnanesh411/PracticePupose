package OOPS_Class_Object;

public class Employee_Main {
	public static void main(String[] args) {
		Employee emp1 = new Employee();// Object
		emp1.eid = 101;
		emp1.ename = "John";
		emp1.job = "Manager";
		emp1.sal = 50000;
		emp1.Display();

		Employee emp2 = new Employee();
		emp2.eid = 102;
		emp2.ename = "Gnanesh";
		emp2.job = "Sr Tester";
		emp2.sal = 60000;
		emp2.Display();
	}
}