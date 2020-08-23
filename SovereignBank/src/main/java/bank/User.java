package bank;

import java.io.Serializable;

public class User implements Serializable {
	String realName;
	String userName;
	int accountPIN; //This number is exclusively per user.
	
	public User (String realName, String userName,int accountPIN) {
		this.realName = realName;
		this.userName = userName;
		this.accountPIN = accountPIN;
	}
}
