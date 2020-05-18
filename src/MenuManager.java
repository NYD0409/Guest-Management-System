import java.util.*;

public class MenuManager {
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			GuestManager guestManager = new GuestManager(input);
			
			selectMenu(input, guestManager);
		}
	
	public static void selectMenu(Scanner input, GuestManager guestManager) {
		int num = -1;
		while (num != 5) {
			try {				
				showMenu();				
				num = input.nextInt();
				
				switch(num) {
				case 1:
					guestManager.addGuest();
					break;
				case 2:
					guestManager.deleteGuest();
					break;
				case 3:
					guestManager.editGuest();
					break;
				case 4:
					guestManager.viewGuests();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an Integer between 1 - 5 : ");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}	
	}
	
	public static void showMenu() {
		System.out.println("Guest Management System Menu");
		System.out.println(" 1. Add Guest");
		System.out.println(" 2. Delete Guest");
		System.out.println(" 3. Edit Guest");
		System.out.println(" 4. View Guests");
		System.out.println(" 5. Exit");
		System.out.print("Select one number between 1 - 5 : ");
	}
}
