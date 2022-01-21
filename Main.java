// import Scanner to give us the functions needed to retrieve user input
import java.util.Scanner;

public class Main {
  // main will run the terminal "UI" so to speak. It will loop the main menu to allow conversions
    public static void main(String[] args) {
      // Welcome user and explain which conversions are available
      System.out.println("Welcome to the Currency Converter Program.");
      System.out.println("From currency list: USD, EUR, GBP.");
      System.out.println("To currency list: USD, EUR, GBP, JPY, AUD, CAD, CHF, CNY, SEK, NZD.\n");

      // This Boolean will kill the while loop
      Boolean repeat = true;

      // Create the Scanner variable to retrieve user input below
      Scanner reader = new Scanner(System.in);

      // The main program loop. Exit out to terminate program
      while (repeat) {
        // Prompt user to desired "from" currency (also offer program termination)
        System.out.println("Please insert your original currency type (Press \"q\" to exit): ");

        // User the Scanner function "nextLine()" we can retrieve text from user
        String fromType = reader.nextLine();

        // This if statement will allow us to break the loop and terminate program, or continue
        if (fromType.equals("q")){
          repeat = false;
          break;
        } else {
          // Prompt user for "to" currency (also offer program termination)
          System.out.println("\nPlease insert the currency type you'd like to convert to (Press \"q\" to exit): ");
          String toType = reader.nextLine();
          if (toType.equals("q")) {
            repeat = false;
            break;
          } else {
            // Prompt user for the amount of money they want converted 
            System.out.println("\nPlease enter conversion amount: ");

            // Normally we would use the Scanner function .nextFloat() to save the desired input from user,
            // but the Scanner doesn't convert between types very easily, so jumping from .nextLine() to .nextFloat() would cause
            // java to skip the next user input. Thus, we are reading the user money input as a String and converting to a Float value
            // Try...Catch here to solve user inputing none numberic values
            try {
              Float moneyAmount = Float.parseFloat(reader.nextLine());
              // Create Currency class object
              Currency curObj = new Currency();

              // Send fromType and toType requests to Currency class's getRate() method: Save float rate value
              // Try...Catch here to solve incorrect String input
              try {
              Float rate = curObj.getRate(fromType, toType);

              // Perform conversion math
              Float converted = rate * moneyAmount;

              // Print converted sum to user to 2 decimal points.
              System.out.println("\nYour amount converted to " + toType + ": ");
              System.out.printf("%.2f %n %n", converted);
              } catch (Exception e) {
                System.out.println("\nBase currency value not found or invalid.\n");
              }
            } catch (Exception e) {
              System.out.println("\nInvalid money value.\n");
            }
            
          }
        }

      }
      // When exited out of loop, close the Scanner manually to be safe
      reader.close();
      
      // Thanks for using the program~! :D
      System.out.println("\nThanks for using Currency Converter!");
      System.out.println("\nExited program... \n");
    }
  }