import java.util.Scanner;

public class exercise19 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight:");

        //checking if input is a number
        if(!(input.hasNextDouble()))
        {
            System.out.println("That is not a valid number. Try again.");
            return;
        }
        String weight = input.next();
        double convWeight = Double.parseDouble(weight);

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter your height:");

        //checking if input2 is a number
        if(!(input2.hasNextDouble()))
        {
            System.out.println("That is not a valid number. Try again.");
            return;
        }
        String height= input2.next();
        double convHeight = Double.parseDouble(height);

        //calculating BMI
        double BMI = (convWeight / (convHeight * convHeight)) * 703;
        System.out.println("Your BMI is "+String.format("%.1f",BMI)+".");

        if(BMI <= 25 && BMI >= 18.5)
        {
            System.out.println("You are within the ideal weight range.");
        }
        else if (BMI < 18.5)
        {
            System.out.println("You are underweight. You should see your doctor.");
        }
        else
        {
            System.out.println("You are overweight. You should see your doctor.");
        }
    }
}