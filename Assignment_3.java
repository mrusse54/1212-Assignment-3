
// imports Scanner
import java.util.Scanner;

public class Assignment_3 {

	public static void main(String[] args) {

		// creates Scanner
		Scanner input = new Scanner(System.in);

		// String array with 10 index variables with values of movie names
		String[] movieTitle = { "Gone with the Wind", "Star Wars", "The Truman Show", "The Martian",
				"Blade Runner 2049", "Dunkirk", "Upstream Color", "La La Land", "The King’s Speech",
				"Pirates of the Caribbean" };

		// int array with 10 index variables with values of movie ID
		int[] movieID = { 110100, 121101, 133310, 145601, 156711, 164210, 169901, 175501, 180000, 199900 };

		// double array with 10 index variables with values of movie Price
		double[] moviePrice = { 3.32, 43.25, 54.00, 67.32, 105.00, 113.22, 20.00, 42.25, 32.11, 123.75 };

		// int array with 10 index variables with values of movie quantity
		int[] quantityAvailable = { 11, 12, 13, 12, 14, 12, 19, 15, 18, 19 };

		// creates int with placeholder value
		int userInput = -9999;

		// prompts user
		System.out.println(" please pick a menu option ");

		// begins do-while loop
		do {

			// prompts user
			System.out.println("1. Linear Search\n" + "2. Binary Search\n" + "3. Bubble Sort\n" + "4. Selection Sort\n"
					+ "5. Quit");

			// takes user Input and stores it
			userInput = input.nextInt();

			// if userInput value is 1
			if (userInput == 1) {

				// invokes display method to print arrays
				display(movieTitle, movieID, moviePrice, quantityAvailable);

				// prompts user
				System.out.println("Please enter the movie ID you wish to purchase from the list above: ");

				// takes user input and stores it
				int userID = input.nextInt();

				// invokes validMovieID to check if userID matches with any values from movieID
				// array
				if (validMovieID(movieID, userID)) {

					// invokes linearSearch to search for the index of the movie and assings the
					// value to
					// created int
					int indexOfMovie = linearSearch(movieID, userID);

					// checks to see if quantity available of the movie entered is above one
					if (quantityAvailable[indexOfMovie] >= 1) {

						// prompts user
						System.out.println("How many copies you wish to purchase: ");

						// takes user input and stores it
						int bought = input.nextInt();

						// invokes userWithinMovieAmount to check if the user is buying within quantity
						// available
						if (!userWithinMovieAmount(quantityAvailable, indexOfMovie, bought)) {

							// invokes method cost to calculate how much the purchase will cost the user and
							// assigns value to double variable
							double totalCost = cost(moviePrice, indexOfMovie, bought);

							// invokes display to print lines
							display(movieTitle, movieID, indexOfMovie, bought, totalCost);

							// invokes movieQuantittie to print out amount of movies remaining and updates
							// quantity
							movieQuantittie(quantityAvailable, indexOfMovie, bought, movieTitle);

							// if the user tries to buy too many coppies
						} else
							System.out.println(" You can not buy that many, dont be greedy");

						// if there are not coppies remaining of the movie
					} else
						System.out.println(
								"There is currently no avaliable copies of that movie at the moment, try agian in a later date.");
					// if the user does not enter a valid movie ID
				} else
					System.out.println(" Please enter a valid movie. ");
			}

			else if (userInput == 2) {

				// invokes display method to arrays
				display(movieTitle, movieID, moviePrice, quantityAvailable);

				// prompts user
				System.out.println("Please enter the movie ID you wish to purchase from the list above: ");

				// takes user input and stores it
				int userID = input.nextInt();

				// invokes validMovieID to check if userID matches with any values from movieID
				// array
				if (validMovieID(movieID, userID)) {

					// invokes binarySearch to search for the index of the movie and assings the
					// value to
					// created int
					int indexOfMovie = binarySearch(movieID, userID);

					// checks to see if quantity available of the movie entered is above one
					if (quantityAvailable[indexOfMovie] >= 1) {

						// prompts user
						System.out.println("How many copies you wish to purchase: ");

						// takes user input and stores it
						int bought = input.nextInt();

						// invokes userWithinMovieAmount to check if the user is buying within quantity
						// available
						if (!userWithinMovieAmount(quantityAvailable, indexOfMovie, bought)) {

							// invokes method cost to calculate how much the purchase will cost the user and
							// assigns value to double variable
							double totalCost = cost(moviePrice, indexOfMovie, bought);

							// invokes display to print lines
							display(movieTitle, movieID, indexOfMovie, bought, totalCost);

							// invokes movieQuantittie to print out amount of movies remaining and updates
							// quantity
							movieQuantittie(quantityAvailable, indexOfMovie, bought, movieTitle);

							// if the user tries to buy too many coppies
						} else
							System.out.println(" You can not buy that many, dont be greedy");

						// if there are not coppies remaining of the movie
					} else
						System.out.println(
								"There is currently no avaliable copies of that movie at the moment, try agian in a later date.");

					// if the user does not enter a valid movie ID
				} else
					System.out.println(" Please enter a valid movie. ");
			}

			// if userInput is not a value from the menu

			// if userInput is 3
			else if (userInput == 3) {

				// creates int array with a lenght of 10
				int[] numberArray = new int[10];

				// standard for loop that assigns random numbers 1-500 to each of the index
				// variables
				for (int i = 0; i < numberArray.length; i++)
					numberArray[i] = (int) (Math.random() * ((500 - 1) + 1)) + 1;

				// prints line
				System.out.print("The unsorted array is: ");

				// prints array
				for (int i = 0; i < numberArray.length; i++)
					System.out.print(numberArray[i] + " ");

				// prints line
				System.out.println("");

				// invokes bubbleSort method
				numberArray = bubbleSort(numberArray);

				// prints array
				for (int i = 0; i < numberArray.length; i++)
					System.out.print(numberArray[i] + " ");

			}

			else if (userInput == 4) {

				// creates int array with a lenght of 10
				int[] numberArray = new int[10];

				// standard for loop that assigns random numbers 1-500 to each of the index
				// variables
				for (int i = 0; i < numberArray.length; i++)
					numberArray[i] = (int) (Math.random() * ((500 - 1) + 1)) + 1;

				// prints line
				System.out.print("The unsorted array is: ");

				// prints array
				for (int i = 0; i < numberArray.length; i++)
					System.out.print(numberArray[i] + " ");

				// prints line
				System.out.println("");

				// invokes selectionSort method
				numberArray = selectionSort(numberArray);

				// prints array
				for (int i = 0; i < numberArray.length; i++)
					System.out.print(numberArray[i] + " ");

				// prints line
				System.out.println("");

			} else if (userInput == 5) {
				// prints line
				System.out.println("GoodBye love you <3");
			} else
				System.out.println("Please enter a valid input before I cough on you. ");

			// if userInput is not equal to 5 loop
		} while (userInput != 5);

	}

