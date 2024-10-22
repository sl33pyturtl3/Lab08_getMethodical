import java.util.Scanner;

public class Program3_BirthDateTime
{
    public static void main(String[] args)
    {
        {
            Scanner in = new Scanner(System.in);
            int years = 0;
            int months = 0;
            int days = 0;
            int hours = 0;
            int minutes = 0;


            years = SafeInput.getRangedInt(in, "Enter the year you were born", 1950, 2015);
            months = SafeInput.getRangedInt(in, "Enter the month you were born", 1, 12);
            days = SafeInput.getRangedInt(in, "Enter the day you were born", 1, 7);
            hours = SafeInput.getRangedInt(in, "Enter the hour you were born", 1, 24);
            minutes = SafeInput.getRangedInt(in, "Enter the minute you were born", 1, 59);

            System.out.println("You were born on: " + years + "/" + months + "/" + days + "At: " + hours + ":" + minutes);

        }
    }
    /**
     * Prompts and recives integer from a range of int from user
     *
     * @param pipe Scanner for input
     * @param prompt prompts user for int within range
     * @param low the low inclusive low bound
     * @param high the high inclusive high bound
     * @return returns user val
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
}
