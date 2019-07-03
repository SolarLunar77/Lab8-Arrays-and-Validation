import java.util.Scanner;
public class Lab8 {

	public static void main(String[] args) {
		boolean isValid = true;
		String choice = "y";
		int index;

		Scanner scan = new Scanner(System.in); 
		
		String[] names = new String[10];
		names[0] = "Michael";
		names[1] = "George";
		names[2] = "Homer";
		names[3] = "Lisa";
		names[4] = "Bart";
		names[5] = "Marge";
		names[6] = "Carl";
		names[7] = "Moe";
		names[8] = "John";
		names[9] = "Milhouse";
		
		String[] food = new String[10];
		food[0] = "bacon";
		food[1] = "potatoes";
		food[2] = "doughnuts";
		food[3] = "baguettes";
		food[4] = "Krusty Burgers";
		food[5] = "lasagna";
		food[6] = "peanuts";
		food[7] = "steak";
		food[8] = "hot dogs";
		food[9] = "tacos";
		
		
		String[] town = new String[10];
		town[0] = "Springfield";
		town[1] = "Denver";
		town[2] = "Detroit";
		town[3] = "Chicago";
		town[4] = "New Yok City";
		town[5] = "Austin";
		town[6] = "Seattle";
		town[7] = "Atlanta";
		town[8] = "Salt Lake City";
		town[9] = "Shelbyville";
		
		System.out.println("Welcome!");
		
	while (choice.startsWith("y")) {
		
			System.out.println("\nWhich person would you like to know about?"
					+ "\nType in the number to access the profile.");
			System.out.println();
		
		
		//show entire list of names
		for (int i = 0; i < names.length; i++) {
			System.out.println(i + 1 + ". " + names[i]);
		}
		
		index = scan.nextInt() - 1;
		
		while (index < 0 || index >= 10) {

			System.out.println("Enter a valid number: (1-10)");
			index = scan.nextInt() - 1;
		
		}
	
		
		//Clear the scanner
		scan.nextLine();
		
		System.out.println("That is " + names[index] + 
				". What whould you like to know about " + names[index] + "? (enter"
				+ " \"hometown\"" + " or \"favorite food\").");
		
		String input = scan.nextLine();
		
		
		do {
			
			if (input.equalsIgnoreCase("hometown")) {
				System.out.println(names[index] + " is from " + town[index] + ".");
				System.out.println("Would you like to know more? (enter \"yes\" or \"no\".");
				input = scan.nextLine();
				
				
				if (input.toLowerCase().charAt(0) == 'y') {
					System.out.println(names[index] + " enjoys eating " + food[index] + ".");					break;
				} else {
					System.out.println("Very well, then.");
					break;
			}
			
		} else if (input.equalsIgnoreCase("favorite food")) {
			System.out.println(names[index] + " enjoys eating " + food[index] + ".");
			System.out.println("Would you like to know more about this person? "
					+ "(enter \"yes\" or \"no\".");
			input = scan.nextLine();
			
			
			if (input.toLowerCase().charAt(0) == 'y') {
				System.out.println(names[index] + " is from " + town[index] + ".");
				break;
			} else {
				System.out.println("Very well, then.");
				break;
		}	
		} else {
			System.out.println("That is not a valid entry. Please enter \"hometown\" or \"favorite food\".");
			input = scan.nextLine();
		}
			
	} while(!isValid);
	System.out.println();
	System.out.println("Would you like to try another person? (y/n)");
	choice = scan.nextLine();
	
}
	
	System.out.println("Thank you for searching!");
	
	}
}


		

		

			
		
		
