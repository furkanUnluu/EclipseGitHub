package homeWork;

public class Main {

	public static void main(String[] args) {
		
	Program program1 = new Program (1,"Yazılım Geliştirici Yetiştirme Kampı ","Java+React",0);
	
	Program program2 = new Program(2,"Programlamaya Giriş  ","Temel Kurs",0);
	
	Program program3 = new Program ();
	
	program3.id=3;
	program3.programName= "FRONTEND";
	program3.programDetail=" C#";
	program3.programPrice= 150;
	
	Program [] programs = {program1,program2,program3};
	
	for(Program program: programs) {
		System.out.println( program.id + "-" + program.programName +"-"+ program.programDetail +"-"+ program.programPrice);
	}
	
	ProgramManager programManager = new ProgramManager () ;
		
	programManager.programAdd(program1);
	programManager.programRemove(program2);
	
	
	
	}

}
