public class AddInput { 

    public static void main(String[] args) {
      int a = 0;
      int b = 0;
      int sum = 0;
        // Advanced section (once you get the sum working):
        // If you want to make sure that the user entered EXACTLY two integers, you need to get the number of inputs
        // The variable "args" holds all of the arguments that were passed into this program
        // The variable "args" is called an "array" because it's actually a list of items
        // If you good "How to get the number of items in an array in Java", you should be able to figure out how many integers there are in the variable "args"
        // int num_args = ???
         
        // More advanced: What if the two inputs aren't integers? Then what? How cold you check that?
         
    
        // **** START HERE: ****
        // These two lines will get you the first two arguments 
        try {
          if (args.length != 2) {
            System.out.println("Invalid Input");
            System.exit(0);
          }
          a = Integer.parseInt(args[0]);
          b = Integer.parseInt(args[1]);
          sum = a+b;
        } catch(NumberFormatException ex) {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        // Print out "The sum of _ and _ is _" where you actually print the numbers they enter and the sum
            System.out.println("The sum of " + a + " and " + b + " is " + sum + ".");
        
        
    }
}
