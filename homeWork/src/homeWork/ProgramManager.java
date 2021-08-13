package homeWork;

public class ProgramManager {
	
	public void programAdd(Program program) {
		System.out.println("Yeni pogram eklendi:"+ program.programName );
	}
	public void programRemove(Program program) {
		System.out.println("Program silindi:"+ program.programName );
	}
}
