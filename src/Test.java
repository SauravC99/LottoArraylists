/*
1. Saurav Chhapawala
2. 9/17/2018
3. This is the test class, it implements and runs everything in the ArrayLists class.
4. The only input required is the number of sets of tickets the user wants to generate.
5. This class will output however many number of tickets the user chose.
 */

import java.util.Scanner;

public class Test
{
    public static void main(String args[])
    {
        System.out.println("How mant sets?"); //Asks how many sets of tickets the user wants.
        Scanner scan = new Scanner(System.in);
        int numSet = scan.nextInt(); //Gets the number of tickets.

        ArrayLists ar = new ArrayLists(); //Creates a new ArrayLists object

        for(int i = 0; i < numSet; i++) //Will loop how many times the user wants.
        {
            ar.generate(); //Fills the arraylist with values.
            if(ar.checkUnique()) //Will check if the values are unique. It will only go inside the if statement if they are.
            {
                ar.order(); //Will order the ArrayList in ascending order.
                System.out.println("Pick " + (i + 1) +": " + ar); //Prints out in a visually pleasing way.
            }
            else
                i--; //This is needed because if the ArrrayList is not unique,
            //the counter will still increment, but will not print anything out. This ensures the correct number of tickets are printed.

            ar.scrub(); //This clears the ArrayList, so we don't need to make a new object every time we want to generate a ticket.
        }

    }

}
