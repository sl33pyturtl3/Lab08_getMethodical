import java.util.Scanner;

public class Program4_CheckOut
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
}
