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
			int num = -1;
			while (num != 5) {
				System.out.println("Guest Info Edit Menu");
				System.out.println(" 1. Edit Code");
				System.out.println(" 2. Edit Name");
				System.out.println(" 3. Edit Email");
				System.out.println(" 4. Edit Phone");
				System.out.println(" 5. Exit");
				System.out.print("Select one number between 1 - 5:");
				
				num = input.nextInt();
				
				if (num == 1) {
					System.out.print("Guest code : ");
					guest.code = input.nextInt();
				}
				else if (num == 2) {
					System.out.print("Guest name : ");
					guest.name = input.next();;
				}
				else if (num == 3) {
					System.out.print("E-maill address : ");
					guest.email = input.next();
				}
				else if (num == 4) {
					System.out.print("Phone number : ");
					guest.phone = input.next();
				}
				else {
					continue;
			}
		}
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
