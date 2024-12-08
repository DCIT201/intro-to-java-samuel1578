import java.awt.*;
import java.util.Scanner;
public class TemperatureConvertor {

    public static double toFarenheit(double x){
        return ( x * 9/5) + 32;
    }
    public static double toCelcius(double y){
        return ((y - 32) * 5/9);
    }

    public static void main(String[] args) {
        System.out.println("Hello, Welcome to the convertor app!");
        System.out.println("This app converts temperatures from Faranheits to Celcius and vice versa");

        int choice;
        double tempC, tempF;
        Scanner Input = new Scanner(System.in);
         choice = 0;

        while (true) {
            System.out.println("Choose from the following options:");
            System.out.println("1. Convert Celcius to Farenheits: ");
            System.out.println("2. Convert Farenheits to Celcius: ");
            System.out.println("Enter a choice");

            if (Input.hasNextInt()) {
                choice = Input.nextInt();

                if (choice == 1 || choice == 2) {
                    break;
                } else {
                    System.out.println("Invalid choice, Please try again");
                }
            } else {
                System.out.println("Invalid Input, Please Enter 1 or 2");
                Input.next();
                    }
        }

        if (choice == 1){
            Scanner In = new Scanner(System.in);
            tempC =0.0;
            while(true){
                System.out.println("Enter the temperature in Celcius");
                tempC = In.nextDouble();
                if (tempC > 100.0){
                    System.out.println("You Entered a very high temperature, Please try again");
                } else if (tempC < -100.0){
                    System.out.println("You Entered a very low temperature, Please try again");
                } else {
                    System.out.println("You Entered " +tempC +" C");
                    toFarenheit(tempC);
                    System.out.println(+tempC + " C is equal to " + toFarenheit(tempC) + " F");
                }
            }
        }else {
            Scanner scanner = new Scanner(System.in);
            tempF =0.0;
            while(true) {
                System.out.println("Enter the temperature in Farenheits");
                tempF = scanner.nextDouble();
                if (tempF > 136.4) {
                    System.out.println("You Entered a very high temperature, Please try again");
                } else if (tempF < -128.2) {
                    System.out.println("You Entered a very low temperature, Please try again");
                } else {
                    System.out.println("You Entered " + tempF + " F");
                    toCelcius(tempF);
                    System.out.println(+tempF + " F is equal to " + toCelcius(tempF) + " C");
                }
            }

        }

    }
    }