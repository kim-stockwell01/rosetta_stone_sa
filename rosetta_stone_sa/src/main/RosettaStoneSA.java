package main;

import java.util.TreeMap;

/*
Developed by: Kim Stockwell
Date: 8/4/2020
 */
public class RosettaStoneSA {

    /**
     * Main method, entry point into the application.
     *
     * @param args Parameters provided from CL. The first and only parameter should be the string we want
     *             to get a unique character from.
     */
    public static void main( String[] args ) {

        if( args != null && args.length > 0 ) {
            String stringToAnalyze = args[0];
            Character firstUniqueChar = getFirstUniqueCharacter(stringToAnalyze);
            System.out.println( ( firstUniqueChar != null ) ? "First unique character is: \"" + firstUniqueChar + "\"" :
                    "No unique character found");
        } else {
            System.err.println("Must provide at least one string as input");
        }

    }

    /**
     * This method gets the first unique character within the provided string. This does not
     * have to be an alphanumeric character, and can also be a whitespace character.
     *
     * @param stringToAnalyze String to get the first unique character from
     * @return The first unique character in the string
     */
    public static Character getFirstUniqueCharacter( String stringToAnalyze ) {

        Character firstUniqueChar = null;

        // If the string provided is not null
        if( stringToAnalyze != null ) {

            // Store the length of the string
            int lenOfStr = stringToAnalyze.length();

            // If it's a valid string with at least one character, we can continue
            if( lenOfStr > 0 ) {

                // Create a TreeMap to hold the characters in the string and how often they appear
                TreeMap<Character, Integer> charCount = new TreeMap<Character, Integer>();

                // loop through the string
                for (int i = 0; i < lenOfStr; i++) {
                    // Get the character at the current index
                    char currentCharInStr = stringToAnalyze.charAt(i);
                    // Put in the map, or increase the count if it's already in the map
                    charCount.put(currentCharInStr, charCount.getOrDefault(currentCharInStr, 0) + 1);
                }

                // Go through the string once more
                for (int i = 0; i < lenOfStr; i++) {
                    // Get the character at the current index
                    char currentCharInStr = stringToAnalyze.charAt(i);
                    // If it's a character that appears only once
                    if (charCount.get(currentCharInStr) == 1) {
                        // Set this as the first unique character
                        firstUniqueChar = currentCharInStr;
                        //Break out of the loop so that we don't replace this with future unique characters
                        break;
                    }
                }

            }

        }

        return firstUniqueChar;

    }

}
