package guest;

import java.io.Serializable;
import java.util.Scanner;

import exception.EmailFormatException;

public abstract class Guest implements GuestInput, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3613473607267977618L;
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

	public void setEmail(String email) throws EmailFormatException{
		if (!email.contains("@") && !email.equals("")) {
			throw new EmailFormatException();
		}
		
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
	
	public abstract void printInfo();
	
	public void setGuestCode(Scanner input) {
		System.out.print("Guest code : ");
		int code = input.nextInt();
		this.setCode(code);		
	}
		
	public void setGuestName(Scanner input) {
		System.out.print("Guest name : ");
		String name = input.next();
		this.setName(name);
	}
	
	public void setGuestEmail(Scanner input) {
		String email = "";
		while(!email.contains("@")) {
		System.out.print("E-mail address : ");
		email = input.next();
			try {
				this.setEmail(email);
			} 
			catch (EmailFormatException e) {
				System.out.println("Incorrect E-mail Format. Put the E-mail address that contains @");
			}
		}
	}
	
	public void setGuestPhone(Scanner input) {
		System.out.print("Phone number : ");
		String phone = input.next();
		this.setPhone(phone);
	}
	
	public String getKindString() {
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
		return gkind;
	}
}
