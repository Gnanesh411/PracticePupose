package OOPS_Class_Object;

public class StudentMain {
	public static void main(String[] args) {
		StudentClass stu1 = new StudentClass();
		stu1.sid = 101;
		//stu1.sname = "Smith";
		stu1.grade = 'A';
		stu1.printData();
		
		StudentClass stu2 = new StudentClass();
		stu2.sid = 102;
		//stu2.sname = "John";
		stu2.grade = 'A';
		stu2.printData();
	}
}
