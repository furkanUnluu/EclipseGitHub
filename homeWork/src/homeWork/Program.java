package homeWork;

public class Program {
	
	
	public Program () {
		
	}
	
	public Program(int id, String programName, String programDetail, int programPrice) {
		this.id=id;
		this.programDetail=programDetail;
		this.programName=programName;
		this.programPrice=programPrice;
		
	}
	
	int id;
	String programName;
	String programDetail;
	int programPrice;
}