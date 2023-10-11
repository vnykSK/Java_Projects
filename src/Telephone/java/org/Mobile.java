package Telephone.java.org;

public class Mobile implements Telephone{
		
	private String myNumber;
	private boolean isRinging;
	private boolean isPowerOn;
	
	public Mobile(String num){
		this.myNumber=num;
	}

	@Override
	public void power() {
		isPowerOn=true;
		System.out.println("Turned on the Mobile");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dial(String phoneNumber) {
		// TODO Auto-generated method stub
		System.out.println("now ringing"+ phoneNumber + "on Mobile");
	}

	@Override
	public void answer() {
		// TODO Auto-generated method stub
		if(isRinging && isPowerOn) {
			System.out.println("Answering the Phone");
			isRinging=false;
		}
		else {
			System.out.println("is not Ringing or the mobile is Switched Off");
		}
	}

	@Override
	public boolean callPhone(String phoneNumber) {
		// TODO Auto-generated method stub
		if (phoneNumber == myNumber && isPowerOn) {
			isRinging =true;
			System.out.println("Phone is Ringing");
		}
		else {
			isRinging = false;
		}
		return isRinging;
	}

	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		return isRinging;
	}
	
	
	
	
}
