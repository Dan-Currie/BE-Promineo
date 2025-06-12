package week4CodingPrjct;

public class week4CodingPrjct {

	    public static void main(String[] args) {
	    	// 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
	    	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
	    	//a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
	    	int firstElement = ages[0]; //first element is [0]
	    	int lastElement = ages[ages.length - 1]; //last element takes length of array -1
	    	int result = lastElement - firstElement;
	    	System.out.println("First element minus the last element = " + result);
	    	//93 - 3 = 90
	    	
	    	//b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).
	    	//i. Make sure that there are 9 elements of type int in this new array.
	    	//ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
	    	//iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
	    	int[] ages2 = {13, 31, 55, 37, 21, 63, 6, 65, 69};
	    	int firstElement2 = ages2[0];
	    	int lastElement2 = ages2[ages2.length - 1];
	    	int result2 = lastElement2 - firstElement2;
	    	System.out.println("First element minus the last element in the second array = " + result2);
	    	//69 - 13 = 56
	    	
	    	//c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
	    	int sum = 0; //store the sum of all ages in array
	    	for (int age : ages) {
	    		sum += age; //loop through array and add each element to sum
	    	}
	    	int average = sum /ages.length; //calculate the average by dividing sum of numbers by length of array
	    	System.out.println("The average age of the first array is: " + average);
	    	
	    	//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
	    	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	    	//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
	    	int sumLetters = 0; //hold sum of letters
	    	for (String name : names) {
	    		sumLetters += name.length(); //loop through array to add number of total letters to sumLetters
	    	}
	    	int averageLetters = sumLetters / names.length; //calculate average by dividing sum of letters by length of array
	    	System.out.println("The average number of letters per name is: " + averageLetters);
	    	//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
	    	String concatNames = ""; //hold names
	    	for (int i = 0; i < names.length; i++) { //for loop iterates through each name in array
	    		concatNames += names[i]; 
	    		if (i < names.length - 1) { //stops loop at last element of array
	    			concatNames += " "; //adds space between names
	    		}
	    	}
	    	System.out.println("Concatenated names with space: " + concatNames);
	    	
	    	//3. How do you access the last element of any array?
	    	//use array.length - 1
	    	int lastElement3 = ages2[ages2.length - 1];
	    	System.out.println("Access last element of array: " + lastElement3);
	    	
	    	//4. How do you access the first element of any array?
	    	//first element is [0]
	    	int firstElement3 = ages2[0];
	    	System.out.println("Access first element of array: " + firstElement3);
	    	
	    	//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
	    	int[] nameLengths = new int[names.length]; //create nameLengths array
	    	for (int i = 0; i < names.length; i++) { //loop through array
	    		nameLengths[i] = names[i].length();
	    	}
	    	//for (int total : nameLengths) {
	    	//System.out.println("The number of letters in each name in the names array in order from first to last: " + total);
	    	//}
	    	
	    	//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
	    	int sumOfElementsInArray = 0; // holds sum
	    	for (int totalLength : nameLengths) { //loop elements of array
	    		sumOfElementsInArray += totalLength; // add total to sum holder
	    	}
	    	System.out.println("The total number of elements in the array is: " + sumOfElementsInArray);
	    	
	    	//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	    	String word = "Test";
		    int n = 4;
		    String concatenatedWord = concatenateWords(word, n);
		    System.out.println("Word is Test, N is 4: " + concatenatedWord);
		    
		    //8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		    String firstName = "Sarah";
		    String lastName = "Smith";
		    String fullNameResult = fullName(firstName, lastName);
		    System.out.println("Full name is: " + fullNameResult);
		    
		    //9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		    int[] testArray = {1, 2, 3, 4};
		    System.out.println("Is the array 'ages' greater than 100?" );
		    System.out.println(isArrayGreaterThan100(ages));
		    System.out.println("Is the array 'testArray' greater than 100?" );
		    System.out.println(isArrayGreaterThan100(testArray));
		    
		    //10. Write a method that takes an array of double and returns the average of all the elements in the array.
		    double[] doubleArray1 = {15.9, 22.8, 37.7, 4.6, 51.5};
		    System.out.println("The average of all elements in doubleArray1 = ");
		    System.out.println(averageOfElements(doubleArray1));
		    
		    //11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		    double[] doubleArray2 = {21.4, 6.5, 47.1, 10.6, 39.4};
		    System.out.println("Is doubleArray1 greater than doubleArray2?");
		    System.out.println(isArray1GreaterThanArray2(doubleArray1, doubleArray2));
		    System.out.println("The average of all elements in doubleArray2 = ");
		    System.out.println(averageOfElements(doubleArray2));
		    
		    //12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		    System.out.println("It is hot outside and you have $10.51 in your pocket. Will you buy a drink?");
		    System.out.println(willBuyDrink(true, 10.51));
		    System.out.println("It is not hot outside and you don't have $10.50 in your pocket. Will you buy a drink?");
		    System.out.println(willBuyDrink(false, 9.50));
		    System.out.println("It is hot outside but you don't have $10.50 in your pocket. Will you buy a drink?");
		    System.out.println(willBuyDrink(true, 9.50));
		    
		    //13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		    //This method will check if the average of an array is odd or even
		    System.out.println("Is the average of 'ages' array even?");
		    System.out.println(isArrayEven(ages)); //the average according to my math is 28.75, but since it is an int and not a double it will return 28 and therefore true
		    System.out.println("Is the average of 'ages2' array even?");
		    System.out.println(isArrayEven(ages2)); //the average according to my math is 40 which is even
	    }
	    //7
	    public static String concatenateWords(String word, int n) {
	    	StringBuilder result = new StringBuilder(); //use stringbuilder because it is mutable
	    	for (int i = 0; i < n; i++) { //loop through "n"
	    		result.append(word); //add to result
	    	}
	    	return result.toString(); //return result to string
	    }
	    //8
	    public static String fullName(String firstName, String lastName) { //firstname and lastname strings
	    	return firstName + " " + lastName; //add it all together
	    }
	    //9
	    public static boolean isArrayGreaterThan100(int[] array) {
	    	int arrayTotal = 0; //sum of array
	    	for (int num : array) {
	    		arrayTotal += num; //add total of array to arrayTotal
	    	}
	    	if (arrayTotal > 100) { //check if arrayTotal is greater than 100
	    		return true;
	    	}
	    return false;	
	    }
	    //10
	    public static double averageOfElements(double[] array) {
	    	double arrayTotal = 0; //sum of array in double
	    	for (double num : array) {
	    		arrayTotal += num; //add total of array to arrayTotal
	    	}
	    	return arrayTotal / array.length; //divide arrayTotal by length of array
	    }
	    //11
	    public static boolean isArray1GreaterThanArray2(double[] array1, double[] array2) {
	    	double array1Total = 0; //sum of array1
	    	double array2Total = 0; //sum of array2
	    	for (double num : array1) {
	    		array1Total += num; //add total of array1 to array1total
	    	}
	    	for (double num2 : array2) {
	    		array2Total += num2; //add total of array2 to array2total
	    		if (array1Total > array2Total) { //compare array totals
	    			return true;
	    		}
	    	}
	    	return false;
	    }
	    //12
	    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	    	if ((isHotOutside = true) && (moneyInPocket > 10.50)) { //check if it is hot outside, and there is enough money in pocket
	    		return true;
	    	}
	    	return false;
	    }
	    //13
	    public static boolean isArrayEven(int[] array) {
	    	int arrayTotal = 0; //sum of array
	    	for (int num : array) {
	    		arrayTotal += num; //add total of array to arraytotal
	    		if (arrayTotal % 2 == 0) { //check if arraytotal is divisible by 2
	    			return true;
	    		}
	    	}
	    	return false;
	    }
	    
	    
}
