package guest;

import java.util.Scanner;

public class Guest {
	protected GuestKind kind = GuestKind.Family;
	protected String name;
	protected int code;
	protected String email;
	protected String phone;

	public Guest() {	
	}
	
	public Guest(GuestKind kind) {
		this.kind = kind;
	}
	
	public Guest(String name, int code) {		
		this.name = name;
		this.code = code;

	}

	public Guest(GuestKind kind, String name, int code, String email, String phone) {		
		this.kind = kind;
		this.name = name;
		this.code = code;
		this.email = email;
		this.phone = phone;
	}
	
	public GuestKind getKind() {
		return kind;
	}

	public void setKind(GuestKind kind) {
		this.kind = kind;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void printInfo() {
		String gkind = "none";
		switch(this.kind) {
		case Family:
			gkind = "Fam.";
			break;
		case Friend:
			gkind = "Fri.";
			break;
		case VIP:
			gkind = "VIP.";
			break;
		case Colleague:
			gkind = "Col.";
			break;
		default:	
		}
		System.out.println("kind:" + gkind + " Name:" + name + " Code:" + code + " Email:" + email + " Phone:" + phone);
	}
	
	public void getUserInput (Scanner input) {
		System.out.print("Guest code :");
		int code = input.nextInt();
		this.setCode(code);
		
		System.out.print("Guest name :");
		String name = input.next();
		this.setName(name);
		
		System.out.print("E-maill address :");
		String email = input.next();
		this.setEmail(email);
		
		System.out.print("Phone number :");
		String phone = input.next();
		this.setPhone(phone);
	}
}
