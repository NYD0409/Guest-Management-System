package guest;

import java.util.Scanner;

public abstract class Guest {
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
	
	public abstract void printInfo();
}
