import java.util.Scanner;

public class Logic {
    public static void startApp() {
        while(true){
            System.out.println("Choose units to start with.\n(C - Celsius, F - Fahrenheits, K - Kelvins)");
            Scanner in0 = new Scanner(System.in);
            String startingUnits = in0.nextLine();

            System.out.println("What is your temperature?");
            Scanner in1 = new Scanner(System.in);
            double startingTemp = in1.nextInt();

            System.out.println("Which units do tou need?\n(C - Celsius, F - Fahrenheits, K - Kelvins)");
            Scanner in2 = new Scanner(System.in);
            String convertUnits = in2.nextLine();

            Temperature A = new Temperature(startingTemp, startingUnits, convertUnits);
            A.convert();


            System.out.println("Type \"exit\" to finish, or any key to continue.");
            Scanner in3 = new Scanner(System.in);
            String n = in3.nextLine();

            if(n.equalsIgnoreCase("exit")){
                break;
            }

        }

    }

    public static double convertCToF(double value) {
        // Converting Celsius to Fahrenheit.
        return (1.8*value + 32);
    }

    public static double convertCToK(double value) {

        return 273.15 + value;
    }

    public static double convertFToC(double value) {
        // Converting Fahrenheit to Celsius.
        return (value - 32) * (0.5555);
    }

    public static double convertFToK(double value) {
        // Converting Fahrenheit to Kelvins.
        return (value - 32) * (0.5555) + 273.15;
    }

    public static double convertKToC(double value) {
        // Converting Kelvins to Celsius.
        return value - 273.15;
    }

    public static double convertKToF(double value) {
        // Converting Kelvins to Fahrenheit.
        return (value - 273.15)*1.8 + 32;
    }

    public static double convertCToC(double originValue) {
        return originValue;
    }

    public static double convertFToF(double originValue) {
        return originValue;
    }

    public static double convertKToK(double originValue) {
        return originValue;
    }
}
