
public class Guest {
	
	String name;
	int code;
	String email;
	String phone;
	static int numGuestsRegistered = 0;
	
	public Guest() {	
		numGuestsRegistered++;
	}
	
	public Guest(String name, int code) {		
		this.name = name;
		this.code = code;
		numGuestsRegistered++;
	}

	public Guest(String name, int code, String email, String phone) {		
		this.name = name;
		this.code = code;
		this.email = email;
		this.phone = phone;
		numGuestsRegistered++;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void printInfo() {
		System.out.println("Name:" + name + " Code:" + code + " Email:" + email + " Phone:" + phone);
	}
}
