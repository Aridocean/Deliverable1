
  import java.util.Scanner;

    public class VacationDecisions {

	public VacationDecisions() {
		// TODO Auto-generated constructor stub
		

			}
			public static void main(String[] args) {
				  Scanner scnr = new Scanner(System.in);
				  
				String vacationType = null; //Null value allows us to initialize a string variable from a later else if statement or a concatenation.
		        String result = null;
				int groupSize;
				
				System.out.println( "What type of vacation would you like to go on?");
				System.out.println( "Select from one of the following options:");
				System.out.print("Musical , Tropical, or Adventurous");
				
				vacationType = scnr.next(); //intializes the String vacationType
				
				System.out.println("You selected: "  +  vacationType);
				
				String vacationChoice=null; 
				//Needed to add this to initialize the string for the else if statement. This vacationType Else-if allows us to infer new Strings
				 // == / is not the same as .equals == compares the equality of the object .equals compares the equality of the logic details at base
				             if (vacationType.equals("Musical")) {
				                 vacationChoice = " to New Orleans";
				      } else if (vacationType.equals("Tropical")) {
				                 vacationChoice = " to a Beach in Mexico";
				      } if (vacationType.equals("Adventurous")) {
				            vacationChoice = " to go White Water Rafting in the Grand Canyon";
				      }
				 
				System.out.print( "Tell us how many people you are planning to travel with? (Include yourself in this number)");
				
				groupSize = scnr.nextInt(); //This is to collect the number of people. 
				
				System.out.println("You selected: "  + groupSize + " people.");
				
				String transportationChoice = null;
				
			                if (groupSize <= 2) {
		                        transportationChoice = "a First Class Flight";
		             } else if (groupSize <= 5) {
		                        transportationChoice = "a Helicopter";
		             } if      (groupSize >= 6) {
		                        transportationChoice = "a Charter Flight";
		             }
		             
		         result = ("" + "Since you are a group of " + groupSize + " people and want to go on a " + vacationType + " vacation.\n" + "We suggest that you take " + transportationChoice + vacationChoice + ".");
				
		         System.out.print(result);    
		           
				
				
				//Notes on equals. Below
				
				
				
				//Insert vacationType to Scanner to determine what type of vacation location.
				
				
				/*If-else statement that sorts the vacationType Selection for the output
				 == tests for reference equality (whether they are the same object).


				 *  */
		
	}

}
