package Telephone.java.org;

public class DeskPhone implements Telephone{
	
	private String myNumber;
	private boolean isRinging;
	
	public DeskPhone(String number)
	{
		this.myNumber=number;
	}

	@Override
	public void power() {
		// TODO Auto-generated method stub
		System.out.println("Always on");
		
	}

	@Override
	public void dial(String phoneNumber) {
		// TODO Auto-generated method stub
		System.out.println("now ringing"+ phoneNumber + "on DeskPhone");
	}

	@Override
	public void answer() {
		// TODO Auto-generated method stub
		if(isRinging) {
			System.out.println("Answering the Phone");
			isRinging=false;
		}
		else {
			System.out.println("is not Ringing");
		}
		
	}

	@Override
	public boolean callPhone(String phoneNumber) {
		// TODO Auto-generated method stub
		if (phoneNumber == myNumber) {
			isRinging =true;
			System.out.println("Phone Ringing");
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
