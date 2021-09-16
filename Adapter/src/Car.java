public class Car implements Speed
{
  private double speed;

  public Car (){

  }

  public double getSpeed()
  {
    return speed;
  }

  @Override public void setSpeed(double speed)
  {
    this.speed = speed;
  }
}
