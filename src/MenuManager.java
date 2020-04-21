import java.util.*;

public class MenuManager {
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			GuestManager guestManager = new GuestManager(input);
			
			int num = -1;
			while (num != 5) {
				System.out.println("Guest Management System Menu");
				System.out.println(" 1. Add Guest");
				System.out.println(" 2. Delete Guest");
				System.out.println(" 3. Edit Guest");
				System.out.println(" 4. View Guests");
				System.out.println(" 5. Exit");
				System.out.print("Select one number between 1 - 5:");
				
				num = input.nextInt();
				
				if (num == 1) {
					guestManager.addGuest();
				}
				else if (num == 2) {
					guestManager.deleteGuest();
				}
				else if (num == 3) {
					guestManager.editGuest();
				}
				else if (num == 4) {
					guestManager.viewGuests();
				}
				else {
					continue;
			}
		}
	}
}
