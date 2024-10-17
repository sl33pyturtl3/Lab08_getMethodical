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

    /**
     *
     * gets int value from user and console with no constraint
     * @param pipe scanner used for input
     * @param prompt prompts user for input
     * @return an int of any value
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        int retVal = 0;
        boolean done = false;
        String trash = "";

        do
        {
            System.out.print(prompt + ": ");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("Please enter a valid integer not " + trash);
            }

        }while(!done);

        return retVal;
    }

    /**
     * gets a double value through prompt and scanner
     *
     * @param pipe   scanner for double
     * @param prompt prompts for double
     * @return returns double
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        boolean done = false;
        String trash = "";

        do
        {
            System.out.print(prompt + ": ");
            if(pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("Please enter a valid double not " + trash);
            }

        }while(!done);

        return retVal;
    }
    /**
     * Prompts and recives integer from a range of int from user
     *
     * @param pipe Scanner for input
     * @param prompt prompts user for int within range
     * @param low the low inclusive low bound
     * @param high the high inclusive high bound
     * @return
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = 0;
        boolean done = false;
        String trash = "";

        do
        {
            System.out.print(prompt + "[" + low + " - " + high + "]: ");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if(retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a value within the range [" + low + " - " + high + "]: ");
                }

            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("Please enter a valid integer not " + trash);
            }

        }while(!done);

        return retVal;
    }

    /**
     * Prompts and recives double from a range of double from user
     *
     * @param pipe Scanner for input
     * @param prompt prompts user for double within range
     * @param low the low inclusive low bound
     * @param high the high inclusive high bound
     * @return returns a double within specified bounds
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retVal = 0;
        boolean done = false;
        String trash = "";

        do
        {
            System.out.print(prompt + "[" + low + " - " + high + "]: ");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextDouble();
                pipe.nextDouble();
                if(retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a value within the range [" + low + " - " + high + "]: ");
                }

            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("Please enter a valid double not " + trash);
            }

        }while(!done);

        return retVal;
    }
}
