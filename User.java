package practica1;

public class User {
	 String name;
	 String lastname;
	 String birthday;
	 String phonenumber;
	 
	 
	 public User(String name,
			   String lastname,
			   String birthday,
			   String phonenumber
			   ) {
			this.name = name;
			this.lastname = lastname;
			this.birthday = birthday;
			this.phonenumber= phonenumber;
		
			}

public String getName() {
return this.name;
}
public String getLastname() {
return this.lastname;
}
public String getBirthday() {
return this.birthday;
}
public String getphonenumber() {
return this.phonenumber;
}

public String getData() {
return "Name: " + this.name + 
" " + this.lastname + "\t" +
"Birthday: " + this.birthday + "\t" +
"Phonenumber: " + this.phonenumber;

}
} 
