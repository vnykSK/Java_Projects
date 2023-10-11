package StudentDataBase;
import java.util.*;

public class Student {
	
	private String firstName;
	private String lastName;
	private String gradeYear;
	private int studentID;
	private String courses;
	private int tutionBalance;
	
	
		public Student()
		{
			Scanner s = new Scanner(System.in);
			
			System.out.println("Enter the First Name of the Student");
			 this.firstName=s.nextLine();
			
			System.out.println("Enter the Last Name of the Student");
			 this.lastName=s.nextLine();
			 
			 System.out.println("1 Freshman \n2 Second Year \n3 Thrid Year \n4 Fourth Year \nEnter the Grade Year of the Student");
			 this.gradeYear=s.nextLine();
			 
			 this.gradeYear=gradeYear+""+randomstudentID();
			 
			 this.courses=selectcourse();	
			 this.tutionBalance = tutionfee();
		}
		
		private int randomstudentID() {
			
			int max =9999;
			int min =1000;
			
			int id = (int)(Math.random()*(max-min+1)+min);
			return id;
		}
		
		public String selectcourse() {
			int choice=1;
			String course = null;
			Scanner s = new Scanner(System.in);
			while(choice!=0) {
			System.out.println("Course Offered are \n1 PCMB \n2 PCME \n3 PCMS \n4 PCMCs \n0 to exit");
			choice=s.nextInt();
			switch(choice) {
			case 1 : System.out.println("course selected is PCMB");
						course= "PCMB";
						break;
			case 2 : System.out.println("course selected is PCME");
						course = "PCME";
						break;
			case 3 : System.out.println("course selected is PCMS");
						course = "PCMS";
						break;
			case 4 : System.out.println("course selected is PCMCs");
						course = "PCMCs";;
						break;
			case 0 : System.out.println("exited");
						break;
			default : System.out.println("invaild entry");
			}
			}
			
			return course;
			
		}
		
		public void balance() {
			System.out.println(this.tutionBalance);
		}
		
		public int tutionfee() {
			int fee =600;
			System.out.println("your tution fee :"+fee);
			System.out.println("Enter the amount you wish to pay");
			Scanner s = new Scanner(System.in);
			int amount = s.nextInt();
			int total = fee - amount;
			System.out.println("remaining amount :"+total);
			return total;
			
		}
		
		public String showinfo()
		{
			return "Name : "+this.firstName+" "+this.lastName+
					"\nStudent ID :"+this.studentID+
					"\nCourse Selected :"+this.courses+
					"\ntution fee : "+ this.tutionBalance;
		}
		
		
}
