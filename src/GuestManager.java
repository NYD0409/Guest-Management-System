import java.util.Scanner;
import java.util.ArrayList;



public class GuestManager {
	ArrayList<Guest> guests = new ArrayList<Guest>();
	Scanner input;
	GuestManager(Scanner input){
		this.input = input;		
	}
	
	public void addGuest() {
		Guest guest = new Guest();
		System.out.print("Guest code : ");
		guest.code = input.nextInt();
		System.out.print("Guest name : ");
		guest.name = input.next();
		System.out.print("E-maill address : ");
		guest.email = input.next();
		System.out.print("Phone number : ");
		guest.phone = input.next();
		guests.add(guest);
	}
	
	public void deleteGuest() {
		System.out.println("Guest code");
		int guestcode = input.nextInt();
		int index = -1;
		for (int i=0; i<guests.size(); i++) {
			if(guests.get(i).code == guestcode) {
				index = i;
				break;
			}
		}		
		if (index >= 0) {
			guests.remove(index);
			Guest.numGuestsRegistered--;
			System.out.println("the guest" + guestcode + " is deleted.");
		}
		else {
			System.out.println("The guest has not been registered");
			return;
		}
	}
	
	public void editGuest() {
		System.out.println("Guest code");
		int guestcode = input.nextInt();
		for (int i=0; i<guests.size(); i++) {
			Guest guest = guests.get(i);
			if (guests.get(i).code == guestcode) {
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
				break;
			}
		}
	}
	
	public void viewGuests() {
//		System.out.println("Guest code");
//		int guestcode = input.nextInt();
		System.out.println("# of registered guests:" + Guest.numGuestsRegistered);
		for (int i=0; i<guests.size(); i++) {
			guests.get(i).printInfo();
		}
	}
}
