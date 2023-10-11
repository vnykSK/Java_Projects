package emailApp;
import java.util.*;

public class Email {

	private String firstName;
	private String lastName;
	private String email;
	private String alternateEmail;
	private String password;
	private String department;
	private int mailBoxCapacity = 500;
	
	//Constructor
	public Email(String fn,String ln)
	{
		this.firstName=fn;
		this.lastName=ln;
		this.department = setDepartment();
		
		//System.out.println("Your Name is "+this.firstName+" "+this.lastName);
		//System.out.println("Your Department is "+" "+this.department);
		
		this.password = randomPassword(10);
		email= this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@"+department+"."+"JVA.com";
		
		//System.out.println(" Your email is :"+email);
		//System.out.println("Your Password is :"+password);
		
		System.out.println("Account Created Successfully");
		
	}
	
	private String setDepartment()
	{
		System.out.println("    Department codes \n==========================\n0 None \n1 Sales \n2 Development \n3 Accounting \nDepartment Code :   ");
		Scanner s = new Scanner(System.in);
		int deptno = s.nextInt();
		
		if(deptno==1) return "sales";
		else if (deptno==2)return "development";
		else if(deptno==3)return "accounting";
		else return "";
	}
	
	private String randomPassword(int length) {
		String passwordset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#%";
		char[] pass = new char[length];
		for(int i=0;i<length;i++) {
			  int rand = (int)( Math.random()* passwordset.length() );
			  pass[i]=passwordset.charAt(rand);
		}
		return new String(pass);
	}
	 
	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}

	public void setMailBoxCapacity(int mailBoxCapacity) {
		this.mailBoxCapacity = mailBoxCapacity;
	}
	
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public void changePassword(String pass) {
		this.password=pass;
	}
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "Display Name : "+firstName+lastName+
				"\nCompany Email : "+email+
				"\nPassword :"+password+
				"\nMailBoxCapacity : "+mailBoxCapacity;
	}
	
	
	
	
	
	
	
	
	
	
}
