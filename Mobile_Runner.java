package Mobiles;
public class Mobile_Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]  cont = {"kumar", "AliaBhat", "RamCharan" , "tarak"};
		String[]   Mobile = {"9956784861","459763159900", "1234567890","8569741333"};
		StudentMobile Details = new StudentMobile( cont, Mobile );
		
      System.out.println(Details.addNewContact("raju","633737144"));	
      System.out.println(Details.removecontact("RamCharan"));
		 System.out.println(Details.findContact("kumar"));
		 Details.printContacts();
	}

}
