import java.util.Scanner;

public class SafeInput
{

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
