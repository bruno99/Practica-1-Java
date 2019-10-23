package practica1;
public class User {
	 String name;
	 String nick;
	 String password;
	 String birthday;
	 String phonenumber;
	 boolean premium;
	 
	 public User(String name,
			   String nick,
			   String password,
			   String birthday,
			   String phonenumber,
			   boolean premium
			   ) {
			this.name = name;
			this.nick = nick;
			this.password = password;
			this.birthday = birthday;
			this.phonenumber= phonenumber;
		    this.premium = false;
			}

public String getName() {
return this.name;
}
public String getNick() {
return this.nick;
}
public String getPassword() {
return this.password;
}
public String getBirthday() {
return this.birthday;
}
public String getphonenumber() {
return this.phonenumber;
}
public boolean getPremium() {
	 return this.premium;
	 }

public String getData() {
return "Name: " + this.name + 
" Nick: " + this.nick + "\t" +
"Birthday: " + this.birthday + "\t" +
"Phonenumber: " + this.phonenumber +
"Premium user: " + this.premium;

}

} 
