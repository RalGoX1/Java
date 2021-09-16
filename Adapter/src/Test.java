import java.util.Scanner;

public class Test
{
  public static void main(String[] args)
  {
    Car carObject = new Car();
    SpeedAdapter carAdapter = new SpeedAdapterImpl(carObject);

    Scanner input = new Scanner(System.in);

    System.out.println("Enter speed of car in mph: ");
    carObject.setSpeed(Double.parseDouble(input.nextLine()));


    System.out.println("Entered speed in mph: " + carObject.getSpeed());
    System.out.println("Converted speed in kmh: " +carAdapter.getSpeed());
  }
}
