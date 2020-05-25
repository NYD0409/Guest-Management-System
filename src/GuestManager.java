import java.util.Scanner;

import guest.FamilyGuest;
import guest.FriendGuest;
import guest.GuestInput;
import guest.GuestKind;
import guest.VIPGuest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class GuestManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3106402261043753375L;
	ArrayList<GuestInput> guests = new ArrayList<GuestInput>();
	transient Scanner input;
	GuestManager(Scanner input){
		this.input = input;		
	}
	
	public void addGuest() {
		int kind = 0;
		GuestInput guestInput;
		while (kind < 1 ||  kind > 2) {
			try {
				System.out.println("1 for Family");
				System.out.println("2 for Friend");
				System.out.println("3 for VIP");
				System.out.print("Select num for Guest Kind between 1 and 3: ");		
				kind = input.nextInt();
				
				if (kind == 1) {
					guestInput = new FamilyGuest(GuestKind.Family);
					guestInput.getUserInput(input);
					guests.add(guestInput);
					break;
				}
				else if (kind == 2) {
					guestInput = new FriendGuest(GuestKind.Friend);
					guestInput.getUserInput(input);
					guests.add(guestInput);
					break;
				}
				else if (kind == 3) {
					guestInput = new VIPGuest(GuestKind.VIP);
					guestInput.getUserInput(input);
					guests.add(guestInput);
					break;
				}
				else {
					System.out.print("Select num for Guest Kind between 1 and 2: ");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an Integer between 1 - 3 : ");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}
	
	public void deleteGuest() {
		System.out.println("Guest code");
		int guestcode = input.nextInt();
		int index = findIndex(guestcode);
		for (int i=0; i<guests.size(); i++) {
			if(guests.get(i).getCode() == guestcode) {
				index = i;
				break;
			}
		}		
		removefromStudents(index, guestcode);
	}
	
	public int findIndex(int guestcode) {
		int index = -1;
		for (int i=0; i<guests.size(); i++) {
			if(guests.get(i).getCode() == guestcode) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromStudents(int index, int guestcode) {
		if (index >= 0) {
			guests.remove(index);
			System.out.println("the guest" + guestcode + " is deleted.");
			return 1;
		}
		else {
			System.out.println("The guest has not been registered");
			return -1;
		}
	}
	
	public void editGuest() {
		System.out.println("Guest code");
		int guestcode = input.nextInt();
		for (int i=0; i<guests.size(); i++) {
			GuestInput guest = guests.get(i);
			if (guest.getCode() == guestcode) {
				int num = -1;
				while (num != 5) {
					showEditMenu();				
					num = input.nextInt();
					
					switch(num) {
					case 1:
						guest.setGuestCode(input);
						break;
					case 2:
						guest.setGuestName(input);
						break;
					case 3:
						guest.setGuestEmail(input);
						break;
					case 4:
						guest.setGuestPhone(input);
						break;
					default:
						continue;									
					} // if
				} // while
				break;
			} // if
		} // for
	}
	
	public void viewGuests() {
		System.out.println("# of registered guests:" + guests.size());
		for (int i=0; i<guests.size(); i++) {
			guests.get(i).printInfo();
		}
	}
	
	public void showEditMenu() {
		System.out.println("Guest Info Edit Menu");
		System.out.println(" 1. Edit Code");
		System.out.println(" 2. Edit Name");
		System.out.println(" 3. Edit Email");
		System.out.println(" 4. Edit Phone");
		System.out.println(" 5. Exit");
		System.out.print("Select one number between 1 - 5:");	
	}
	
	public void setScanner(Scanner input) {
		this.input = input;
	}
}