	// void method that has a parameter of one string array, one double array and
	// two int arrays
	public static void display(String[] movieTitle, int[] movieID, double[] moviePrice, int[] quantityAvailable) {

		// prints line
		System.out.println("Movie ID      Title          Cost  Available");

		// standard for loop that prints arrays
		for (int i = 0; i < movieTitle.length; i++) {
			System.out.println(
					" " + movieID[i] + "  " + movieTitle[i] + "  " + moviePrice[i] + "  " + quantityAvailable[i]);

		}

	}

	// return method that returns an int value and has a parameter of one int array
	// and int
	public static int linearSearch(int[] movieID, int key) {

		// standard for loop
		for (int i = 0; i < movieID.length; i++) {
			// of movieID index variable value at an index of i equal to key value
			if (movieID[i] == key)
				// return i
				return i;
		}

		// returns -1
		return -1;
	}

	// return method that returns an int value and has a parameter of one int array
	// and int
	public static int binarySearch(int[] movieID, int key) {

		// creates int with value of the index lenght of movieID
		int high = movieID.length - 1;

		// creates int with a value of 0
		int low = 0;

		// while high is greater than or equal to low
		while (high >= low) {

			// calculates middle index
			int middle = (high + low) / 2;

			// if key value is greater than value of movieID[middle]
			if (key > movieID[middle])
				// assigns middle + 1 value to low
				low = middle + 1;

			// if key value is equal to movieID[middle] value
			else if (key == movieID[middle])
				// return middle
				return middle;

			// if none of the other if statements met high is assigned value of middle - 1
			else
				high = middle - 1;

		}

		// returns -1
		return -1;

	}

