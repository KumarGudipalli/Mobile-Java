package Mobiles;
import java.util.ArrayList;
public class StudentMobile {
	
  private  ArrayList<String> name = new ArrayList<String>();
  private ArrayList<String> Contacts = new ArrayList<String> ();
  

public StudentMobile(String[] cont, String[] mobile) {
	// TODO Auto-generated constructor stub
for(String k : cont) {
	this.name.add(k);
}
for(String m: mobile) {
	this.Contacts.add(m);
}
	
}
				
						///---------------Add NewContact-------------------///



public boolean addNewContact(String string, String num) {
	// TODO Auto-generated method stub
if(name.contains(string)) {
	return false;
}else {
	this.name.add(string);
	this.Contacts.add(num);
	return true;
}
}

				//-------------- Remove Contact ------------------//

public boolean removecontact(String string) {
	// TODO Auto-generated method stub
	if(name.contains(string)) {
		this.name.remove(string);
		this.Contacts.remove(0);
		  return true;
	}else {
		return false;
	}
}

 						//---------------- Find Contact------------//

public int findContact(String string) {
	// TODO Auto-generated method stub
for(int i=0; i<name.size(); i++) {
	  if( name.get(i) == string) {
		  return i;
		  
	  }
}
return -1;
}

						//--------- print Contacts-----------// 


public void printContacts() {
	// TODO Auto-generated method stub

	
	for(int i=0; i<name.size(); i++) {


		System.out.println(i+1+" "+ name.get(i) +"-->"+Contacts.get(i));
	}
	
	
}


}
