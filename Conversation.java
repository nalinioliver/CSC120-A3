import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

/**
 * Creates a welcome message for the user, and then prompts a user input for the number of conversation rounds. Afterwards, the user undergoes a conversation for the number of rounds before the transcript of the conversation is printed.
 * @author Nalini Oliver
 * Resources: Jordan Crouser's office hours (Monday 2/13), CSC 120 TA Hours (Monday 2/13 and Thursday 2/16), W3 schools "Java ArrayList"
 */
class Conversation {
  public static void main(String[] arguments) {
    /** Creates and names a new scanner (called "in") that will prompt a user input */
    Scanner in; 
    in = new Scanner(System.in); 
    /** Creates an array called "transcript" that can store strings */
    ArrayList<String> transcript = new ArrayList<String>();
    /** Adds the word "TRANSCRIPT" to the array list */
    transcript.add("TRANSCRIPT:");
    /** Prints out the message "How many rounds?" */
    System.out.println("How many rounds?: ");
    /** Adds the message "How many rounds?" to the array list */
    transcript.add("How many rounds?: ");
    /** Will cause the program to view the inital input of the user to be an integer (necessary for the "for" loop) */
    Integer userInput = in.nextInt();
    /** Will change the user input (interpretted as an integer) to a String (necessary in order to add this to the array list) */
    String newuserInput = Integer.toString(userInput);
    /** Will add the user input (the number of rounds) to the array list */
    transcript.add(newuserInput);

    /** Creates and names a new scanner (called "forloop") that will allow for a new user input */
    Scanner forloop; 
    forloop = new Scanner(System.in);

    /** Prints out the message "Hi there! What's on your mind?" */
    System.out.println("Hi there! What's on your mind?: ");
    /** Adds the string "Hi there! What's on your mind?" to the array list */
    transcript.add("Hi there! What's on your mind?: ");
    /** Creates the variable "callandresponse" with the Random method */
    Random callandresponse = new Random();
    /** Creates an array of type string that act as the "canned responses" for the computer conversation */
    String[] canned= {"What do you mean by that?", "Okay", "Interesting", "Mhm", "Tell me more"};
    /** 
     * Creates a "for" loop that starts at 0, and continues as long as the value of "i" is less than the user input (which represents the number of "rounds" of conversation). This loop will continue with the i++ 
     * @param: userInput, which is the user input (integer) that specifies the number of rounds of conversation the user wants 
     * @param: i++, will cause the "for" loop to continue to the next iteration of the conversation (prompting user input and computer response), until value of "i" (starting at 0), is equal to the value of userInput
     */
    for (int i = 0; i < userInput; i++) {
    /** Takes the user input in the "for" loop and makes the program view it as a string */
          String forloopInput = forloop.nextLine();
    /** Adds user input in the "for" loop to the array known as "transcript" */
          transcript.add(forloopInput);
    /** Saves the  number of objects based on index number ( i.e- finding the highest index number). This is done by taking the length of the array and subtracting 1 (since it starts at 0). This is saved under "randomindex" variable, which will allow for a random selection from the canned responses array list (based on the callandresponse object saved with the "Random" method)  */
          Integer randomindex = callandresponse.nextInt(canned.length - 1);
    /** Prints out one of the strings in the canned responses array at random */
          System.out.println(canned[randomindex]);
    /** Adds the randomly generated canned response to the transcript */
          transcript.add(canned[randomindex]); 
        }
    /** Prints out the message "Goodbye" */
      System.out.println("Goodbye");
    /** Saves the message "Goodbye" to the transcript array */
      transcript.add("Goodbye");
    /** Prints out the transcript array */
      System.out.println(transcript);

    /** Closes both scanners */
      in.close();
      forloop.close();  
        }
      } 
  

