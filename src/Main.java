import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double meters;
        double miles;
        double feet;
        double inches;
        System.out.println("distance in meters?");
        if (in.hasNextDouble())
        {
            meters = in.nextDouble();
            miles = meters / 1609;
            feet = meters * 3.281;
            inches = meters * 39.37;
            System.out.println(meters + " meters is " + miles + " mi " + feet + " ft " + inches + " in");
        }
        else
        {
            System.out.println("invalid entry");
        }
    }
}