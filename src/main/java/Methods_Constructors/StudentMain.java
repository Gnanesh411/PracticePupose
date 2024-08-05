package Methods_Constructors;

public class StudentMain {
	public static void main(String[] args) {
		//StudentClass sc = new StudentClass();
		//1) using object reference variables
//		sc.sid = 102;
//		sc.sname="Gnanesh";
//		sc.grad='A';
//		sc.prinStuData();
		//2)Using method
//		sc.setStudentData(103, "Damodara", 'A');
//		sc.prinStuData();
		
		//3)using Constructor
		StudentClass stu = new StudentClass(104, "Krishna", 'A');
		stu.prinStuData();
		
		
		
		
		
	}
}