	public static void display(String[] movieTitle, int[] movieID, int index, int bought, double cost) {

		System.out.println("Movie ID: " + movieID[index] + "\n" + "Movie Title: " + movieTitle[index] + "\n"
				+ "Number of movies bought: " + bought + "\n" + "Total Cost: " + cost);

	}

	// void method that has a parameter of int arrray, string array, and two ints
	public static void movieQuantittie(int[] quantityAvailable, int index, int bought, String[] movieTitle) {

		// standard for loop
		for (int i = 0; i < movieTitle.length; i++) {
			// if i is equal to index value
			if (i == index) {
				// updates quantityAvailable array
				quantityAvailable[i] = quantityAvailable[i] - bought;
				System.out.println(// prints line
						"There is a remaining amount of " + quantityAvailable[i] + " of the movie: " + movieTitle[i]);
			}

		}

	}

	// return method that returns an double value and has a parameter of a doubel
	// array and two ints
	public static double cost(double[] moviePrice, int index, int bought) {

		// assigns creates double variable with a value of 0
		double cost = 0;

		// standard for loop
		for (int i = 0; i < moviePrice.length; i++) {
			// if i is equal to index
			if (i == index)
				// calculates cost by multiplying moviePrice[i] by bought
				cost = moviePrice[i] * bought;
		}

		// returns cost
		return cost;

	}

	// return method that returns an boolean value and has a parameter of an int
	// array and two ints
	public static boolean userWithinMovieAmount(int[] quantityAvailable, int index, int bought) {

		// if quantityAvailable[index] value is less than bought
		if (quantityAvailable[index] < bought)
			// returns true
			return true;

		// returns false
		return false;

	}

	// return method that returns an boolean value and has a parameter of an int
	// array and one int
	public static boolean validMovieID(int[] movieID, int ID) {

		// standard for loop
		for (int i = 0; i < movieID.length; i++) {
			// movieID[i] value is equal to ID value
			if (movieID[i] == ID)
				// returns true
				return true;

		}
		// returns false
		return false;
	}

	// return method that returns an int array and has a parameter of an int array
	public static int[] bubbleSort(int[] unsortedArray) {

		// creates boolean with true value
		boolean pass = true;

		// for loop that loops one less than the lenght and has to have pass as true
		for (int i = 1; i < unsortedArray.length && pass; i++) {

			// assings false to pass
			pass = false;
			// for loop that runs one less than the length
			for (int j = 0; j < unsortedArray.length - i; j++) {
				// if unsortedArray[j] is greater than unsortedArray[j + 1]
				if (unsortedArray[j] > unsortedArray[j + 1]) {
					// swaps values of the two values
					int temp = unsortedArray[j];
					unsortedArray[j] = unsortedArray[j + 1];
					unsortedArray[j + 1] = temp;

					// assigns true to pass
					pass = true;
				}
			}
		}

		// returns array
		return unsortedArray;
	}

	// return method that returns an int array and has a parameter of an int array
	public static int[] selectionSort(int[] unsortedArray) {

		// for loop that runs the one less than the length
		for (int i = 0; i < unsortedArray.length - 1; i++) {

			// creates int and assigns value of unsortedArray[i]
			int currentMin = unsortedArray[i];

			// creates int and assigns value of i
			int currentMinIndex = i;

			// for loop that runs the one less than the length
			for (int j = i + 1; j < unsortedArray.length; j++) {
				// if currentMin greater than unsortedArray[j]
				if (currentMin > unsortedArray[j]) {
					// assings unsortedArray[j] to currentMin
					currentMin = unsortedArray[j];
					// j to currentMinIndex
					currentMinIndex = j;
				}
			}

			// if currentMinIndex does not equal i
			if (currentMinIndex != i) {
				// assings unsortedArray[i] to unsortedArray[currentMinIndex]
				unsortedArray[currentMinIndex] = unsortedArray[i];
				// assings unsortedArray[i] to currentMin
				unsortedArray[i] = currentMin;
			}
		}

		// returns unsortedArray
		return unsortedArray;

	}

}