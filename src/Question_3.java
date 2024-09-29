import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Enter length in Centimeters :");
        double len = x.nextDouble();  //getting input in cm
        double inch = len/2.54;       // convert cm to inches

        int feet = (int)inch/12;      // convert cm to feet

        inch = inch-feet*12;          //set remaining length as inches
        System.out.println("Length is: "+feet + " feet " + "and " + String.format("%.2f",inch) + " inches");


    }
}
