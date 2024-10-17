import java.util.Scanner;

public class DevTest {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        int age = 0;
        int favNum = 0;
        double salary = 0;
        double constrained = 0; //must be between 100 and 10,000

        /*

        firstName = getNonZeroLenString(in, "Enter your first name");

        System.out.println("Fname is " + firstName);

         */

        /*

        age = getInt(in,"Enter your age");
        System.out.println("You said your age was " + age);

         */

        /*
        salary = getDouble(in, "Enter your salary");
        System.out.println("Salary is " + salary);

         */

        /*
        favNum = getRangedInt(in,"Enter your favorite number:" , 1, 10);
        System.out.println("Favenum: " +favNum);

         */

        constrained = getRangedDouble(in,"Enter the constrained double", 100, 10000) ;

    }

/* METHODS METHODS METHODS*/

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
     * @param pipe
     * @param prompt
     * @return
     */
    public static int getDouble(Scanner pipe, String prompt)
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

        return (int) retVal;
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
     * Prompts and recives integer from a range of int from user
     *
     * @param pipe Scanner for input
     * @param prompt prompts user for int within range
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