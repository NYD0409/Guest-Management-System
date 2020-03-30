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
		}
	}
	
	public static void addGuest() {
		Scanner input = new Scanner(System.in);
		System.out.println("Guest code");
		int guestcode = input.nextInt();
		System.out.println(guestcode);
	}
}
