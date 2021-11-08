package Homework.RandomString;

import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
        // create a string of all the letters
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        // create a string builder
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        Random random = new Random();  // create an object of Random class
        int length = 9; // specify the length of the random string
        //create a loop to add characters to the string
        for(int i = 0; i < length; i++) {
            int index = random.nextInt(letters.length());  // generate a random index number
            char randomChar = letters.charAt(index);   //get the character specified by the index
            sb1.append(randomChar); // add the character to the end of string builder
        }
        int length2 = 12;
        for(int i = 0; i < length2; i++) {
            int index = random.nextInt(letters.length());
            char randomChar = letters.charAt(index);
            sb2.append(randomChar);
}
        String randomString1 = sb1.toString();
        System.out.println("Random String is: " + randomString1);

        String randomString2 = sb2.toString();
        System.out.println("Random String is: " + randomString2);
        System.out.println();
        String lowRandomString = randomString1.toLowerCase();
        System.out.println("Applying Lower Case:");
        System.out.println(lowRandomString);
        System.out.println();

        String replacementAforJ = randomString2.replace("a", "j");
        System.out.println(randomString2);
        System.out.println("Replacing A for J:");
        System.out.println(replacementAforJ);
        System.out.println();

        String upperCase = randomString1.toUpperCase();
        System.out.println(randomString1);
        System.out.println("Converting to uppercase: ");
        System.out.println(upperCase);
        System.out.println();


        Boolean isInString = randomString2.contains("c");
        System.out.println("Is c part of the string?:");
        System.out.println(isInString);
        System.out.println();

        int returnHashCode = randomString1.hashCode();
        System.out.println("Hash code: ");
        System.out.println(returnHashCode);
        }
}

