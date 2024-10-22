import java.util.Scanner;
public class Program2_FavNumbers
{
    public static void main(String[] args)
    {
        {
            Scanner in = new Scanner(System.in);
            int faveNum = 0;
            double faveDouble = 0.0;
            faveNum = SafeInput.getInt(in, "Enter your favorite number");
            faveDouble = SafeInput.getDouble(in, "Enter your favorite double");
            System.out.println("Your favorite number is: " + faveNum);
            System.out.println("Your favorite double is: " + faveDouble);


        }
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
}
