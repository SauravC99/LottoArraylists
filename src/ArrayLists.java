/*
1. Saurav Chhapawala
2. 9/17/2018
3. This program generates an Arraylist of 6 unique numbers from 1-49 inclusive.
   It represents lottery numbers being generated.
4. There are no inputs required for this class
5. This class does not output anything, all inputs and outputs are handled in the test class.
 */

import java.util.*;

public class ArrayLists
{
    private ArrayList<Integer> numbers;

    public ArrayLists()
    {
        numbers = new ArrayList<Integer>(6);
    }

    public void generate() //This method will generate random numbers and add them to the Arraylist
    {
        for(int i = 0; i < 6; i ++)
        {
            int a = (int)((Math.random() * 49) + 1); //Generates a number between 1 and 49 inclusive.
            numbers.add(a);
        }
    }

    public boolean checkUnique() //This method will check to see if all of the numbers in the arraylist are unique. It will return true if they are, and false if they are not.
    {
        for(int i = 0; i < numbers.size(); i++)
        {
            for(int j = 0; j < numbers.size(); j++)
            {
                if(i != j) //So it doesn't check the same number
                {
                    int a = numbers.get(i);
                    int b = numbers.get(j);
                    if (a == b)
                        return false; //False if match is found
                }
            }
        }
        return true; //True if no matches
    }

    public void order() //This method orders the Arraylist in an ascending order.
    {
        Collections.sort(numbers);
    }

    public void scrub() //This method will erase the ArrayList so we can reuse it. It prevents us from having to make a new object each time.
    {
        for(int i = numbers.size() - 1; i >= 0; i--)
        {
            numbers.remove(i);
        }
    }

    public String toString() //This is the toString method, we overwrote the default toString method.
    {
        return numbers.toString();
    }

}