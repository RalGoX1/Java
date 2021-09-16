public class SpeedAdapterImpl implements SpeedAdapter
{
  private Speed speed;

  public SpeedAdapterImpl(Speed speed)
  {
    this.speed=speed;
  }

  @Override
  public double getSpeed() {
    return convertMPHtoKMPH(speed.getSpeed());
  }

  private double convertMPHtoKMPH(double mph) {
    return mph * 1.60934;
  }
}

