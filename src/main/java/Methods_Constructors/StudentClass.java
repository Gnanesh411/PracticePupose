package Methods_Constructors;

public class StudentClass {
	int sid;
	String sname;
	char grad;

	void prinStuData() {
		System.out.println(sid+" "+sname+" "+grad);
	}
	//2)Using method prameters
	void setStudentData(int id,String name,char gr) {
		sid=id;
		sname=name;
		grad=gr;
	}
	StudentClass(int id,String name,char gr) {
		sid=id;
		sname=name;
		grad=gr;
	}
}
