package week1.day1assignments;

public class Mobile {
	private void makeCall() {

		String mobileModel="Oneplus 7T";
		float mobileWeight=164.55f;
		System.out.println("This is a MakeCall method");
		}
		private void sendMsg() {
		boolean isFullCharged=true;
		int mobileCost=35000;
		System.out.println("This is a SendMsg method");
		}

		public static void main(String[] args) {
			Mobile objmobile=new Mobile();
			objmobile.makeCall();
			objmobile.sendMsg();
			System.out.println("This is my mobile");

		}
}
