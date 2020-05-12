import java.util.Scanner;

import guest.FamilyGuest;
import guest.FriendGuest;
import guest.Guest;
import guest.GuestInput;
import guest.GuestKind;
import guest.VIPGuest;

import java.util.ArrayList;

public class GuestManager {
	ArrayList<GuestInput> guests = new ArrayList<GuestInput>();
	Scanner input;
	GuestManager(Scanner input){
		this.input = input;		
	}
	
	public void addGuest() {
		int kind = 0;
		GuestInput guestInput;
		while (kind != 1 && kind != 2) {
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
	}
	
	public void deleteGuest() {
		System.out.println("Guest code");
		int guestcode = input.nextInt();
		int index = -1;
		for (int i=0; i<guests.size(); i++) {
			if(guests.get(i).getCode() == guestcode) {
				index = i;
				break;
			}
		}		
		if (index >= 0) {
			guests.remove(index);

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
			GuestInput guestInput = guests.get(i);
			if (guestInput.getCode() == guestcode) {
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
						int code = input.nextInt();
						guestInput.setCode(code);
					}
					else if (num == 2) {
						System.out.print("Guest name : ");
						String name = input.next();
						guestInput.setName(name);
					}
					else if (num == 3) {
						System.out.print("E-maill address : ");
						String email = input.next();
						guestInput.setEmail(email);
					}
					else if (num == 4) {
						System.out.print("Phone number : ");
						String phone = input.next();
						guestInput.setPhone(phone);
					}
					else {
						continue;
					} // if
				} // while
				break;
			} // if
		} // for
	}
	
	public void viewGuests() {
//		System.out.println("Guest code");
//		int guestcode = input.nextInt();
		System.out.println("# of registered guests:" + guests.size());
		for (int i=0; i<guests.size(); i++) {
			guests.get(i).printInfo();
		}
	}
}
