
public class Guest {
	
	String name;
	int code;
	String email;
	String phone;
	
	public Guest() {	
	}
	
	public Guest(String name, int code) {		
		this.name = name;
		this.code = code;
	}

	public Guest(String name, int code, String email, String phone) {		
		this.name = name;
		this.code = code;
		this.email = email;
		this.phone = phone;
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
