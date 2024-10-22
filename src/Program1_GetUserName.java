import java.util.Scanner;
public class Program1_GetUserName
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");
        System.out.println("\nYour full name is: " + firstName + " " + lastName);

    }
    /**
     * gets a string from user using consol and it must be at least one character in length
     *
     * @param pipe a Scanner used to get input
     * @param prompt tells user what to enter
     * @return a String of at least one character in length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retVal = "";

        do
        {
            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();

            if (retVal.isEmpty())
                System.out.println("You must enter at least one character!");

        }while(retVal.isEmpty());

        return retVal;
    }
}
