package Telephone.java.org;
//inteface Example
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeskPhone myPhone = new DeskPhone("123456");  
		
		myPhone.power();
		myPhone.callPhone("123456");
		myPhone.answer();
		
		Mobile mb = new Mobile("987654");
		
		mb.power();
		mb.callPhone("987654");
		mb.answer();
	}

}
