import java.util.Scanner;


public class GuestManger {
	Guest guest;
	Scanner input;
	GuestManger(Scanner input){
		this.input = input;		
	}
	
	public void addGuest() {
		guest = new Guest();
		System.out.print("Guest code : ");
		guest.code = input.nextInt();
		System.out.print("Guest name : ");
		guest.name = input.next();
		System.out.print("E-maill address : ");
		guest.email = input.next();
		System.out.print("Phone number : ");
		guest.phone = input.next();
	}
	
	public void deleteGuest() {
		System.out.println("Guest code");
		int guestcode = input.nextInt();
		if(guest == null) {
			System.out.println("The guest has not been registered");
			return;
		}
		if(guest.code == guestcode) {
			guest = null;
			System.out.println("The guest is deleted");
		}
	}
	
	public void editGuest() {
		System.out.println("Guest code");
		int guestcode = input.nextInt();
		if(guest.code == guestcode) {
			System.out.println("The guest to be edited is " + guestcode);
		}
	}
	
	public void viewGuest() {
		System.out.println("Guest code");
		int guestcode = input.nextInt();
		if(guest.code == guestcode) {
			guest.printInfo();
		}
	}
}
