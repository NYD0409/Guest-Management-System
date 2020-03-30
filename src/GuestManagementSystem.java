import java.util.*;

public class GuestManagementSystem {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int num = 5;
		
			while (num != 6) {
				System.out.println("Guest Management System Menu");
				System.out.println(" 1. Add Guest");
				System.out.println(" 2. Delete Guest");
				System.out.println(" 3. Edit Guest");
				System.out.println(" 4. View Guest");
				System.out.println(" 5. Show a Menu");
				System.out.println(" 6. Exit");
				System.out.println("Select one number between 1 - 6:");
				num = input.nextInt();
				if (num == 1) {
					addGuest();
			}
				else if (num == 2) {
					deleteGuest();
				}
				else if (num == 3) {
					editGuest();
				}
				else if (num == 4) {
					viewGuest();
				}
				else {
					continue;
				}
		}
	}
	
	public static void addGuest() {
		Scanner input = new Scanner(System.in);
		System.out.println("Guest code");
		int guestcode = input.nextInt();
		System.out.println("Guest name");
		String guestName = input.next();
		System.out.println("E-maill address");
		String guestEmail = input.next();
		System.out.println("Phone number");
		String guestPhone = input.next();
	}
	
	public static void deleteGuest() {
		Scanner input = new Scanner(System.in);
		System.out.println("Guest code");
		int guestcode = input.nextInt();
	}
	
	public static void editGuest() {
		Scanner input = new Scanner(System.in);
		System.out.println("Guest code");
		int guestcode = input.nextInt();
	}
	
	public static void viewGuest() {
		Scanner input = new Scanner(System.in);
		System.out.println("Guest code");
		int guestcode = input.nextInt();
	}
}
