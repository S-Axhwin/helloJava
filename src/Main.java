import java.util.*;
public class Main
{
    public static void main(String []args)
    {
        /*Input the value states*/
        //Scanner in a interface which allow users in input values in terminal
        Scanner sc = new Scanner(System.in); //We create a instance of the Scanner class and pass it System.in

        System.out.println("Enter the number: "); //This will be the output message for the corresponding inputted value
        int num=sc.nextInt(); //converting the got value into a number to perform a specific task
        /*Processing and type conversion is done */
        int i=1,fact=1;

        //here is the logic to find the factorial of the give number
        while(i<=num)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of the number: "+fact);
    }
}