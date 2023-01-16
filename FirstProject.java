import java.util.Scanner;

public class FirstProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ask for user's name
        System.out.print("What is your name: ");
        String name = scanner.nextLine();

        // ask for user's height in feet and inches
        System.out.print("What is your height in feet: ");
        int heightFeet = scanner.nextInt();
        System.out.print("What is your height in inches: ");
        int heightInches = scanner.nextInt();

        // convert height to inches
        int heightInInches = (heightFeet * 12) + heightInches;

        // ask for user's weight in pounds
        System.out.print("What is your weight in pounds: ");
        double weightPounds = scanner.nextDouble();

        // calculate BMI
        double bmi = (weightPounds / (heightInInches * heightInInches)) * 703;

        // output results
        System.out.println("Name: " + name);
        System.out.println("BMI: " + bmi);

        // indicate category
        if (bmi < 19) {
            System.out.println("You are underweight.");
        } else if (bmi >= 19 && bmi <= 24.9) {
            System.out.println("You are at a healthy weight.");
        } else if (bmi >= 25 && bmi <= 30) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
    }
}
