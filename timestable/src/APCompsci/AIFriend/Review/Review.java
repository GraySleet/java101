package APCompsci.AIFriend.Review;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Class that contains helper methods for the Review Lab
 */
public class Review {

	//APCS - IGNORE CODE IN THIS SECTION, YOU DO NOT NEED TO CHANGE IT.
	//  This code is for loading the sentiment data and possible adjectives for the later activities.

	private static HashMap<String, Double> sentiment = new HashMap<String, Double>();
	private static ArrayList<String> posAdjectives = new ArrayList<String>();
	private static ArrayList<String> negAdjectives = new ArrayList<String>();


	private static final String SPACE = " ";

	static {
		try {
			Scanner input = new Scanner(new File("cleanSentiment.csv"));
			while (input.hasNextLine()) {
				String[] temp = input.nextLine().split(",");
				sentiment.put(temp[0], Double.parseDouble(temp[1]));
				//System.out.println("added "+ temp[0]+", "+temp[1]);
			}
			input.close();
		} catch (Exception e) {
			System.out.println("Error reading or parsing cleanSentiment.csv");
		}


		//read in the positive adjectives in postiveAdjectives.txt
		try {
			Scanner input = new Scanner(new File("posAdjectives.txt"));
			while (input.hasNextLine()) {
				String temp = input.nextLine().trim();

				posAdjectives.add(temp);
			}
			input.close();
		} catch (Exception e) {
			System.out.println("Error reading or parsing postitive Adjectives.txt\n" + e);
		}

		//read in the negative adjectives in negativeAdjectives.txt
		try {
			Scanner input = new Scanner(new File("negAdjectives.txt"));
			while (input.hasNextLine()) {
				negAdjectives.add(input.nextLine().trim());
			}
			input.close();
		} catch (Exception e) {
			System.out.println("Error reading or parsing negAdjectives.txt");
		}
	}
	//APCS - Code above here should not be changed.
	//  Methods below here may be called by you, but do not need to be changed.

	/**
	 * returns a string containing all of the text in fileName (including punctuation),
	 * with words separated by a single space
	 */
	public static String textToString(String fileName) {
		String temp = "";
		try {
			Scanner input = new Scanner(new File(fileName));

			//add 'words' in the file to the string, separated by a single space
			while (input.hasNext()) {
				temp = temp + input.next() + " ";
			}
			input.close();

		} catch (Exception e) {
			System.out.println("Unable to locate " + fileName);
		}
		//make sure to remove any additional space that may have been added at the end of the string.
		return temp.trim();
	}

	/**
	 * @returns the sentiment value of word as a number between -1 (very negative) to 1 (very positive sentiment)
	 */
	public static double sentimentVal(String word) {
		try {
			return sentiment.get(word.toLowerCase());
		} catch (Exception e) {
			return 0;
		}
	}

	/**
	 * Returns the ending punctuation of a string, or the empty string if there is none
	 */
	public static String getPunctuation(String word) {
		String punc = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			if (!Character.isLetterOrDigit(word.charAt(i))) {
				punc = punc + word.charAt(i);
			} else {
				return punc;
			}
		}
		return punc;
	}

	/**
	 * Randomly picks a positive adjective from the positiveAdjectives.txt file and returns it.
	 */
	public static String randomPositiveAdj() {
		int index = (int) (Math.random() * posAdjectives.size());
		return posAdjectives.get(index);
	}

	/**
	 * Randomly picks a negative adjective from the negativeAdjectives.txt file and returns it.
	 */
	public static String randomNegativeAdj() {
		int index = (int) (Math.random() * negAdjectives.size());
		return negAdjectives.get(index);

	}

	/**
	 * Randomly picks a positive or negative adjective and returns it.
	 */
	public static String randomAdjective() {
		boolean positive = Math.random() < .5;
		if (positive) {
			return randomPositiveAdj();
		} else {
			return randomNegativeAdj();
		}
	}

	//APCS - Methods below this line will be built by you as part of the activities for this lab.
	public static double totalSentiment(String ready) {
		double sentimentValue = 0;

		String[] arrayOfReady = ready.split(" ", 0);
		for (String sentiment : arrayOfReady) {
			sentimentValue += sentimentVal(sentiment);

		}

		return sentimentValue;


	}

	public static int starRating(String words, double totalSentiment) {
		int count = 0;
//I'm going to divide the sentiment by the number of averaged sentimental words. The highest value is 2.7, while the lowest value is -3.9.
		String[] arrayOfWords = words.split(" ", 0);
		for (String sentiment : arrayOfWords) {
			if (sentimentVal(sentiment) != 0) {
				count++;      //counts the number of sentimental words
			}
		}
		totalSentiment = totalSentiment / count;
		if (totalSentiment <= 0)
			return 1;
		else if (totalSentiment > 0 && totalSentiment < 0.15)
			return 2;
		else if (totalSentiment > 0.15 && totalSentiment < 0.25)
			return 3;
		else if (totalSentiment > 0.25 && totalSentiment < 0.5)
			return 4;
		else
			return 5;


	}

	public static String fakeReview(String rawInput) {

		StringBuffer finalresult = new StringBuffer();
		String[] arrayOfWords = rawInput.split(" ", 0);
		for (String phrase : arrayOfWords) {
			if (phrase.startsWith("*")) {
				//phrase.substring(1);
				String replacement = randomAdjective();
				finalresult.append(replacement);

			} else {
				finalresult.append(phrase);
			}
			finalresult.append(" ");
		}
		//String replacement=randomNegativeAdj() ;
		return finalresult.toString();
	}

	//This method is to remove punctuation, after textToString.
	//Can calibrate spaces better and is easier than using the other punctuation removal
	public static String removePunc(String filename) {
		String finalString = "";
		String enter = textToString(filename);

		for (int i = 0; i < enter.length(); i++) {
			char c = enter.charAt(i);
			String a = enter.substring(i, i+1);

			if (Character.isLetter(c) || Character.isSpaceChar(c) || a.equals("*")) {
				finalString += c;
			}

		}


		return finalString;
	}

	//To test your methods you will write code in this main method
	public static void main(String[] args) {
		//SimpleReview.txt

		String enter = removePunc("SimpleReview.txt");
		System.out.println("This program will print out your total sentiment and a star rating for that sentiment form SimpleReview.txt.");
		double totalSent = totalSentiment(enter);
		String a = String.format("Your total sentiment is %10.2f", totalSent);
		System.out.println(a);
		System.out.println(starRating(enter, totalSent) + " stars.");
		System.out.println("Now this program will print out a review with modified adjectives.");
		String modEnter = removePunc("SimpleReviewMod.txt");
		System.out.println(fakeReview(modEnter));

	}
}




